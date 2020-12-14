package com.cjw.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
@ComponentScan(basePackages = {"com.cjw"})
@MapperScan(basePackages = {"com.cjw.dao"})
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableTransactionManagement
public class ApplicationConfig {

    @Bean
    public DataSource dataSource(DBProperties dbProperties){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(dbProperties.getDriverClassName());
        druidDataSource.setUrl(dbProperties.getUrl());
        druidDataSource.setUsername(dbProperties.getUser());
        druidDataSource.setPassword(dbProperties.getPwd());
        druidDataSource.setInitialSize(3);
        druidDataSource.setMinIdle(3);
        druidDataSource.setMaxActive(10);
        return druidDataSource;
    }

    @Bean
    public MybatisSqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws IOException {
        MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        //设施mybatis数据源
        sqlSessionFactory.setDataSource(dataSource);
        //设置mybatis全局配置路径
        sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis-configuration.xml"));
        //mapper文件的位置
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactory.setMapperLocations(resolver.getResources("mapper/*.xml"));
        sqlSessionFactory.setTypeAliasesPackage("com.cjw.po");
        return sqlSessionFactory;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager tx = new DataSourceTransactionManager();
        tx.setDataSource(dataSource);
        return tx;
    }
}

package com.cjw.proxy;

public class UserProxy implements UserDao{
    private UserDaoImpl userDaoImpl;

    public UserProxy(UserDaoImpl userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Override
    public void add() {
        System.out.println("静态代理开始");
        userDaoImpl.add();
        System.out.println("静态代理结束");

    }
}

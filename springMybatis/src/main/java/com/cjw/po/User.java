package com.cjw.po;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@Component
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Date regTime;

    public User() {
    }

    public User(Integer id, String username, String password, String nickname, Date regTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.regTime = regTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", regTime=" + regTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }
}

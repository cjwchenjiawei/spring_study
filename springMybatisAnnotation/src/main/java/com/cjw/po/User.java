package com.cjw.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component("user")
@Data
public class User implements Serializable {
    private Integer id;

    private String nickname;

    private String username;

    private String password;

    private Date regTime;

    private static final long serialVersionUID = 1L;
}
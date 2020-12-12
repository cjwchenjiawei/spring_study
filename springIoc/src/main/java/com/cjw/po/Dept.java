package com.cjw.po;

import lombok.Data;

@Data
public class Dept {
    private int id;
    private String deptName;

    public Dept() {
    }

    public Dept(int id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }
}

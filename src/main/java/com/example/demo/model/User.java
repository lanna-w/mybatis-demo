package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
//import com.gitee.sunchenbin.mybatis.actable.annotation.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Table(name = "tb_user")
public class User implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -8720709928795156685L;

    @Id
    private long id;
    
    @Column
    private String username;
    
    @Column
    private String password;
}

package com.imooc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Sim
 * @create 2019-03-06 11:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String userName;
    private String userPassword;

}

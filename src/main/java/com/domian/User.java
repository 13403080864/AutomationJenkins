package com.domian;

import lombok.Data;

/**
 * @author wq
 * @since 2022-05-02 上午9:22
 */
@Data
public class User {

    private Integer id;
    private String userName;
    private String password;
    private Integer age;
    private String sex;
    private Integer isDelete;
}

package com.dao;

import com.domian.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author wq
 * @since 2022-05-02 上午9:25
 */
@Mapper
public interface UserDao {

    public List<User> findAll();

    User findById(Integer id);
}

package com.service;

import com.dao.UserDao;
import com.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wq
 * @since 2022-05-02 上午9:27
 */
@Service
public interface UserService {

    public List<User> findAll();

    User findById(Integer id);

}

package club.kwzw.service.impl;

import club.kwzw.dao.UserMapper;
import club.kwzw.bean.User;
import club.kwzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public List<User> findAll() {
        System.out.println("查询所有用户。。。");
        return userDao.queryAll();
    }
}

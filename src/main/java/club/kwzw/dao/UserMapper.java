package club.kwzw.dao;

import club.kwzw.bean.User;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {


    public List<User> queryAll();

}

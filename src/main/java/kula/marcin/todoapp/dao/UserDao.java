package kula.marcin.todoapp.dao;

import kula.marcin.todoapp.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}

package com.wugd.springcloud.service;

import com.wugd.springcloud.dao.UserRepository;
import com.wugd.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {



    @Autowired
    private UserRepository userRepository;


    @Override
    public User login(String name, String password) {
        return userRepository.findByNameAndPassword(name,password);
    }

    @Override
    public User register(User user) {
        return userRepository.save(user);
    }

    @Override
    public void writeOff(User user) {
        userRepository.delete(user);
    }

    @Override
    public boolean isExists(User user) {
        return userRepository.findOne(user.getId())!=null?true:false;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findOne(id);
    }
}

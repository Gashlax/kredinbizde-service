package com.patika.kredinbizdeservice.service;

import com.patika.kredinbizdeservice.model.Application;
import com.patika.kredinbizdeservice.model.User;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserService2 implements IUserService {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public User update(String email, User user) {
        return null;
    }

    @Override
    public List<Application> getApplicationListByUser(String email) {return null;}

    @Override
    public Application createApplication(Application application) {
        return null;
    }
}

package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Application;

import java.util.ArrayList;
import java.util.List;

public class  ApplicationRepository{

    private List<Application> applicationList = new ArrayList<>();

    public void save(Application application) {
        applicationList.add(application);
    }

    public List<Application> getAll() {
        return applicationList;
    }

    public void delete(Application application) {
        applicationList.remove(application);
    }
}

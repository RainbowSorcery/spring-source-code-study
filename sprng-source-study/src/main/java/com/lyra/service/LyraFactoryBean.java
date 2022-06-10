package com.lyra.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

public class LyraFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}

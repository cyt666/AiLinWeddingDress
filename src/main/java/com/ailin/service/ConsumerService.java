package com.ailin.service;


import com.ailin.model.Consumer;

public interface ConsumerService {
    //注册新用户
    public int createConsumer(Consumer consumer);

    public Consumer findConsumerService(String userName);
}

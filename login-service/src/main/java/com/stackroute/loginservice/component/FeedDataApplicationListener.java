package com.stackroute.loginservice.component;

import com.stackroute.loginservice.domain.User1;
import com.stackroute.loginservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class FeedDataApplicationListener implements ApplicationListener<ContextRefreshedEvent> {




    private UserRepository userRepository;

    @Autowired
    public FeedDataApplicationListener(UserRepository userRepository)
    {
        this.userRepository=userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent)
    {

     userRepository.save(new User1(1,"admin12345", "123","Client"));

    }

}

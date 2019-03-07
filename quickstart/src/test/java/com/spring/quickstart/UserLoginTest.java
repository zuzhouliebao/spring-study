package com.spring.quickstart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/3/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/beans.xml"})
public class UserLoginTest {
    @Autowired
    private User user;
    @Test
    public void userLogin(){
        UserLogin userLogin=new UserLogin();
       assertEquals(true,userLogin.userLogin(user));

    }

}
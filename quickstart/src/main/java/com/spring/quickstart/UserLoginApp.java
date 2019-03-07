package com.spring.quickstart;

/**
 * Created by Administrator on 2019/3/4.
 */

        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
public class UserLoginApp {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        UserLogin userLogin = context.getBean(UserLogin.class);
        System.out.println(userLogin);
    }
}

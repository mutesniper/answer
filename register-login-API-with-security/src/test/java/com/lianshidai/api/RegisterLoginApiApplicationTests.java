package com.lianshidai.api;

import com.lianshidai.api.bean.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RegisterLoginApiApplicationTests {


    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("漳卅");
        System.out.println(user.getUsername());
    }

}

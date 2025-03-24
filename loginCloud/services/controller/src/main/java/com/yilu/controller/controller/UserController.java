package com.yilu.controller.controller;


import com.yilu.login.bean.User;
import com.yilu.login.common.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;

    @PostMapping("/controller")
    public R login(@RequestBody User user) {
        String url="http://loginAPI/login";
        HttpEntity<User> request = new HttpEntity<>(user);
        ResponseEntity<R> response=restTemplate.exchange(url, HttpMethod.POST,request,R.class);
        return response.getBody();
    }

}


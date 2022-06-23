package com.crm.erp.erp.Controller;

import com.crm.erp.erp.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("crm-erp/api/v1/")
public class AuthenticationController {

    @Autowired
    private AuthService authService;


    @PostMapping("login/")
    public String loginUser(@RequestParam Map<String, String> login) {
        return authService.loginUser(login);
    }


    @PostMapping("register/")
    public String register(@RequestParam Map<String, String> user) {
        return authService.register(user);
    }
}


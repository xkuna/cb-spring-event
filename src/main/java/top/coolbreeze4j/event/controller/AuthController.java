package top.coolbreeze4j.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.coolbreeze4j.event.service.AuthService;

import java.util.Map;

/**
 * @author CoolBreeze
 * @date 2023/7/17 11:49.
 */
@RestController
public class AuthController {
    @Autowired
    AuthService authService;

    @RequestMapping("/register")
    public Map<String,Object> register(){
        Map<String, Object> result = authService.register();
        return result;
    }
}

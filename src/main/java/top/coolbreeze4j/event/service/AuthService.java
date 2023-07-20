package top.coolbreeze4j.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.coolbreeze4j.event.handle.SmsHandle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CoolBreeze
 * @date 2023/7/17 11:51.
 */
@Service
public class AuthService {
    @Autowired
    SmsHandle smsHandle;

    public Map<String, Object> register() {
        //注册操作......
        System.out.println(Thread.currentThread().getName());
        //注册成功 异步发送短信给用户
        smsHandle.sendRegisterSuccessSms("菜嘘昆","10086");

        //返回信息
        return new HashMap<>();
    }
}

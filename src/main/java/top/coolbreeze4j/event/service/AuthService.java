package top.coolbreeze4j.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import top.coolbreeze4j.event.entity.User;
import top.coolbreeze4j.event.event.RegisterSuccessEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * @author CoolBreeze
 * @date 2023/7/17 11:51.
 */
@Service
public class AuthService {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    public Map<String, Object> register() {
        //注册操作......

        //注册成功 异步发送短信给用户
        sendRegisterSuccessSms("菜嘘昆","10086");

        //返回信息
        return new HashMap<>();
    }

    /**
     * 异步解耦 发送事件进行短信发送
     */
    @Async
    public void sendRegisterSuccessSms(String username, String phone) {
        try {
            //测试异步效果
            Thread.sleep(2000);
            //发送事件
            applicationEventPublisher.publishEvent(new RegisterSuccessEvent(new User(username, phone)));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

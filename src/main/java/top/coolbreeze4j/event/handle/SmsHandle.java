package top.coolbreeze4j.event.handle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import top.coolbreeze4j.event.entity.User;
import top.coolbreeze4j.event.event.RegisterSuccessEvent;

/**
 * @author CoolBreeze
 * @date 2023/7/20 15:03.
 */
@Component
public class SmsHandle {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    /**
     * 异步解耦 发送事件进行短信发送
     */
    @Async
    public void sendRegisterSuccessSms(String username, String phone) {
        try {
            System.out.println(Thread.currentThread().getName());
            //测试异步效果
            Thread.sleep(10000);
            //发送事件
            applicationEventPublisher.publishEvent(new RegisterSuccessEvent(new User(username, phone)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

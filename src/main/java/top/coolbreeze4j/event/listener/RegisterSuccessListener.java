package top.coolbreeze4j.event.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import top.coolbreeze4j.event.entity.User;
import top.coolbreeze4j.event.event.RegisterSuccessEvent;

/**
 * @author CoolBreeze
 * @date 2023/7/17 14:43.
 */
@Component
public class RegisterSuccessListener {
//    @Async //此处也可以异步
    @EventListener
    public void eventListener(RegisterSuccessEvent event){
        //接收到事件  进行短信发送
        User user = (User) event.getSource();
        System.out.println("用户【" + user.getUsername() + "】注册成功，" +
                "正在向移动号码【" + user.getPhone() + "】发送短信......");
    }
}

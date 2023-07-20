package top.coolbreeze4j.event.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author CoolBreeze
 * @date 2023/7/17 11:54.
 */
public class RegisterSuccessEvent extends ApplicationEvent {
    public RegisterSuccessEvent(Object source) {
        super(source);
    }
}

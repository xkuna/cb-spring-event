package top.coolbreeze4j.event.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author CoolBreeze
 * @date 2023/7/17 14:58.
 */
@Data
@AllArgsConstructor
public class User {
    private String username;
    private String phone;
}

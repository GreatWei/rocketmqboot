package com.example.rocketmqboot.two.bean;

import lombok.*;
import lombok.experimental.Accessors;

@ToString
//@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
@Getter
@Setter
public class User {
    private String id;
    private String username;
}

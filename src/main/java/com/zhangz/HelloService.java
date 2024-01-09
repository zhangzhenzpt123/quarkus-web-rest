package com.zhangz;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public Uni<String> say(String message){
        return Uni.createFrom().item("Hello " + message);
    }
}

package com.savk.workout.spring.springdemochild;

import com.savk.workout.spring.springdemoparent.AccessAPI;
import org.springframework.stereotype.Service;

@Service
public class AccessAPIImpl implements AccessAPI {
    @Override
    public void call() {
        System.out.println("Executing from AccessAPIImpl");
    }
}

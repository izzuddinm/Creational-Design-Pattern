package com.exercise.spring_design_pattern_creational.singleton;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

@Data
@Component
@Accessors(chain = true)
public class Counter {

    private Long value;

    public Long getValue() {
        return this.value;
    }

    public void increment () {
        value++;
    }

}

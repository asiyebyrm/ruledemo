package org.england.ruledemo;

import org.springframework.stereotype.Component;

@Component
public class TaskImpl implements Task{

    @Override
    public void example() {
        System.out.println("Test for rule");
    }
}

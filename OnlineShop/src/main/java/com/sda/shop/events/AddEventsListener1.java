package com.sda.shop.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AddEventsListener1 implements ApplicationListener<AddCategoryEvent> {


    @Override
    public void onApplicationEvent(AddCategoryEvent event) {
        System.out.println(getClass().getSimpleName() + event);
    }


}

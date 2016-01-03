package com.huawei.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huawei.model.Greeting;

@RestController
public class GreetingController 
{
	private static final Logger log = LoggerFactory.getLogger(GreetingController.class);
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) 
    {
        log.info("invoke the greeting service");
    	
    	return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}

package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello im Controller index!";
    }

    @RequestMapping("/list")
    public List<String> getList() {
        return Arrays.asList(new String[]{"List1","List2","List3"});
    }

    @RequestMapping("/json")
    public JsonData getJson() {
        JsonData jsonData = new JsonData();
        jsonData.setName("李二狗");
        jsonData.setEmail("bolvardev666@gmail.com");
        return jsonData;


    }
}

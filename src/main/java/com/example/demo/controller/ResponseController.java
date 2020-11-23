package com.example.demo.controller;

import com.example.demo.model.Response;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ResponseController {


    @PostMapping(value = "/final_response", consumes = "application/json")
    @ResponseBody
    public Response message(@RequestBody Response response) {
        System.out.println("Response " +response);

        return response;
    }




}

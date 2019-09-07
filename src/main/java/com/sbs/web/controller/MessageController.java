package com.sbs.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageController {

    @Autowired
    RestTemplate restTemplate;
    
 // sessionID
    private static final String AUTHORIZATION = "sessionId";

    @GetMapping("/show")
    public String showMessage(){
    	String requestGET = requestGET("/hello");


        System.out.println(requestGET);
        return requestGET;
    	
    }
    @GetMapping("/show2")
    public String showMessage2(){
    	HttpEntity<Object> requestEntity = new HttpEntity<>(setHttpHeaders());
        ResponseEntity<String> rest = restTemplate.exchange("http://api-er/mybatisTest", 
        		HttpMethod.GET, requestEntity, String.class);
        return rest.getBody();
    }
    
    private String requestGET(String url){
        HttpEntity<Object> requestEntity = new HttpEntity<>(setHttpHeaders());
        ResponseEntity<String> rest = restTemplate.exchange("http://api-er/login?username=test&password=123", 
        		HttpMethod.GET, requestEntity, String.class);
        return rest.getBody();
    }
    /**
     * *设置请求消息头
     */
    private static HttpHeaders setHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-type", "application/json;charset=utf-8;Accept:application/json;");// 设置编码 这个一定不能去
        headers.add("Authorization", AUTHORIZATION);
        headers.add("Cookie", "JSESSIONID=b8911150-3558-40ae-9a6c-f2e11c4f660b");
        return headers;
    }
}

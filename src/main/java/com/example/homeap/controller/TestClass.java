package com.example.homeap.controller;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestClass {

    @RequestMapping("/home")
    public String home(){
        return "testPage";
    }

    @RequestMapping("/test1")
    public void gsontest(){

        Gson gsonObj = new Gson();

        Map<String, String> inputMap = new HashMap<String, String>();
        inputMap.put("name", "roll");
        inputMap.put("blog", "https://mylupin.tistory.com/40?category=766957");

        // MAP -> JSON 예제
        String jsonStr = gsonObj.toJson(inputMap);
        System.out.println("MAP -> JSON 예제 : " + jsonStr);

        // MAP -> JSON 예제
        Map map = gsonObj.fromJson(jsonStr, Map.class);
        System.out.println("JSON -> MAP 예제 : " + map.toString());
    }

    @RequestMapping("/test2")
    public void gsontest2(){
        // JsonObject 생성
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "roll");
        jsonObject.addProperty("blog", "https://mylupin.tistory.com/40?category=766957");
        jsonObject.addProperty("boolean", true);
        jsonObject.addProperty("int", 12345);

        System.out.println("JsonObject 생성 : " + jsonObject.toString() + "\n");

        // String 리턴
        System.out.println("JsonObject name(String) : " + jsonObject.get("name").getAsString());
        System.out.println("JsonObject blog(String) : " + jsonObject.get("blog").getAsString());

        // boolean 리턴
        System.out.println("JsonObject boolean(boolean) : " + jsonObject.get("boolean").getAsBoolean());

        // int 리턴
        System.out.println("JsonObject int(int) : " + jsonObject.get("int").getAsInt());
    }

    @RequestMapping("/test3")
    public void gsontest3(){

        // Parse Pretty
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        // JsonObject 생성
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "roll");
        jsonObject.addProperty("blog", "https://mylupin.tistory.com/40?category=766957");
        jsonObject.addProperty("boolean", true);
        jsonObject.addProperty("int", 12345);

        System.out.println("JsonObject 생성 : " + jsonObject.toString() + "\n");

        // JsonArray 생성
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(jsonObject);

        System.out.println(jsonArray.toString());

        // GsonBuilder옵션입니다.
        System.out.println(gson.toJson(jsonObject));
    }

    @RequestMapping("/test4")
    public void gsontest4(){
        // JsonObject 생성
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "roll");
        jsonObject.addProperty("blog", "https://mylupin.tistory.com/40?category=766957");
        jsonObject.addProperty("boolean", true);
        jsonObject.addProperty("int", 12345);

        System.out.println("JsonObject 생성 : " + jsonObject.toString() + "\n");

        // Parse Pretty
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(jsonObject);

        System.out.println(jsonOutput);

    }

}

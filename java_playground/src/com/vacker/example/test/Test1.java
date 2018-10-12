package com.vacker.example.test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Long> ids = new ArrayList<>();
        ids.add((long)1);
        ids.add((long)2);
        ids.add((long)3);
        String idsStr = ids.toString();
        System.out.println(idsStr);


        try {
            ObjectMapper objectMapper = new ObjectMapper();
            TypeReference<List<Long>> mapType = new TypeReference<List<Long>>() {};
            List<Long> idTemp =  objectMapper.readValue(idsStr, mapType);
            idTemp.forEach(id -> {
                System.out.println("ID ::::: "+id);
            });

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

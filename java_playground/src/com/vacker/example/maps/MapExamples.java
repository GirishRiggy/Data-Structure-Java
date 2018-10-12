package com.vacker.example.maps;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        StringBuilder imgPreviewPath = new StringBuilder();

        map.put("a", "ddfdd");
        map.put("b", "ddfdd");
        map.put("c", "ddfdd");
        map.put("d", "ddfdd");
        map.put("e", "ddfdd");


        //System.out.println(map.get("z"));

        System.out.println(framePreviewPath(imgPreviewPath, imgPreviewPath.toString()));

    }

    private static String framePreviewPath(StringBuilder imgPreviewPath, String imagePreviewPathDb) {

        return imgPreviewPath.toString() == null ?
                imagePreviewPathDb : imgPreviewPath.append("/")
                .append(imagePreviewPathDb).toString().trim();
    }
}
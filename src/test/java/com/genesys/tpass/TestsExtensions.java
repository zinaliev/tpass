package com.genesys.tpass;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;

public class TestsExtensions {

    private final static ObjectMapper MAPPER;

    static {
        MAPPER = new ObjectMapper();
        MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static String getTestResourceLocation(String resourceName){
        ClassLoader classLoader = TestsExtensions.class.getClassLoader();
        File file = new File(classLoader.getResource(resourceName).getFile());
        return file.getAbsolutePath();
    }

    public static String asJson(Object obj) throws Exception {
        return MAPPER.writeValueAsString(obj);
    }
}

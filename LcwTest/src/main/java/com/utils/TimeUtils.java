package com.utils;


import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

public class TimeUtils {

//获取当前时间 戳格式
    @Test
    public String convertCurrentTimeMills() {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sd.format(System.currentTimeMillis());

        return sd.format(System.currentTimeMillis());
    }

    @Test
    public void print(){

        System.out.println(convertCurrentTimeMills());

    }


}

package com.yangtao.www.class5;

/**
 * @author CoderYT
 * @date 2020/5/15
 **/
public class Test {
    Gender gender = Gender.女;
    Gender gender2 = Gender.男;

    public static void main(String[] args) {
        EventEnum ee = EventEnum.LAUNCH;
        ee.show();
        String name = EventEnum.PAGEVIEW.name();
        System.out.println(name);
    }
}

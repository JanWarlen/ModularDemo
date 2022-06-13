package com.janwarlen.service;

import com.janwarlen.modular.common.StringUtil;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Package 'com.janwarlen.modular.intern' is declared in module 'common', which does not export it to module 'service'
//import com.janwarlen.modular.intern.PrivateUtil;

public class ServiceDemo {

    public static void main(String[] args) {
        StringUtil.hello();
        StringUtil.test();
//        PrivateUtil.access();

        // As of Java 9, '_' is a keyword, and may not be used as an identifier
        String _1 = new String("1");
        String _2 = new String("2");

        saveVarargs(_1, _2, 3);

        Pattern compile = Pattern.compile("[^a-b[c-d]e-f]");
        Matcher c = compile.matcher("c");
        // JDK8 true
        System.out.println(c.matches());


        System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory()/ (1024 * 1024));
        System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory()/ (1024 * 1024));
        System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory()/ (1024 * 1024));
    }

    @SafeVarargs
//  Possible heap pollution from parameterized vararg type
    private static  <T> void saveVarargs(T... params) {
        Arrays.stream(params).forEach(System.out::println);
    }
}

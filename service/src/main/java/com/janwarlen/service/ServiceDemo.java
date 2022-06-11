package com.janwarlen.service;

import com.janwarlen.modular.common.StringUtil;
// Package 'com.janwarlen.modular.intern' is declared in module 'common', which does not export it to module 'service'
//import com.janwarlen.modular.intern.PrivateUtil;

public class ServiceDemo {

    public static void main(String[] args) {
        StringUtil.hello();
        StringUtil.test();
//        PrivateUtil.access();
    }
}

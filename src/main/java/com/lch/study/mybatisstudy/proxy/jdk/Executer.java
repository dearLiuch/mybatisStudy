/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.lch.study.mybatisstudy.proxy.jdk;

public class Executer {
    public static void main(String[] args) {
        JdkProxy<MessageService> jdkProxy = new JdkProxy();
        MessageService messageService = jdkProxy.getProxy(new MessageServiceImpl());
        messageService.sendMessage();
    }
}







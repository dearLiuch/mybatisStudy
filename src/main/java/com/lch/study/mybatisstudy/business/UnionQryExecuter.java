/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.lch.study.mybatisstudy.business;

import com.lch.study.mybatisstudy.mapper.MessageMapper;
import com.lch.study.mybatisstudy.mapper.UserMapper;
import com.lch.study.mybatisstudy.util.SqlSessionFactoryUtil;
import com.lch.study.vo.Message;
import com.lch.study.vo.User;
import org.apache.ibatis.session.SqlSession;

/**
 * Date 2020/10/31 8:17 下午
 */
public class UnionQryExecuter {

    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        MessageMapper messageMapper = sqlSession.getMapper(MessageMapper.class);
        Message message = messageMapper.getMessageAndMessageDetailById(2L);
        System.out.println("getMessageAndMessageDetailById--->" + message);

        //        MessageMapper messageMapper = sqlSession.getMapper(MessageMapper.class);
        //        Message message = messageMapper.getMessageAndMessageDetailById1(2L);
        //        System.out.println("getMessageAndMessageDetailById1--->" + message);

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getAllMessage(1L);
        System.out.println("getAllMessage--->" + user);

        //        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //        User user = userMapper.getUserAndContactById(1L);
        //        System.out.println("getUserAndContactById--->" + user);
    }
}

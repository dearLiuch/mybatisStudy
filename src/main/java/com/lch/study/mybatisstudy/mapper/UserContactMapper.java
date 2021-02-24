/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.lch.study.mybatisstudy.mapper;

import com.lch.study.vo.UserContact;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Date 2020/11/1 9:32 下午
 */
public interface UserContactMapper {

    List<UserContact> getUserContactByUserId(@Param("userId") Long userId);
}

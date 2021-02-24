/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.lch.study.mybatisstudy.mapper;

import com.lch.study.vo.MessageDetail;
import org.apache.ibatis.annotations.Param;

public interface MessageDetailMapper {

    MessageDetail getMessageByMsgId(@Param("msgId") String msgId);

    MessageDetail getMessageByMsgIdAndCreateTime(@Param("msgId") String msgId, @Param("content") String content);
}

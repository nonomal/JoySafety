// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.core.session;


public enum ResponseMode {
    /**
     * 同步返回
     */
    sync,

    /**
     * 通过同一会话的后续请求顺带返回结果
     */
    free_taxi,

    /**
     * 消息队列方式返回
     */
    mq,

    /**
     * 通过防御系统的api获取结果
     */
    http
}

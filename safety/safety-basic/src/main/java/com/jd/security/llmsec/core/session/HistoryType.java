// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 JD.com

package com.jd.security.llmsec.core.session;



public enum HistoryType {
    /**
     * 用户消息
     */
    user,

    /**
     * 机器人/大模型消息
     */
    robot,

    /**
     * 系统消息
     */
    system
}

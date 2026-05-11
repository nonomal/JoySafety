// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.core;

import lombok.Builder;
import lombok.Data;



@Data
public class RequestBase {
    /**
     * 请求发起的时间戳(毫秒)
     */
    private long timestamp;

    /**
     * 请求的唯一标识
     */
    private String requestId;
}

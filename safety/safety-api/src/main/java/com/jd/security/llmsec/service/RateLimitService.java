// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.service;



public interface RateLimitService {
    boolean hasLimit(String accessKey, String accessTarget);
}

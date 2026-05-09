// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 JD.com

package com.jd.security.llmsec.service;



public interface RateLimitService {
    boolean hasLimit(String accessKey, String accessTarget);
}

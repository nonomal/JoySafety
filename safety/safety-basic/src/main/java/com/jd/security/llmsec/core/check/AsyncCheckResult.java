// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.core.check;

import lombok.Data;


@Data
public class AsyncCheckResult extends RiskCheckResult{
    @Override
    public RiskCheckType type() {
        return RiskCheckType.async;
    }
    private RiskCheckResult result;
}

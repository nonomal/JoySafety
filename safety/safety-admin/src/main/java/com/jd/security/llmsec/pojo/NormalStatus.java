// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 JD.com

package com.jd.security.llmsec.pojo;



public enum NormalStatus {
    /**
     * 初始化
     */
    init,

    /**
     * 编辑中
     */
    edit,

    /**
     * 审批中
     */
    audit,

    /**
     * 审核被拒绝
     */
    rejected,

    /**
     * 下线
     */
    offline,

    /**
     * 上线
     */
    online,
}

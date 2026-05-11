// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.core.openai;

import lombok.Data;



@Data
public class Message {
    private Role role;
    private String content;

    public Message() {
    }

    public Message(Role role, String content) {
        this.role = role;
        this.content = content;
    }
}

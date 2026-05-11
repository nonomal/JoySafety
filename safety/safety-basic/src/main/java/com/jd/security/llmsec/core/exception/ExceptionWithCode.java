// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.core.exception;

import lombok.Data;



@Data
public class ExceptionWithCode extends Exception{
    private int code;
    private String message;

    public ExceptionWithCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

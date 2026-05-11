// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.pojo;

import com.jd.security.llmsec.data.pojo.SensitiveWords;
import lombok.Data;

import java.util.regex.Pattern;


@Data
public class SensitiveWordsVO extends SensitiveWords {
    private String content;
    private String businessName;
    private String whereClause;
    private Pattern pattern;

}

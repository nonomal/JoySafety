// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.core.conf;

import com.jd.security.llmsec.core.Finals;
import com.jd.security.llmsec.core.api.defense.AB;
import lombok.Data;



@Data
public class ConfigReq {
    private String group = Finals.DEFAULT_GROUP;
    private String businessName;
    private AB ab;
}

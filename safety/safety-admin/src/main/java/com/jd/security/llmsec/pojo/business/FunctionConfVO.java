// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 JD.com

package com.jd.security.llmsec.pojo.business;

import com.jd.security.llmsec.data.pojo.FunctionConf;
import lombok.Data;

import java.util.Map;



@Data
public class FunctionConfVO extends FunctionConf {
    private Map<String, Object> confObj;
}

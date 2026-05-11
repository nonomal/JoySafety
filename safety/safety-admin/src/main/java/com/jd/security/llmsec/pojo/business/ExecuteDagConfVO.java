// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.pojo.business;

import com.google.common.collect.Lists;
import com.jd.security.llmsec.core.conf.NodeConfig;
import com.jd.security.llmsec.data.pojo.ExecuteDagConf;
import lombok.Data;

import java.util.List;



@Data
public class ExecuteDagConfVO extends ExecuteDagConf {
    private List<NodeConfig> confArray = Lists.newArrayList();
}

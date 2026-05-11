// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.core.engine;

import com.jd.security.llmsec.core.api.defense.AB;
import com.jd.security.llmsec.core.conf.NodeConfig;

import java.util.List;



public interface FunctionChainBuilder {
    Node root(String businessName, AB ab);

    Node refresh(String businessName) throws Exception;

    List<NodeConfig> conf(String businessName);
}

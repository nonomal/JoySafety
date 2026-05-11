// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.core.conf;

import lombok.Data;



@Data
public class NodeConfig extends BaseConf{
    private String nodeId;
    private FunctionConfig functionConf;
    private String reduceScriptRaw;
    private String reduceScript;
    private RouterConfig routerConf;
    private boolean ignoreError = true;
}

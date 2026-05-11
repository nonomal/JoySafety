// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.pojo.data;

import com.jd.security.llmsec.data.pojo.RedLineKnowledge;
import com.jd.security.llmsec.data.pojo.RedLineKnowledgeWithBLOBs;
import lombok.Data;

import java.util.List;



@Data
public class RedLineKnowledgeVO extends RedLineKnowledgeWithBLOBs {
    private String whereClause;
    private List<String> questions;
    private List<String> uniqIds;
}

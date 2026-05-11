// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 Beijing Jingdong Shangke Information Technology Co., Ltd.

package com.jd.security.llmsec.data.mapper.manual;

import com.jd.security.llmsec.data.pojo.RedLineKnowledgeWithBLOBs;
import com.jd.security.llmsec.data.pojo.SensitiveWords;
import com.jd.security.llmsec.pojo.data.RedLineKnowledgeVO;
import com.jd.security.llmsec.pojo.data.SensitiveWordsVO;

import java.util.List;



public interface RedLineKnowledgeManualMapper {
    List<RedLineKnowledgeWithBLOBs> selectByWhere(String whereClause);

    int upset(RedLineKnowledgeWithBLOBs vo);
}

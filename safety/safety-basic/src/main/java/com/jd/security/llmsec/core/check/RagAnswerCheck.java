// SPDX-License-Identifier: Apache-2.0
// Copyright (c) 2023-2026 JD.com

package com.jd.security.llmsec.core.check;

import lombok.Data;

import java.util.List;



@Data
public class RagAnswerCheck extends RiskCheckResult{
    @Override
    public RiskCheckType type() {
        return RiskCheckType.rag_answer;
    }

    private String answer;
    private List<KbSearchCheck.Doc> refDocs;
    private SingleLabelPredCheck originCheck;
}

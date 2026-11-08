package com.jsp.ai_service.requests;

import lombok.Data;

import java.sql.Clob;

@Data
public class PromptTemplateRequest {

    private String tenantId;

    private String promptCode;

    private int version;

    private String statusFlag;

    private Clob systemPrompt;

    private Clob userPromptTemplate;

}
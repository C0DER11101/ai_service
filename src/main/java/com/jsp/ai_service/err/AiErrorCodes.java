package com.jsp.ai_service.err;

public enum AiErrorCodes {

    AI_AGENT_NOT_FOUND, // no agent for tenant id and agent code
    AI_AGENT_INACTIVE, // resolved row is not ACTIVE
    AI_MODEL_DENIED, // MODEL_OVERRIDE is not in ALLOWED_MODELS
    AI_PROMPT_NOT_ACTIVE, // Prompt code has no ACTIVE row
    AI_SCHEMA_INVALID,
    AI_TOOL_DENIED,
    AI_STEP_LIMIT,
    AI_TIMEOUT,
    AI_PROVIDER_ERROR,
    AI_MCP_UNAVAILABLE,
    AI_SESSION_CONFLICT,
    AI_SESSION_NOT_FOUND

}
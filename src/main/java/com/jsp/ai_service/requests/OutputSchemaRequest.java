package com.jsp.ai_service.requests;

import jakarta.persistence.Lob;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import tools.jackson.databind.JsonNode;

import java.sql.Blob;
import java.sql.Clob;
import java.util.Map;

@Data
@NoArgsConstructor
public class OutputSchemaRequest {

    private String tenantId;

    private String schemaCode;

    private int version;

    private String statusFlag;

    private Map<String, Object> jsonSchema;

}
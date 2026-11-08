package com.jsp.ai_service.service;

import com.jsp.ai_service.requests.OutputSchemaRequest;
import org.springframework.http.ResponseEntity;

public interface SchemaService {

    ResponseEntity<?> createDraft(String tenantId, OutputSchemaRequest request);

}
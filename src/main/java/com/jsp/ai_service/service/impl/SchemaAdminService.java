package com.jsp.ai_service.service.impl;

import com.jsp.ai_service.model.OutputSchemaEntity;
import com.jsp.ai_service.repository.SchemaAdminRepository;
import com.jsp.ai_service.requests.OutputSchemaRequest;
import com.jsp.ai_service.service.SchemaService;
import com.jsp.ai_service.util.DateUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SchemaAdminService implements SchemaService {

    @Autowired
    private SchemaAdminRepository repo;

    @Override
    public ResponseEntity<?> createDraft(String tenantId, OutputSchemaRequest request) {

        OutputSchemaEntity entity = new OutputSchemaEntity();

        entity.setTenantId(request.getTenantId());
        entity.setSchemaCode(request.getSchemaCode());
        entity.setVersion(0);
        entity.setStatusFlag("DRAFT");
        entity.setJsonSchema(request.getJsonSchema());

        // Audit columns
        entity.setCreatedDate(DateUtil.toDate("2026-11-05"));
        entity.setCreatedBy("Grok");
        entity.setModifiedDate(DateUtil.toDate("2026-11-09"));
        entity.setModifiedBy("Gemini");

        OutputSchemaEntity savedEntity = repo.save(entity);

        return new ResponseEntity<>(savedEntity, HttpStatus.CREATED);

    }

}
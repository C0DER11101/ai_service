package com.jsp.ai_service.controller;

import com.jsp.ai_service.requests.OutputSchemaRequest;
import com.jsp.ai_service.service.impl.SchemaAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/schema-controller")
public class OutputSchemaController {

    @Autowired
    private SchemaAdminService service;


    @PostMapping(value = "/api/ai/v1/schemas")
    public ResponseEntity<?> createSchema(@RequestHeader("X_Tenant_Id") String tenantId, @RequestBody OutputSchemaRequest request) {

        //String tenantId = tenantIds.get("X-Tenant-Id");

        if(tenantId == null)
            return new ResponseEntity<>("No tenant", HttpStatus.NO_CONTENT);
        else if(request.getTenantId() != null && !tenantId.equals(request.getTenantId()))
            return new ResponseEntity<>("Tenant Ids conflict!", HttpStatus.CONFLICT);

        request.setTenantId(tenantId);

        //return service.createDraft(tenantIds.get("X-Tenant-Id"), request);
        return service.createDraft(tenantId, request);

    }

}
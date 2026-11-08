package com.jsp.ai_service.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import tools.jackson.databind.JsonNode;

import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Clob;
import java.util.Map;

@Data
@Entity
@Table(name = "ai_output_schema")
public class OutputSchemaEntity extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alt_key", columnDefinition = "bigint")
    private BigInteger altKey;

    @Column(name = "tenant_id", nullable = false, unique = true)
    private String tenantId;

    @Column(name = "schema_code", nullable = false)
    private String schemaCode;

    @Column(unique = true)
    private int version;

    @Column(name = "status_flag")
    private String statusFlag;

    //@Lob
    @Column(name = "json_schema")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> jsonSchema;

}
package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListVaultRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private String cloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private String protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private String objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private String resourceIds;

    public ListVaultRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListVaultRequest withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListVaultRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListVaultRequest withCloudType(String cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    public String getCloudType() {
        return cloudType;
    }

    public void setCloudType(String cloudType) {
        this.cloudType = cloudType;
    }

    public ListVaultRequest withProtectType(String protectType) {
        this.protectType = protectType;
        return this;
    }

    public String getProtectType() {
        return protectType;
    }

    public void setProtectType(String protectType) {
        this.protectType = protectType;
    }

    public ListVaultRequest withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public ListVaultRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListVaultRequest withId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListVaultRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ListVaultRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListVaultRequest withResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListVaultRequest listVaultRequest = (ListVaultRequest) o;
        return Objects.equals(this.limit, listVaultRequest.limit) && Objects.equals(this.name, listVaultRequest.name)
            && Objects.equals(this.offset, listVaultRequest.offset)
            && Objects.equals(this.cloudType, listVaultRequest.cloudType)
            && Objects.equals(this.protectType, listVaultRequest.protectType)
            && Objects.equals(this.objectType, listVaultRequest.objectType)
            && Objects.equals(this.enterpriseProjectId, listVaultRequest.enterpriseProjectId)
            && Objects.equals(this.id, listVaultRequest.id) && Objects.equals(this.policyId, listVaultRequest.policyId)
            && Objects.equals(this.status, listVaultRequest.status)
            && Objects.equals(this.resourceIds, listVaultRequest.resourceIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            name,
            offset,
            cloudType,
            protectType,
            objectType,
            enterpriseProjectId,
            id,
            policyId,
            status,
            resourceIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVaultRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

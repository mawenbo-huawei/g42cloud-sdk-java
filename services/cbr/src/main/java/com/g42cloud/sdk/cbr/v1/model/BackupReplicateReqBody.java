package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class BackupReplicateReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_project_id")

    private String destinationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_vault_id")

    private String destinationVaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_acceleration")

    private Boolean enableAcceleration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public BackupReplicateReqBody withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BackupReplicateReqBody withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public BackupReplicateReqBody withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public BackupReplicateReqBody withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    public BackupReplicateReqBody withEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
        return this;
    }

    public Boolean getEnableAcceleration() {
        return enableAcceleration;
    }

    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    public BackupReplicateReqBody withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupReplicateReqBody backupReplicateReqBody = (BackupReplicateReqBody) o;
        return Objects.equals(this.description, backupReplicateReqBody.description)
            && Objects.equals(this.destinationProjectId, backupReplicateReqBody.destinationProjectId)
            && Objects.equals(this.destinationRegion, backupReplicateReqBody.destinationRegion)
            && Objects.equals(this.destinationVaultId, backupReplicateReqBody.destinationVaultId)
            && Objects.equals(this.enableAcceleration, backupReplicateReqBody.enableAcceleration)
            && Objects.equals(this.name, backupReplicateReqBody.name);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(description, destinationProjectId, destinationRegion, destinationVaultId, enableAcceleration, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupReplicateReqBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    enableAcceleration: ").append(toIndentedString(enableAcceleration)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

package com.g42cloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckpointReplicateParam
 */
public class CheckpointReplicateParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_trigger")

    private Boolean autoTrigger;

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
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public CheckpointReplicateParam withAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }

    public Boolean getAutoTrigger() {
        return autoTrigger;
    }

    public void setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    public CheckpointReplicateParam withDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
        return this;
    }

    public String getDestinationProjectId() {
        return destinationProjectId;
    }

    public void setDestinationProjectId(String destinationProjectId) {
        this.destinationProjectId = destinationProjectId;
    }

    public CheckpointReplicateParam withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public CheckpointReplicateParam withDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
        return this;
    }

    public String getDestinationVaultId() {
        return destinationVaultId;
    }

    public void setDestinationVaultId(String destinationVaultId) {
        this.destinationVaultId = destinationVaultId;
    }

    public CheckpointReplicateParam withEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
        return this;
    }

    public Boolean getEnableAcceleration() {
        return enableAcceleration;
    }

    public void setEnableAcceleration(Boolean enableAcceleration) {
        this.enableAcceleration = enableAcceleration;
    }

    public CheckpointReplicateParam withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointReplicateParam checkpointReplicateParam = (CheckpointReplicateParam) o;
        return Objects.equals(this.autoTrigger, checkpointReplicateParam.autoTrigger)
            && Objects.equals(this.destinationProjectId, checkpointReplicateParam.destinationProjectId)
            && Objects.equals(this.destinationRegion, checkpointReplicateParam.destinationRegion)
            && Objects.equals(this.destinationVaultId, checkpointReplicateParam.destinationVaultId)
            && Objects.equals(this.enableAcceleration, checkpointReplicateParam.enableAcceleration)
            && Objects.equals(this.vaultId, checkpointReplicateParam.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTrigger,
            destinationProjectId,
            destinationRegion,
            destinationVaultId,
            enableAcceleration,
            vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointReplicateParam {\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
        sb.append("    destinationProjectId: ").append(toIndentedString(destinationProjectId)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationVaultId: ").append(toIndentedString(destinationVaultId)).append("\n");
        sb.append("    enableAcceleration: ").append(toIndentedString(enableAcceleration)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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

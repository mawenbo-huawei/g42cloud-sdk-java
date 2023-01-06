package com.g42cloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.UUID;

/**
 * volumeAttachment数据结构说明
 */
public class VolumeAttachment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeId")

    private UUID volumeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device")

    private String device;

    public VolumeAttachment withVolumeId(UUID volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public UUID getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(UUID volumeId) {
        this.volumeId = volumeId;
    }

    public VolumeAttachment withDevice(String device) {
        this.device = device;
        return this;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VolumeAttachment volumeAttachment = (VolumeAttachment) o;
        return Objects.equals(this.volumeId, volumeAttachment.volumeId)
            && Objects.equals(this.device, volumeAttachment.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeId, device);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeAttachment {\n");
        sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
        sb.append("    device: ").append(toIndentedString(device)).append("\n");
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

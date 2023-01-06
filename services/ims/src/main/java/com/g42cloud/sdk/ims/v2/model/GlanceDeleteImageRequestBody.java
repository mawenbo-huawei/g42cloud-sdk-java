package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 请求参数
 */
public class GlanceDeleteImageRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_backup")

    private Boolean deleteBackup;

    public GlanceDeleteImageRequestBody withDeleteBackup(Boolean deleteBackup) {
        this.deleteBackup = deleteBackup;
        return this;
    }

    public Boolean getDeleteBackup() {
        return deleteBackup;
    }

    public void setDeleteBackup(Boolean deleteBackup) {
        this.deleteBackup = deleteBackup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlanceDeleteImageRequestBody glanceDeleteImageRequestBody = (GlanceDeleteImageRequestBody) o;
        return Objects.equals(this.deleteBackup, glanceDeleteImageRequestBody.deleteBackup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deleteBackup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlanceDeleteImageRequestBody {\n");
        sb.append("    deleteBackup: ").append(toIndentedString(deleteBackup)).append("\n");
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

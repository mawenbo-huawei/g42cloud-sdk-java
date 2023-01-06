package com.g42cloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AddSubscriptionRequestBody
 */
public class AddSubscriptionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public AddSubscriptionRequestBody withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public AddSubscriptionRequestBody withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public AddSubscriptionRequestBody withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddSubscriptionRequestBody addSubscriptionRequestBody = (AddSubscriptionRequestBody) o;
        return Objects.equals(this.protocol, addSubscriptionRequestBody.protocol)
            && Objects.equals(this.endpoint, addSubscriptionRequestBody.endpoint)
            && Objects.equals(this.remark, addSubscriptionRequestBody.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, endpoint, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSubscriptionRequestBody {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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

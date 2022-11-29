package com.g42cloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateHealthMonitorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateHealthMonitorRequestBody body;

    public CreateHealthMonitorRequest withBody(CreateHealthMonitorRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateHealthMonitorRequest withBody(Consumer<CreateHealthMonitorRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateHealthMonitorRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    public CreateHealthMonitorRequestBody getBody() {
        return body;
    }

    public void setBody(CreateHealthMonitorRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHealthMonitorRequest createHealthMonitorRequest = (CreateHealthMonitorRequest) o;
        return Objects.equals(this.body, createHealthMonitorRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHealthMonitorRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

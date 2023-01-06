package com.g42cloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowImageQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotas")

    private Quota quotas;

    public ShowImageQuotaResponse withQuotas(Quota quotas) {
        this.quotas = quotas;
        return this;
    }

    public ShowImageQuotaResponse withQuotas(Consumer<Quota> quotasSetter) {
        if (this.quotas == null) {
            this.quotas = new Quota();
            quotasSetter.accept(this.quotas);
        }

        return this;
    }

    public Quota getQuotas() {
        return quotas;
    }

    public void setQuotas(Quota quotas) {
        this.quotas = quotas;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowImageQuotaResponse showImageQuotaResponse = (ShowImageQuotaResponse) o;
        return Objects.equals(this.quotas, showImageQuotaResponse.quotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotas);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowImageQuotaResponse {\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
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

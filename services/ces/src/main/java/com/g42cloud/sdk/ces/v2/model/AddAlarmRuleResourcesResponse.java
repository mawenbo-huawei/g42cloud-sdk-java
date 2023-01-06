package com.g42cloud.sdk.ces.v2.model;

import com.g42cloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class AddAlarmRuleResourcesResponse extends SdkResponse {

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddAlarmRuleResourcesResponse {\n");
        sb.append("}");
        return sb.toString();
    }

}

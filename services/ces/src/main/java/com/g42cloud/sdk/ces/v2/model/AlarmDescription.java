package com.g42cloud.sdk.ces.v2.model;

import java.util.Objects;

/**
 * 告警描述，长度0-256
 */
public class AlarmDescription {

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
        sb.append("class AlarmDescription {\n");
        sb.append("}");
        return sb.toString();
    }

}

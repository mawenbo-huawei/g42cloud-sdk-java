package com.g42cloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListPostgresqlDatabasesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<PostgresqlListDatabase> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListPostgresqlDatabasesResponse withDatabases(List<PostgresqlListDatabase> databases) {
        this.databases = databases;
        return this;
    }

    public ListPostgresqlDatabasesResponse addDatabasesItem(PostgresqlListDatabase databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ListPostgresqlDatabasesResponse withDatabases(Consumer<List<PostgresqlListDatabase>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    public List<PostgresqlListDatabase> getDatabases() {
        return databases;
    }

    public void setDatabases(List<PostgresqlListDatabase> databases) {
        this.databases = databases;
    }

    public ListPostgresqlDatabasesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPostgresqlDatabasesResponse listPostgresqlDatabasesResponse = (ListPostgresqlDatabasesResponse) o;
        return Objects.equals(this.databases, listPostgresqlDatabasesResponse.databases)
            && Objects.equals(this.totalCount, listPostgresqlDatabasesResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databases, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPostgresqlDatabasesResponse {\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

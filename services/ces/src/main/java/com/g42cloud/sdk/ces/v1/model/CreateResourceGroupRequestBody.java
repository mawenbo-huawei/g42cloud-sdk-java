package com.g42cloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建资源分组，请求参数。
 */
public class CreateResourceGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<CreateResourceGroup> resources = null;

    public CreateResourceGroupRequestBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public CreateResourceGroupRequestBody withResources(List<CreateResourceGroup> resources) {
        this.resources = resources;
        return this;
    }

    public CreateResourceGroupRequestBody addResourcesItem(CreateResourceGroup resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CreateResourceGroupRequestBody withResources(Consumer<List<CreateResourceGroup>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    public List<CreateResourceGroup> getResources() {
        return resources;
    }

    public void setResources(List<CreateResourceGroup> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateResourceGroupRequestBody createResourceGroupRequestBody = (CreateResourceGroupRequestBody) o;
        return Objects.equals(this.groupName, createResourceGroupRequestBody.groupName)
            && Objects.equals(this.resources, createResourceGroupRequestBody.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResourceGroupRequestBody {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

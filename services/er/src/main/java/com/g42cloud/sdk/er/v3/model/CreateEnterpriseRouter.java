package com.g42cloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 企业路由器
 */
public class CreateEnterpriseRouter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asn")

    private Long asn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public static final class ChargeModeEnum {

        /**
         * Enum POSTPAID for value: "postPaid"
         */
        public static final ChargeModeEnum POSTPAID = new ChargeModeEnum("postPaid");

        /**
         * Enum PREPAID for value: "prePaid"
         */
        public static final ChargeModeEnum PREPAID = new ChargeModeEnum("prePaid");

        private static final Map<String, ChargeModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargeModeEnum> createStaticFields() {
            Map<String, ChargeModeEnum> map = new HashMap<>();
            map.put("postPaid", POSTPAID);
            map.put("prePaid", PREPAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargeModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargeModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargeModeEnum(value);
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ChargeModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private ChargeModeEnum chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_default_propagation")

    private Boolean enableDefaultPropagation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_default_association")

    private Boolean enableDefaultAssociation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_ids")

    private List<String> availabilityZoneIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_accept_shared_attachments")

    private Boolean autoAcceptSharedAttachments;

    public CreateEnterpriseRouter withName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEnterpriseRouter withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateEnterpriseRouter withAsn(Long asn) {
        this.asn = asn;
        return this;
    }

    public Long getAsn() {
        return asn;
    }

    public void setAsn(Long asn) {
        this.asn = asn;
    }

    public CreateEnterpriseRouter withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateEnterpriseRouter withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public CreateEnterpriseRouter withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateEnterpriseRouter addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateEnterpriseRouter withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public CreateEnterpriseRouter withEnableDefaultPropagation(Boolean enableDefaultPropagation) {
        this.enableDefaultPropagation = enableDefaultPropagation;
        return this;
    }

    public Boolean getEnableDefaultPropagation() {
        return enableDefaultPropagation;
    }

    public void setEnableDefaultPropagation(Boolean enableDefaultPropagation) {
        this.enableDefaultPropagation = enableDefaultPropagation;
    }

    public CreateEnterpriseRouter withEnableDefaultAssociation(Boolean enableDefaultAssociation) {
        this.enableDefaultAssociation = enableDefaultAssociation;
        return this;
    }

    public Boolean getEnableDefaultAssociation() {
        return enableDefaultAssociation;
    }

    public void setEnableDefaultAssociation(Boolean enableDefaultAssociation) {
        this.enableDefaultAssociation = enableDefaultAssociation;
    }

    public CreateEnterpriseRouter withAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
        return this;
    }

    public CreateEnterpriseRouter addAvailabilityZoneIdsItem(String availabilityZoneIdsItem) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        this.availabilityZoneIds.add(availabilityZoneIdsItem);
        return this;
    }

    public CreateEnterpriseRouter withAvailabilityZoneIds(Consumer<List<String>> availabilityZoneIdsSetter) {
        if (this.availabilityZoneIds == null) {
            this.availabilityZoneIds = new ArrayList<>();
        }
        availabilityZoneIdsSetter.accept(this.availabilityZoneIds);
        return this;
    }

    public List<String> getAvailabilityZoneIds() {
        return availabilityZoneIds;
    }

    public void setAvailabilityZoneIds(List<String> availabilityZoneIds) {
        this.availabilityZoneIds = availabilityZoneIds;
    }

    public CreateEnterpriseRouter withAutoAcceptSharedAttachments(Boolean autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
        return this;
    }

    public Boolean getAutoAcceptSharedAttachments() {
        return autoAcceptSharedAttachments;
    }

    public void setAutoAcceptSharedAttachments(Boolean autoAcceptSharedAttachments) {
        this.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEnterpriseRouter createEnterpriseRouter = (CreateEnterpriseRouter) o;
        return Objects.equals(this.name, createEnterpriseRouter.name)
            && Objects.equals(this.description, createEnterpriseRouter.description)
            && Objects.equals(this.asn, createEnterpriseRouter.asn)
            && Objects.equals(this.enterpriseProjectId, createEnterpriseRouter.enterpriseProjectId)
            && Objects.equals(this.chargeMode, createEnterpriseRouter.chargeMode)
            && Objects.equals(this.tags, createEnterpriseRouter.tags)
            && Objects.equals(this.enableDefaultPropagation, createEnterpriseRouter.enableDefaultPropagation)
            && Objects.equals(this.enableDefaultAssociation, createEnterpriseRouter.enableDefaultAssociation)
            && Objects.equals(this.availabilityZoneIds, createEnterpriseRouter.availabilityZoneIds)
            && Objects.equals(this.autoAcceptSharedAttachments, createEnterpriseRouter.autoAcceptSharedAttachments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            asn,
            enterpriseProjectId,
            chargeMode,
            tags,
            enableDefaultPropagation,
            enableDefaultAssociation,
            availabilityZoneIds,
            autoAcceptSharedAttachments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEnterpriseRouter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    asn: ").append(toIndentedString(asn)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    enableDefaultPropagation: ").append(toIndentedString(enableDefaultPropagation)).append("\n");
        sb.append("    enableDefaultAssociation: ").append(toIndentedString(enableDefaultAssociation)).append("\n");
        sb.append("    availabilityZoneIds: ").append(toIndentedString(availabilityZoneIds)).append("\n");
        sb.append("    autoAcceptSharedAttachments: ")
            .append(toIndentedString(autoAcceptSharedAttachments))
            .append("\n");
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

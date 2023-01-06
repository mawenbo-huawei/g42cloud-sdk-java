package com.g42cloud.sdk.cts.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.g42cloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateNotificationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_name")

    private String notificationName;

    public static final class OperationTypeEnum {

        /**
         * Enum CUSTOMIZED for value: "customized"
         */
        public static final OperationTypeEnum CUSTOMIZED = new OperationTypeEnum("customized");

        /**
         * Enum COMPLETE for value: "complete"
         */
        public static final OperationTypeEnum COMPLETE = new OperationTypeEnum("complete");

        private static final Map<String, OperationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperationTypeEnum> createStaticFields() {
            Map<String, OperationTypeEnum> map = new HashMap<>();
            map.put("customized", CUSTOMIZED);
            map.put("complete", COMPLETE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperationTypeEnum(String value) {
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
        public static OperationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OperationTypeEnum(value);
            }
            return result;
        }

        public static OperationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OperationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperationTypeEnum) {
                return this.value.equals(((OperationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private OperationTypeEnum operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operations")

    private List<Operations> operations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_user_list")

    private List<NotificationUsers> notifyUserList = null;

    public static final class StatusEnum {

        /**
         * Enum ENABLED for value: "enabled"
         */
        public static final StatusEnum ENABLED = new StatusEnum("enabled");

        /**
         * Enum DISABLED for value: "disabled"
         */
        public static final StatusEnum DISABLED = new StatusEnum("disabled");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("enabled", ENABLED);
            map.put("disabled", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_id")

    private String topicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_id")

    private String notificationId;

    public static final class NotificationTypeEnum {

        /**
         * Enum SMN for value: "smn"
         */
        public static final NotificationTypeEnum SMN = new NotificationTypeEnum("smn");

        /**
         * Enum FUN for value: "fun"
         */
        public static final NotificationTypeEnum FUN = new NotificationTypeEnum("fun");

        private static final Map<String, NotificationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NotificationTypeEnum> createStaticFields() {
            Map<String, NotificationTypeEnum> map = new HashMap<>();
            map.put("smn", SMN);
            map.put("fun", FUN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NotificationTypeEnum(String value) {
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
        public static NotificationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NotificationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NotificationTypeEnum(value);
            }
            return result;
        }

        public static NotificationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NotificationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NotificationTypeEnum) {
                return this.value.equals(((NotificationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_type")

    private NotificationTypeEnum notificationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private Filter filter;

    public UpdateNotificationResponse withNotificationName(String notificationName) {
        this.notificationName = notificationName;
        return this;
    }

    public String getNotificationName() {
        return notificationName;
    }

    public void setNotificationName(String notificationName) {
        this.notificationName = notificationName;
    }

    public UpdateNotificationResponse withOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
        return this;
    }

    public OperationTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationTypeEnum operationType) {
        this.operationType = operationType;
    }

    public UpdateNotificationResponse withOperations(List<Operations> operations) {
        this.operations = operations;
        return this;
    }

    public UpdateNotificationResponse addOperationsItem(Operations operationsItem) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operationsItem);
        return this;
    }

    public UpdateNotificationResponse withOperations(Consumer<List<Operations>> operationsSetter) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        operationsSetter.accept(this.operations);
        return this;
    }

    public List<Operations> getOperations() {
        return operations;
    }

    public void setOperations(List<Operations> operations) {
        this.operations = operations;
    }

    public UpdateNotificationResponse withNotifyUserList(List<NotificationUsers> notifyUserList) {
        this.notifyUserList = notifyUserList;
        return this;
    }

    public UpdateNotificationResponse addNotifyUserListItem(NotificationUsers notifyUserListItem) {
        if (this.notifyUserList == null) {
            this.notifyUserList = new ArrayList<>();
        }
        this.notifyUserList.add(notifyUserListItem);
        return this;
    }

    public UpdateNotificationResponse withNotifyUserList(Consumer<List<NotificationUsers>> notifyUserListSetter) {
        if (this.notifyUserList == null) {
            this.notifyUserList = new ArrayList<>();
        }
        notifyUserListSetter.accept(this.notifyUserList);
        return this;
    }

    public List<NotificationUsers> getNotifyUserList() {
        return notifyUserList;
    }

    public void setNotifyUserList(List<NotificationUsers> notifyUserList) {
        this.notifyUserList = notifyUserList;
    }

    public UpdateNotificationResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateNotificationResponse withTopicId(String topicId) {
        this.topicId = topicId;
        return this;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public UpdateNotificationResponse withNotificationId(String notificationId) {
        this.notificationId = notificationId;
        return this;
    }

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public UpdateNotificationResponse withNotificationType(NotificationTypeEnum notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    public NotificationTypeEnum getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationTypeEnum notificationType) {
        this.notificationType = notificationType;
    }

    public UpdateNotificationResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public UpdateNotificationResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public UpdateNotificationResponse withFilter(Filter filter) {
        this.filter = filter;
        return this;
    }

    public UpdateNotificationResponse withFilter(Consumer<Filter> filterSetter) {
        if (this.filter == null) {
            this.filter = new Filter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNotificationResponse updateNotificationResponse = (UpdateNotificationResponse) o;
        return Objects.equals(this.notificationName, updateNotificationResponse.notificationName)
            && Objects.equals(this.operationType, updateNotificationResponse.operationType)
            && Objects.equals(this.operations, updateNotificationResponse.operations)
            && Objects.equals(this.notifyUserList, updateNotificationResponse.notifyUserList)
            && Objects.equals(this.status, updateNotificationResponse.status)
            && Objects.equals(this.topicId, updateNotificationResponse.topicId)
            && Objects.equals(this.notificationId, updateNotificationResponse.notificationId)
            && Objects.equals(this.notificationType, updateNotificationResponse.notificationType)
            && Objects.equals(this.projectId, updateNotificationResponse.projectId)
            && Objects.equals(this.createTime, updateNotificationResponse.createTime)
            && Objects.equals(this.filter, updateNotificationResponse.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationName,
            operationType,
            operations,
            notifyUserList,
            status,
            topicId,
            notificationId,
            notificationType,
            projectId,
            createTime,
            filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotificationResponse {\n");
        sb.append("    notificationName: ").append(toIndentedString(notificationName)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
        sb.append("    notifyUserList: ").append(toIndentedString(notifyUserList)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
        sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
        sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

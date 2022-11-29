package com.g42cloud.sdk.ces.v1;

import com.g42cloud.sdk.ces.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CesClient {

    protected HcClient hcClient;

    public CesClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesClient> newBuilder() {
        return new ClientBuilder<>(CesClient::new);
    }

    public BatchListMetricDataResponse batchListMetricData(BatchListMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.batchListMetricData);
    }

    public SyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse> batchListMetricDataInvoker(
        BatchListMetricDataRequest request) {
        return new SyncInvoker<BatchListMetricDataRequest, BatchListMetricDataResponse>(request,
            CesMeta.batchListMetricData, hcClient);
    }

    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarm);
    }

    public SyncInvoker<CreateAlarmRequest, CreateAlarmResponse> createAlarmInvoker(CreateAlarmRequest request) {
        return new SyncInvoker<CreateAlarmRequest, CreateAlarmResponse>(request, CesMeta.createAlarm, hcClient);
    }

    public CreateAlarmTemplateResponse createAlarmTemplate(CreateAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createAlarmTemplate);
    }

    public SyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse> createAlarmTemplateInvoker(
        CreateAlarmTemplateRequest request) {
        return new SyncInvoker<CreateAlarmTemplateRequest, CreateAlarmTemplateResponse>(request,
            CesMeta.createAlarmTemplate, hcClient);
    }

    public CreateEventsResponse createEvents(CreateEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createEvents);
    }

    public SyncInvoker<CreateEventsRequest, CreateEventsResponse> createEventsInvoker(CreateEventsRequest request) {
        return new SyncInvoker<CreateEventsRequest, CreateEventsResponse>(request, CesMeta.createEvents, hcClient);
    }

    public CreateMetricDataResponse createMetricData(CreateMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createMetricData);
    }

    public SyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse> createMetricDataInvoker(
        CreateMetricDataRequest request) {
        return new SyncInvoker<CreateMetricDataRequest, CreateMetricDataResponse>(request, CesMeta.createMetricData,
            hcClient);
    }

    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.createResourceGroup);
    }

    public SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse> createResourceGroupInvoker(
        CreateResourceGroupRequest request) {
        return new SyncInvoker<CreateResourceGroupRequest, CreateResourceGroupResponse>(request,
            CesMeta.createResourceGroup, hcClient);
    }

    public DeleteAlarmResponse deleteAlarm(DeleteAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarm);
    }

    public SyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse> deleteAlarmInvoker(DeleteAlarmRequest request) {
        return new SyncInvoker<DeleteAlarmRequest, DeleteAlarmResponse>(request, CesMeta.deleteAlarm, hcClient);
    }

    public DeleteAlarmTemplateResponse deleteAlarmTemplate(DeleteAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteAlarmTemplate);
    }

    public SyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse> deleteAlarmTemplateInvoker(
        DeleteAlarmTemplateRequest request) {
        return new SyncInvoker<DeleteAlarmTemplateRequest, DeleteAlarmTemplateResponse>(request,
            CesMeta.deleteAlarmTemplate, hcClient);
    }

    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.deleteResourceGroup);
    }

    public SyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse> deleteResourceGroupInvoker(
        DeleteResourceGroupRequest request) {
        return new SyncInvoker<DeleteResourceGroupRequest, DeleteResourceGroupResponse>(request,
            CesMeta.deleteResourceGroup, hcClient);
    }

    public ListAlarmHistoriesResponse listAlarmHistories(ListAlarmHistoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    public SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesInvoker(
        ListAlarmHistoriesRequest request) {
        return new SyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    public ListAlarmTemplatesResponse listAlarmTemplates(ListAlarmTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarmTemplates);
    }

    public SyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse> listAlarmTemplatesInvoker(
        ListAlarmTemplatesRequest request) {
        return new SyncInvoker<ListAlarmTemplatesRequest, ListAlarmTemplatesResponse>(request,
            CesMeta.listAlarmTemplates, hcClient);
    }

    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listAlarms);
    }

    public SyncInvoker<ListAlarmsRequest, ListAlarmsResponse> listAlarmsInvoker(ListAlarmsRequest request) {
        return new SyncInvoker<ListAlarmsRequest, ListAlarmsResponse>(request, CesMeta.listAlarms, hcClient);
    }

    public ListEventDetailResponse listEventDetail(ListEventDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listEventDetail);
    }

    public SyncInvoker<ListEventDetailRequest, ListEventDetailResponse> listEventDetailInvoker(
        ListEventDetailRequest request) {
        return new SyncInvoker<ListEventDetailRequest, ListEventDetailResponse>(request, CesMeta.listEventDetail,
            hcClient);
    }

    public ListEventsResponse listEvents(ListEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listEvents);
    }

    public SyncInvoker<ListEventsRequest, ListEventsResponse> listEventsInvoker(ListEventsRequest request) {
        return new SyncInvoker<ListEventsRequest, ListEventsResponse>(request, CesMeta.listEvents, hcClient);
    }

    public ListMetricsResponse listMetrics(ListMetricsRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listMetrics);
    }

    public SyncInvoker<ListMetricsRequest, ListMetricsResponse> listMetricsInvoker(ListMetricsRequest request) {
        return new SyncInvoker<ListMetricsRequest, ListMetricsResponse>(request, CesMeta.listMetrics, hcClient);
    }

    public ListResourceGroupResponse listResourceGroup(ListResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.listResourceGroup);
    }

    public SyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse> listResourceGroupInvoker(
        ListResourceGroupRequest request) {
        return new SyncInvoker<ListResourceGroupRequest, ListResourceGroupResponse>(request, CesMeta.listResourceGroup,
            hcClient);
    }

    public ShowAlarmResponse showAlarm(ShowAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showAlarm);
    }

    public SyncInvoker<ShowAlarmRequest, ShowAlarmResponse> showAlarmInvoker(ShowAlarmRequest request) {
        return new SyncInvoker<ShowAlarmRequest, ShowAlarmResponse>(request, CesMeta.showAlarm, hcClient);
    }

    public ShowEventDataResponse showEventData(ShowEventDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showEventData);
    }

    public SyncInvoker<ShowEventDataRequest, ShowEventDataResponse> showEventDataInvoker(ShowEventDataRequest request) {
        return new SyncInvoker<ShowEventDataRequest, ShowEventDataResponse>(request, CesMeta.showEventData, hcClient);
    }

    public ShowMetricDataResponse showMetricData(ShowMetricDataRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showMetricData);
    }

    public SyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse> showMetricDataInvoker(
        ShowMetricDataRequest request) {
        return new SyncInvoker<ShowMetricDataRequest, ShowMetricDataResponse>(request, CesMeta.showMetricData,
            hcClient);
    }

    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showQuotas);
    }

    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, CesMeta.showQuotas, hcClient);
    }

    public ShowResourceGroupResponse showResourceGroup(ShowResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.showResourceGroup);
    }

    public SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse> showResourceGroupInvoker(
        ShowResourceGroupRequest request) {
        return new SyncInvoker<ShowResourceGroupRequest, ShowResourceGroupResponse>(request, CesMeta.showResourceGroup,
            hcClient);
    }

    public UpdateAlarmResponse updateAlarm(UpdateAlarmRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarm);
    }

    public SyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse> updateAlarmInvoker(UpdateAlarmRequest request) {
        return new SyncInvoker<UpdateAlarmRequest, UpdateAlarmResponse>(request, CesMeta.updateAlarm, hcClient);
    }

    public UpdateAlarmActionResponse updateAlarmAction(UpdateAlarmActionRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmAction);
    }

    public SyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse> updateAlarmActionInvoker(
        UpdateAlarmActionRequest request) {
        return new SyncInvoker<UpdateAlarmActionRequest, UpdateAlarmActionResponse>(request, CesMeta.updateAlarmAction,
            hcClient);
    }

    public UpdateAlarmTemplateResponse updateAlarmTemplate(UpdateAlarmTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateAlarmTemplate);
    }

    public SyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse> updateAlarmTemplateInvoker(
        UpdateAlarmTemplateRequest request) {
        return new SyncInvoker<UpdateAlarmTemplateRequest, UpdateAlarmTemplateResponse>(request,
            CesMeta.updateAlarmTemplate, hcClient);
    }

    public UpdateResourceGroupResponse updateResourceGroup(UpdateResourceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CesMeta.updateResourceGroup);
    }

    public SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse> updateResourceGroupInvoker(
        UpdateResourceGroupRequest request) {
        return new SyncInvoker<UpdateResourceGroupRequest, UpdateResourceGroupResponse>(request,
            CesMeta.updateResourceGroup, hcClient);
    }

}

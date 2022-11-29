package com.g42cloud.sdk.cts.v3;

import com.g42cloud.sdk.cts.v3.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CtsClient {

    protected HcClient hcClient;

    public CtsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CtsClient> newBuilder() {
        return new ClientBuilder<>(CtsClient::new);
    }

    public CreateNotificationResponse createNotification(CreateNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.createNotification);
    }

    public SyncInvoker<CreateNotificationRequest, CreateNotificationResponse> createNotificationInvoker(
        CreateNotificationRequest request) {
        return new SyncInvoker<CreateNotificationRequest, CreateNotificationResponse>(request,
            CtsMeta.createNotification, hcClient);
    }

    public CreateTrackerResponse createTracker(CreateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.createTracker);
    }

    public SyncInvoker<CreateTrackerRequest, CreateTrackerResponse> createTrackerInvoker(CreateTrackerRequest request) {
        return new SyncInvoker<CreateTrackerRequest, CreateTrackerResponse>(request, CtsMeta.createTracker, hcClient);
    }

    public DeleteNotificationResponse deleteNotification(DeleteNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.deleteNotification);
    }

    public SyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse> deleteNotificationInvoker(
        DeleteNotificationRequest request) {
        return new SyncInvoker<DeleteNotificationRequest, DeleteNotificationResponse>(request,
            CtsMeta.deleteNotification, hcClient);
    }

    public DeleteTrackerResponse deleteTracker(DeleteTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.deleteTracker);
    }

    public SyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse> deleteTrackerInvoker(DeleteTrackerRequest request) {
        return new SyncInvoker<DeleteTrackerRequest, DeleteTrackerResponse>(request, CtsMeta.deleteTracker, hcClient);
    }

    public ListNotificationsResponse listNotifications(ListNotificationsRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listNotifications);
    }

    public SyncInvoker<ListNotificationsRequest, ListNotificationsResponse> listNotificationsInvoker(
        ListNotificationsRequest request) {
        return new SyncInvoker<ListNotificationsRequest, ListNotificationsResponse>(request, CtsMeta.listNotifications,
            hcClient);
    }

    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listQuotas);
    }

    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<ListQuotasRequest, ListQuotasResponse>(request, CtsMeta.listQuotas, hcClient);
    }

    public ListTracesResponse listTraces(ListTracesRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTraces);
    }

    public SyncInvoker<ListTracesRequest, ListTracesResponse> listTracesInvoker(ListTracesRequest request) {
        return new SyncInvoker<ListTracesRequest, ListTracesResponse>(request, CtsMeta.listTraces, hcClient);
    }

    public ListTrackersResponse listTrackers(ListTrackersRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.listTrackers);
    }

    public SyncInvoker<ListTrackersRequest, ListTrackersResponse> listTrackersInvoker(ListTrackersRequest request) {
        return new SyncInvoker<ListTrackersRequest, ListTrackersResponse>(request, CtsMeta.listTrackers, hcClient);
    }

    public UpdateNotificationResponse updateNotification(UpdateNotificationRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.updateNotification);
    }

    public SyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse> updateNotificationInvoker(
        UpdateNotificationRequest request) {
        return new SyncInvoker<UpdateNotificationRequest, UpdateNotificationResponse>(request,
            CtsMeta.updateNotification, hcClient);
    }

    public UpdateTrackerResponse updateTracker(UpdateTrackerRequest request) {
        return hcClient.syncInvokeHttp(request, CtsMeta.updateTracker);
    }

    public SyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse> updateTrackerInvoker(UpdateTrackerRequest request) {
        return new SyncInvoker<UpdateTrackerRequest, UpdateTrackerResponse>(request, CtsMeta.updateTracker, hcClient);
    }

}

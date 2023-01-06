package com.g42cloud.sdk.bms.v1;

import com.g42cloud.sdk.bms.v1.model.*;
import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class BmsAsyncClient {

    protected HcClient hcClient;

    public BmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<BmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(BmsAsyncClient::new);
    }

    public CompletableFuture<AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeAsync(
        AttachBaremetalServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.attachBaremetalServerVolume);
    }

    public AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse> attachBaremetalServerVolumeAsyncInvoker(
        AttachBaremetalServerVolumeRequest request) {
        return new AsyncInvoker<AttachBaremetalServerVolumeRequest, AttachBaremetalServerVolumeResponse>(request,
            BmsMeta.attachBaremetalServerVolume, hcClient);
    }

    public CompletableFuture<BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsAsync(
        BatchCreateBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchCreateBaremetalServerTags);
    }

    public AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse> batchCreateBaremetalServerTagsAsyncInvoker(
        BatchCreateBaremetalServerTagsRequest request) {
        return new AsyncInvoker<BatchCreateBaremetalServerTagsRequest, BatchCreateBaremetalServerTagsResponse>(request,
            BmsMeta.batchCreateBaremetalServerTags, hcClient);
    }

    public CompletableFuture<BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsAsync(
        BatchDeleteBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchDeleteBaremetalServerTags);
    }

    public AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse> batchDeleteBaremetalServerTagsAsyncInvoker(
        BatchDeleteBaremetalServerTagsRequest request) {
        return new AsyncInvoker<BatchDeleteBaremetalServerTagsRequest, BatchDeleteBaremetalServerTagsResponse>(request,
            BmsMeta.batchDeleteBaremetalServerTags, hcClient);
    }

    public CompletableFuture<BatchRebootBaremetalServersResponse> batchRebootBaremetalServersAsync(
        BatchRebootBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchRebootBaremetalServers);
    }

    public AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse> batchRebootBaremetalServersAsyncInvoker(
        BatchRebootBaremetalServersRequest request) {
        return new AsyncInvoker<BatchRebootBaremetalServersRequest, BatchRebootBaremetalServersResponse>(request,
            BmsMeta.batchRebootBaremetalServers, hcClient);
    }

    public CompletableFuture<BatchStartBaremetalServersResponse> batchStartBaremetalServersAsync(
        BatchStartBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchStartBaremetalServers);
    }

    public AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse> batchStartBaremetalServersAsyncInvoker(
        BatchStartBaremetalServersRequest request) {
        return new AsyncInvoker<BatchStartBaremetalServersRequest, BatchStartBaremetalServersResponse>(request,
            BmsMeta.batchStartBaremetalServers, hcClient);
    }

    public CompletableFuture<BatchStopBaremetalServersResponse> batchStopBaremetalServersAsync(
        BatchStopBaremetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.batchStopBaremetalServers);
    }

    public AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse> batchStopBaremetalServersAsyncInvoker(
        BatchStopBaremetalServersRequest request) {
        return new AsyncInvoker<BatchStopBaremetalServersRequest, BatchStopBaremetalServersResponse>(request,
            BmsMeta.batchStopBaremetalServers, hcClient);
    }

    public CompletableFuture<ChangeBaremetalServerNameResponse> changeBaremetalServerNameAsync(
        ChangeBaremetalServerNameRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.changeBaremetalServerName);
    }

    public AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse> changeBaremetalServerNameAsyncInvoker(
        ChangeBaremetalServerNameRequest request) {
        return new AsyncInvoker<ChangeBaremetalServerNameRequest, ChangeBaremetalServerNameResponse>(request,
            BmsMeta.changeBaremetalServerName, hcClient);
    }

    public CompletableFuture<ChangeBaremetalServerOsResponse> changeBaremetalServerOsAsync(
        ChangeBaremetalServerOsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.changeBaremetalServerOs);
    }

    public AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse> changeBaremetalServerOsAsyncInvoker(
        ChangeBaremetalServerOsRequest request) {
        return new AsyncInvoker<ChangeBaremetalServerOsRequest, ChangeBaremetalServerOsResponse>(request,
            BmsMeta.changeBaremetalServerOs, hcClient);
    }

    public CompletableFuture<CreateBareMetalServersResponse> createBareMetalServersAsync(
        CreateBareMetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.createBareMetalServers);
    }

    public AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse> createBareMetalServersAsyncInvoker(
        CreateBareMetalServersRequest request) {
        return new AsyncInvoker<CreateBareMetalServersRequest, CreateBareMetalServersResponse>(request,
            BmsMeta.createBareMetalServers, hcClient);
    }

    public CompletableFuture<DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordAsync(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.deleteWindowsBareMetalServerPassword);
    }

    public AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse> deleteWindowsBareMetalServerPasswordAsyncInvoker(
        DeleteWindowsBareMetalServerPasswordRequest request) {
        return new AsyncInvoker<DeleteWindowsBareMetalServerPasswordRequest, DeleteWindowsBareMetalServerPasswordResponse>(
            request, BmsMeta.deleteWindowsBareMetalServerPassword, hcClient);
    }

    public CompletableFuture<DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeAsync(
        DetachBaremetalServerVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.detachBaremetalServerVolume);
    }

    public AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse> detachBaremetalServerVolumeAsyncInvoker(
        DetachBaremetalServerVolumeRequest request) {
        return new AsyncInvoker<DetachBaremetalServerVolumeRequest, DetachBaremetalServerVolumeResponse>(request,
            BmsMeta.detachBaremetalServerVolume, hcClient);
    }

    public CompletableFuture<ListBareMetalServerDetailsResponse> listBareMetalServerDetailsAsync(
        ListBareMetalServerDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServerDetails);
    }

    public AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse> listBareMetalServerDetailsAsyncInvoker(
        ListBareMetalServerDetailsRequest request) {
        return new AsyncInvoker<ListBareMetalServerDetailsRequest, ListBareMetalServerDetailsResponse>(request,
            BmsMeta.listBareMetalServerDetails, hcClient);
    }

    public CompletableFuture<ListBareMetalServersResponse> listBareMetalServersAsync(
        ListBareMetalServersRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBareMetalServers);
    }

    public AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse> listBareMetalServersAsyncInvoker(
        ListBareMetalServersRequest request) {
        return new AsyncInvoker<ListBareMetalServersRequest, ListBareMetalServersResponse>(request,
            BmsMeta.listBareMetalServers, hcClient);
    }

    public CompletableFuture<ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsAsync(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.listBaremetalFlavorDetailExtends);
    }

    public AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse> listBaremetalFlavorDetailExtendsAsyncInvoker(
        ListBaremetalFlavorDetailExtendsRequest request) {
        return new AsyncInvoker<ListBaremetalFlavorDetailExtendsRequest, ListBaremetalFlavorDetailExtendsResponse>(
            request, BmsMeta.listBaremetalFlavorDetailExtends, hcClient);
    }

    public CompletableFuture<ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsAsync(
        ReinstallBaremetalServerOsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.reinstallBaremetalServerOs);
    }

    public AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse> reinstallBaremetalServerOsAsyncInvoker(
        ReinstallBaremetalServerOsRequest request) {
        return new AsyncInvoker<ReinstallBaremetalServerOsRequest, ReinstallBaremetalServerOsResponse>(request,
            BmsMeta.reinstallBaremetalServerOs, hcClient);
    }

    public CompletableFuture<ResetPwdOneClickResponse> resetPwdOneClickAsync(ResetPwdOneClickRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.resetPwdOneClick);
    }

    public AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse> resetPwdOneClickAsyncInvoker(
        ResetPwdOneClickRequest request) {
        return new AsyncInvoker<ResetPwdOneClickRequest, ResetPwdOneClickResponse>(request, BmsMeta.resetPwdOneClick,
            hcClient);
    }

    public CompletableFuture<ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsAsync(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerInterfaceAttachments);
    }

    public AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse> showBaremetalServerInterfaceAttachmentsAsyncInvoker(
        ShowBaremetalServerInterfaceAttachmentsRequest request) {
        return new AsyncInvoker<ShowBaremetalServerInterfaceAttachmentsRequest, ShowBaremetalServerInterfaceAttachmentsResponse>(
            request, BmsMeta.showBaremetalServerInterfaceAttachments, hcClient);
    }

    public CompletableFuture<ShowBaremetalServerTagsResponse> showBaremetalServerTagsAsync(
        ShowBaremetalServerTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerTags);
    }

    public AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse> showBaremetalServerTagsAsyncInvoker(
        ShowBaremetalServerTagsRequest request) {
        return new AsyncInvoker<ShowBaremetalServerTagsRequest, ShowBaremetalServerTagsResponse>(request,
            BmsMeta.showBaremetalServerTags, hcClient);
    }

    public CompletableFuture<ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoAsync(
        ShowBaremetalServerVolumeInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showBaremetalServerVolumeInfo);
    }

    public AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse> showBaremetalServerVolumeInfoAsyncInvoker(
        ShowBaremetalServerVolumeInfoRequest request) {
        return new AsyncInvoker<ShowBaremetalServerVolumeInfoRequest, ShowBaremetalServerVolumeInfoResponse>(request,
            BmsMeta.showBaremetalServerVolumeInfo, hcClient);
    }

    public CompletableFuture<ShowResetPwdResponse> showResetPwdAsync(ShowResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showResetPwd);
    }

    public AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse> showResetPwdAsyncInvoker(
        ShowResetPwdRequest request) {
        return new AsyncInvoker<ShowResetPwdRequest, ShowResetPwdResponse>(request, BmsMeta.showResetPwd, hcClient);
    }

    public CompletableFuture<ShowTenantQuotaResponse> showTenantQuotaAsync(ShowTenantQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showTenantQuota);
    }

    public AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse> showTenantQuotaAsyncInvoker(
        ShowTenantQuotaRequest request) {
        return new AsyncInvoker<ShowTenantQuotaRequest, ShowTenantQuotaResponse>(request, BmsMeta.showTenantQuota,
            hcClient);
    }

    public CompletableFuture<ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdAsync(
        ShowWindowsBaremetalServerPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showWindowsBaremetalServerPwd);
    }

    public AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse> showWindowsBaremetalServerPwdAsyncInvoker(
        ShowWindowsBaremetalServerPwdRequest request) {
        return new AsyncInvoker<ShowWindowsBaremetalServerPwdRequest, ShowWindowsBaremetalServerPwdResponse>(request,
            BmsMeta.showWindowsBaremetalServerPwd, hcClient);
    }

    public CompletableFuture<UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataAsync(
        UpdateBaremetalServerMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.updateBaremetalServerMetadata);
    }

    public AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse> updateBaremetalServerMetadataAsyncInvoker(
        UpdateBaremetalServerMetadataRequest request) {
        return new AsyncInvoker<UpdateBaremetalServerMetadataRequest, UpdateBaremetalServerMetadataResponse>(request,
            BmsMeta.updateBaremetalServerMetadata, hcClient);
    }

    public CompletableFuture<ShowSpecifiedVersionResponse> showSpecifiedVersionAsync(
        ShowSpecifiedVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showSpecifiedVersion);
    }

    public AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse> showSpecifiedVersionAsyncInvoker(
        ShowSpecifiedVersionRequest request) {
        return new AsyncInvoker<ShowSpecifiedVersionRequest, ShowSpecifiedVersionResponse>(request,
            BmsMeta.showSpecifiedVersion, hcClient);
    }

    public CompletableFuture<ShowVersionsInfoResponse> showVersionsInfoAsync(ShowVersionsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showVersionsInfo);
    }

    public AsyncInvoker<ShowVersionsInfoRequest, ShowVersionsInfoResponse> showVersionsInfoAsyncInvoker(
        ShowVersionsInfoRequest request) {
        return new AsyncInvoker<ShowVersionsInfoRequest, ShowVersionsInfoResponse>(request, BmsMeta.showVersionsInfo,
            hcClient);
    }

    public CompletableFuture<ShowJobInfosResponse> showJobInfosAsync(ShowJobInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, BmsMeta.showJobInfos);
    }

    public AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse> showJobInfosAsyncInvoker(
        ShowJobInfosRequest request) {
        return new AsyncInvoker<ShowJobInfosRequest, ShowJobInfosResponse>(request, BmsMeta.showJobInfos, hcClient);
    }

}

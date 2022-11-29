package com.g42cloud.sdk.ces.v2;

import com.g42cloud.sdk.ces.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CesAsyncClient {

    protected HcClient hcClient;

    public CesAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CesAsyncClient> newBuilder() {
        return new ClientBuilder<>(CesAsyncClient::new);
    }

    public CompletableFuture<AddAlarmRuleResourcesResponse> addAlarmRuleResourcesAsync(
        AddAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.addAlarmRuleResources);
    }

    public AsyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse> addAlarmRuleResourcesAsyncInvoker(
        AddAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<AddAlarmRuleResourcesRequest, AddAlarmRuleResourcesResponse>(request,
            CesMeta.addAlarmRuleResources, hcClient);
    }

    public CompletableFuture<BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesAsync(
        BatchDeleteAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchDeleteAlarmRules);
    }

    public AsyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse> batchDeleteAlarmRulesAsyncInvoker(
        BatchDeleteAlarmRulesRequest request) {
        return new AsyncInvoker<BatchDeleteAlarmRulesRequest, BatchDeleteAlarmRulesResponse>(request,
            CesMeta.batchDeleteAlarmRules, hcClient);
    }

    public CompletableFuture<BatchEnableAlarmRulesResponse> batchEnableAlarmRulesAsync(
        BatchEnableAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.batchEnableAlarmRules);
    }

    public AsyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse> batchEnableAlarmRulesAsyncInvoker(
        BatchEnableAlarmRulesRequest request) {
        return new AsyncInvoker<BatchEnableAlarmRulesRequest, BatchEnableAlarmRulesResponse>(request,
            CesMeta.batchEnableAlarmRules, hcClient);
    }

    public CompletableFuture<CreateAlarmRulesResponse> createAlarmRulesAsync(CreateAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.createAlarmRules);
    }

    public AsyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse> createAlarmRulesAsyncInvoker(
        CreateAlarmRulesRequest request) {
        return new AsyncInvoker<CreateAlarmRulesRequest, CreateAlarmRulesResponse>(request, CesMeta.createAlarmRules,
            hcClient);
    }

    public CompletableFuture<DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesAsync(
        DeleteAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.deleteAlarmRuleResources);
    }

    public AsyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse> deleteAlarmRuleResourcesAsyncInvoker(
        DeleteAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<DeleteAlarmRuleResourcesRequest, DeleteAlarmRuleResourcesResponse>(request,
            CesMeta.deleteAlarmRuleResources, hcClient);
    }

    public CompletableFuture<ListAgentDimensionInfoResponse> listAgentDimensionInfoAsync(
        ListAgentDimensionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAgentDimensionInfo);
    }

    public AsyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse> listAgentDimensionInfoAsyncInvoker(
        ListAgentDimensionInfoRequest request) {
        return new AsyncInvoker<ListAgentDimensionInfoRequest, ListAgentDimensionInfoResponse>(request,
            CesMeta.listAgentDimensionInfo, hcClient);
    }

    public CompletableFuture<ListAlarmHistoriesResponse> listAlarmHistoriesAsync(ListAlarmHistoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmHistories);
    }

    public AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse> listAlarmHistoriesAsyncInvoker(
        ListAlarmHistoriesRequest request) {
        return new AsyncInvoker<ListAlarmHistoriesRequest, ListAlarmHistoriesResponse>(request,
            CesMeta.listAlarmHistories, hcClient);
    }

    public CompletableFuture<ListAlarmRulePoliciesResponse> listAlarmRulePoliciesAsync(
        ListAlarmRulePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRulePolicies);
    }

    public AsyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse> listAlarmRulePoliciesAsyncInvoker(
        ListAlarmRulePoliciesRequest request) {
        return new AsyncInvoker<ListAlarmRulePoliciesRequest, ListAlarmRulePoliciesResponse>(request,
            CesMeta.listAlarmRulePolicies, hcClient);
    }

    public CompletableFuture<ListAlarmRuleResourcesResponse> listAlarmRuleResourcesAsync(
        ListAlarmRuleResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRuleResources);
    }

    public AsyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse> listAlarmRuleResourcesAsyncInvoker(
        ListAlarmRuleResourcesRequest request) {
        return new AsyncInvoker<ListAlarmRuleResourcesRequest, ListAlarmRuleResourcesResponse>(request,
            CesMeta.listAlarmRuleResources, hcClient);
    }

    public CompletableFuture<ListAlarmRulesResponse> listAlarmRulesAsync(ListAlarmRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.listAlarmRules);
    }

    public AsyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse> listAlarmRulesAsyncInvoker(
        ListAlarmRulesRequest request) {
        return new AsyncInvoker<ListAlarmRulesRequest, ListAlarmRulesResponse>(request, CesMeta.listAlarmRules,
            hcClient);
    }

    public CompletableFuture<UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesAsync(
        UpdateAlarmRulePoliciesRequest request) {
        return hcClient.asyncInvokeHttp(request, CesMeta.updateAlarmRulePolicies);
    }

    public AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse> updateAlarmRulePoliciesAsyncInvoker(
        UpdateAlarmRulePoliciesRequest request) {
        return new AsyncInvoker<UpdateAlarmRulePoliciesRequest, UpdateAlarmRulePoliciesResponse>(request,
            CesMeta.updateAlarmRulePolicies, hcClient);
    }

}

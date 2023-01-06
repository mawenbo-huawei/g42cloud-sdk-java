package com.g42cloud.sdk.cdn.v2;

import com.g42cloud.sdk.cdn.v2.model.*;
import com.g42cloud.sdk.core.ClientBuilder;
import com.g42cloud.sdk.core.HcClient;
import com.g42cloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CdnAsyncClient {

    protected HcClient hcClient;

    public CdnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdnAsyncClient> newBuilder() {
        return new ClientBuilder<>(CdnAsyncClient::new, "GlobalCredentials");
    }

    public CompletableFuture<ShowDomainLocationStatsResponse> showDomainLocationStatsAsync(
        ShowDomainLocationStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainLocationStats);
    }

    public AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsAsyncInvoker(
        ShowDomainLocationStatsRequest request) {
        return new AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>(request,
            CdnMeta.showDomainLocationStats, hcClient);
    }

    public CompletableFuture<ShowDomainStatsResponse> showDomainStatsAsync(ShowDomainStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    public AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsAsyncInvoker(
        ShowDomainStatsRequest request) {
        return new AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>(request, CdnMeta.showDomainStats,
            hcClient);
    }

    public CompletableFuture<ShowTopUrlResponse> showTopUrlAsync(ShowTopUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTopUrl);
    }

    public AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlAsyncInvoker(ShowTopUrlRequest request) {
        return new AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>(request, CdnMeta.showTopUrl, hcClient);
    }

}

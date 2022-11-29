package com.g42cloud.sdk.cse.v1;

import com.g42cloud.sdk.cse.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CseClient {

    protected HcClient hcClient;

    public CseClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CseClient> newBuilder() {
        return new ClientBuilder<>(CseClient::new);
    }

    public CreateEngineResponse createEngine(CreateEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createEngine);
    }

    public SyncInvoker<CreateEngineRequest, CreateEngineResponse> createEngineInvoker(CreateEngineRequest request) {
        return new SyncInvoker<CreateEngineRequest, CreateEngineResponse>(request, CseMeta.createEngine, hcClient);
    }

    public DeleteEngineResponse deleteEngine(DeleteEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deleteEngine);
    }

    public SyncInvoker<DeleteEngineRequest, DeleteEngineResponse> deleteEngineInvoker(DeleteEngineRequest request) {
        return new SyncInvoker<DeleteEngineRequest, DeleteEngineResponse>(request, CseMeta.deleteEngine, hcClient);
    }

    public DownloadKieResponse downloadKie(DownloadKieRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.downloadKie);
    }

    public SyncInvoker<DownloadKieRequest, DownloadKieResponse> downloadKieInvoker(DownloadKieRequest request) {
        return new SyncInvoker<DownloadKieRequest, DownloadKieResponse>(request, CseMeta.downloadKie, hcClient);
    }

    public ListEnginesResponse listEngines(ListEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listEngines);
    }

    public SyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesInvoker(ListEnginesRequest request) {
        return new SyncInvoker<ListEnginesRequest, ListEnginesResponse>(request, CseMeta.listEngines, hcClient);
    }

    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listFlavors);
    }

    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, CseMeta.listFlavors, hcClient);
    }

    public ShowEngineResponse showEngine(ShowEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngine);
    }

    public SyncInvoker<ShowEngineRequest, ShowEngineResponse> showEngineInvoker(ShowEngineRequest request) {
        return new SyncInvoker<ShowEngineRequest, ShowEngineResponse>(request, CseMeta.showEngine, hcClient);
    }

    public ShowEngineJobResponse showEngineJob(ShowEngineJobRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngineJob);
    }

    public SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJobInvoker(ShowEngineJobRequest request) {
        return new SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>(request, CseMeta.showEngineJob, hcClient);
    }

    public UploadKieResponse uploadKie(UploadKieRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.uploadKie);
    }

    public SyncInvoker<UploadKieRequest, UploadKieResponse> uploadKieInvoker(UploadKieRequest request) {
        return new SyncInvoker<UploadKieRequest, UploadKieResponse>(request, CseMeta.uploadKie, hcClient);
    }

}

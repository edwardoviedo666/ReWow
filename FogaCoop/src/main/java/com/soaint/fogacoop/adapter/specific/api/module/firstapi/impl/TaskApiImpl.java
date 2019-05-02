package com.soaint.fogacoop.adapter.specific.api.module.firstapi.impl;



import com.soaint.fogacoop.adapter.manager.EndpointManager;
import com.soaint.fogacoop.adapter.manager.impl.EndpointManagerAbstract;
import com.soaint.fogacoop.adapter.specific.api.module.firstapi.TaskApi;
import com.soaint.fogacoop.adapter.specific.infrastructure.EndpointConfig;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskApiImpl extends EndpointManagerAbstract implements TaskApi {

    private EndpointConfig endpointConfig;

    private EndpointManager endpointManager;

    @Autowired
    public TaskApiImpl(EndpointConfig endpointConfig) {
        super(endpointConfig);
    }

    @Override
    public Object findTasks() {
        return null;//endpointManager.endpointConsumerClient(TaskApiEndpoints.ENDPOINT_TEST, );
    }
}

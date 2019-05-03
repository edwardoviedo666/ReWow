package com.soaint.fogacoop.adapter.manager.impl;


import com.soaint.fogacoop.adapter.manager.EndpointManager;
import com.soaint.fogacoop.adapter.specific.cmis.util.ClientUtil;
import com.soaint.fogacoop.adapter.specific.infrastructure.EndpointConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Component
public abstract class EndpointManagerAbstract implements EndpointManager {

    private EndpointConfig endpointConfig;

    @Autowired
    public EndpointManagerAbstract(EndpointConfig endpointConfig) {
        this.endpointConfig = endpointConfig;
    }

    public ResponseEntity endpointConsumerClient(final String pathEndpoint,
                                                 final Class<?> typeResponse,
                                                 final HttpMethod method,
                                                 final HashMap<String, String> headers) {

        RestTemplate clientConsumer = new RestTemplate();
        HttpHeaders httpHeadersConsumer = ClientUtil.addHeaders(headers);
        return clientConsumer.exchange(pathEndpoint, method, new HttpEntity<>(httpHeadersConsumer), typeResponse);
    }

}

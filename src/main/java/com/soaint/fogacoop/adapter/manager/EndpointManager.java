package com.soaint.fogacoop.adapter.manager;


import com.soaint.fogacoop.adapter.specific.domain.response.TestDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;


import java.util.HashMap;


public interface EndpointManager {

    ResponseEntity<TestDTO> endpointConsumerClient(final String pathEndpoint,
                                                   final Class<?> typeResponse,
                                                   final HttpMethod method,
                                                   final HashMap<String, String> headers);
}

package com.soaint.fogacoop.adapter.manager.impl;


import com.soaint.fogacoop.adapter.manager.SpecificEndpointManager;
import com.soaint.fogacoop.adapter.specific.domain.response.TestDTO;
import com.soaint.fogacoop.adapter.specific.infrastructure.EndpointConfig;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class EndpointManagerImpl extends EndpointManagerAbstract implements SpecificEndpointManager {

    public EndpointManagerImpl(EndpointConfig endpointConfig) {
        super(endpointConfig);
    }

    @Override
    public ResponseEntity<TestDTO> findDatos() {
        return null;
    }

    @Override
    public ResponseEntity<TestDTO> findDatosById() {
        //TODO: Realice la implementación de los métodos definidos en la interfaz, si requiere agregar más metodos definalos en la interfaz.
        return null;
    }


}

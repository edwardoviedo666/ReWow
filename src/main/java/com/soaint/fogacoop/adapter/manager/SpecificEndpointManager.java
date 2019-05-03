package com.soaint.fogacoop.adapter.manager;


import com.soaint.fogacoop.adapter.specific.domain.response.TestDTO;
import org.springframework.http.ResponseEntity;

public interface SpecificEndpointManager {

    ResponseEntity<TestDTO> findDatos();

    ResponseEntity<TestDTO> findDatosById();

}

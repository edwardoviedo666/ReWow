package com.soaint.fogacoop.adapter.specific.domain.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestDTO {

    private String param1;
    private Integer param2;
    private boolean param3;


}

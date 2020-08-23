package com.rewow.commons.domains.generic;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@Builder
@ToString

public class MedicalServiceDTO {
    private Integer idService;
    private String nameService;

}

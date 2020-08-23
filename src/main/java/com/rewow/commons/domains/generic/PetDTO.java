package com.rewow.commons.domains.generic;

import lombok.*;
import org.springframework.web.bind.annotation.PostMapping;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@Builder
@ToString
public class PetDTO {
    private Integer PetId;
    private String ownerName;
    private String petName;
    private Integer age;
}

package com.soaint.fogacoop.commons.domains.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class MailTemplate {

    private String from;
    private String to;
    private String subject;
    private String content;
    private Map<String, String> model;

}

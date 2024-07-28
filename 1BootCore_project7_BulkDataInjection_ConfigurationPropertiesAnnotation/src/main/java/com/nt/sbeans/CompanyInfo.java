package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("ci")
@ConfigurationProperties(prefix="org.tech")
@Data
public class CompanyInfo {
private String name;
private String location;
private Double phoneNumber;
}

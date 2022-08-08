package com.optimagrowth.license.model;


import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 * RepresentationModel<License> License에 링크를 추가할 수 있도록 함
 * */

@Getter @Setter @ToString
public class License extends RepresentationModel<License> {

	private int id;
	private String licenseId;
	private String description;
	private String organizationId;
	private String productName;
	private String licenseType;

}
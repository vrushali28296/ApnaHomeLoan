package com.apnahomeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Entity
public class PropertyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Integer property_ID;
	@NotEmpty
	private String property_type;
	@NotEmpty
	private double property_area;
	@NotEmpty
	private double property_price;
	@NotEmpty
	private byte property_documents;
	@NotEmpty
	private String property_address;

}

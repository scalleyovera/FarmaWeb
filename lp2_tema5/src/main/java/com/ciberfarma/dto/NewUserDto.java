package com.ciberfarma.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewUserDto {
	private String nom_usua;
	private String ape_usua;
	private String correo;
	private String clave;
}

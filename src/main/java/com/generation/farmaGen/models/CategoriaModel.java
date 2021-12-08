package com.generation.farmaGen.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tbl_categoria")
public class CategoriaModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCat;
	
	@NotBlank
	@Size(max = 50)
	private String categoriaCat;
	
	@NotBlank
	@Size(max = 100)
	private String descricaoCat;

	public Long getIdCat() {
		return idCat;
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
	}

	public String getCategoriaCat() {
		return categoriaCat;
	}

	public void setCategoriaCat(String categoriaCat) {
		this.categoriaCat = categoriaCat;
	}

	public String getDescricaoCat() {
		return descricaoCat;
	}

	public void setDescricaoCat(String descricaoCat) {
		this.descricaoCat = descricaoCat;
	}
	
	
}

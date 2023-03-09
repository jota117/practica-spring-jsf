/**
 * 
 */
package com.devpredator.practicaspringjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Value;

import com.devpredator.practicaspringjsf.entity.Restaurante;
import com.devpredator.practicaspringjsf.services.RestauranteService;

import lombok.Getter;
import lombok.Setter;

/**
 * @author DevPredator
 * Controlador de ejemplo para demostrar la integracion de Spring con JSF.
 */
@ManagedBean
@ViewScoped
//:::::::AGREGA AQUI LAS ANOTACIONES DE JSF NECESARIAS::::
public class RestauranteController {

	@Getter @Setter
	private List<Restaurante> restaurantes;
	
	@Getter @Setter
	private List<Restaurante> restaurantesFiltrados;
	
	//:::: AGREGA AQUI LA ANOTACION QUE INYECTA UN BEAN DE SPRING CON JSF :::::::
	@Getter @Setter
	@ManagedProperty("#{restauranteServiceImpl}")
	private RestauranteService restauranteServiceImpl;
	
	@PostConstruct
	public void init() {		
		this.restaurantes = this.restauranteServiceImpl.consultarRestaurantes();
	}

}

/**
 * 
 */
package com.devpredator.practicaspringjsf.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpredator.practicaspringjsf.dao.RestauranteDAO;
import com.devpredator.practicaspringjsf.entity.Restaurante;
import com.devpredator.practicaspringjsf.services.RestauranteService;

/**
 * @author DevPredator
 *
 */
@Service
//:::::AGREGA AQUI LA ANOTACION PARA GENERAR UN BEAN DE NEGOCIO DE SPRING::::
public class RestauranteServiceImpl implements RestauranteService {

	//:::::: AGREGA AQUI LA ANOTACION PARA INYECTAR EL BEAN REPOSITORY DE SPRING ::::::::
	@Autowired
	private RestauranteDAO restauranteDAOImpl;
	
	@Override
	public List<Restaurante> consultarRestaurantes() {
		return this.restauranteDAOImpl.consultar();
	}
}

/**
 * 
 */
package com.devpredator.practicaspringjsf.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author DevPredator
 *
 */
@Entity
@Table(name = "menu")
public class Menu {

	@Getter @Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMenu;
	
	@Getter @Setter
	@Column(name = "clave", length = 11, nullable = false)
	private String clave;
	
	@Getter @Setter
	@Column(name = "descripcion", length = 500, nullable = false)
	private String descripcion;
	
	@Getter @Setter
	@Column(name = "fechaCreacion", nullable = false)
	private LocalDateTime fechaCreacion;
	
	@Getter @Setter
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Getter @Setter
	@Column(name = "estatus", nullable = false)
	private boolean estatus;

}

package com.example.demo.model;

import java.sql.Date;

import javax.persistence.*;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="cuentas")
@EntityListeners(AuditingEntityListener.class)
public class cuentas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "date_registro")
	@CreatedDate
	private Date date;
	

	public void Person(int id, String nombre, String pais, Date date) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return nombre;
	}

	public void setName(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "cuentas [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", date_registro=" + date + "]";
	}

	
}

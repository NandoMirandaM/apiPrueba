package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.cuentas;
import com.example.demo.repository.cuentasRepository;


@RestController
@RequestMapping("/api")
public class cuentasController {
	
	@Autowired
	private cuentasRepository repository;
	
	
	@GetMapping("/cuentas")
	public List<cuentas> allcuentas(){
		return repository.findAll();
	}
	
	@GetMapping("/cuentas/{id}")
	public List<cuentas> findById(@PathVariable("id") int id) {
		return repository.findById(id);
	}
	
	@PostMapping("/cuentas")
	public cuentas createPerson(@RequestBody cuentas cuenta) {
		return repository.save(cuenta);
	}
	
	@PutMapping("/cuentas/{id}")
	public cuentas updatecuentas(@PathVariable int id ,@RequestBody cuentas cuenta) {
		return repository.save(cuenta);
	}
	
	@DeleteMapping("/cuentas/{id}")
	public void deletecuentas(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}

}

package com.github.vitorhla.dslearn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.vitorhla.dslearn.dto.DeliverRevisionDTO;
import com.github.vitorhla.dslearn.services.DeliverService;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverController {

	@Autowired
	private DeliverService service;
	
	
	@PutMapping(value =  "/{id}")
	public ResponseEntity <Void> saveRevision(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto){
		service.saveRevision(id,dto);
		return ResponseEntity.noContent().build();
		
	}
	
	
}

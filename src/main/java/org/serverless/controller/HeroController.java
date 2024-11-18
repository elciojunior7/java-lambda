package org.serverless.controller;

import org.serverless.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/heroes")
public class HeroController {

	@Autowired
	private HeroService apiService;


	@GetMapping("")
	public ResponseEntity<Object> findAll() {

		try {
			return ResponseEntity.ok(apiService.getHeroes());

		} catch (Exception e) {
			return (ResponseEntity<Object>) ResponseEntity.badRequest();
		}
	}

}
package com.example.ProjetoSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjetoSpring.dto.GameMinDto;
import com.example.ProjetoSpring.entities.Game;
import com.example.ProjetoSpring.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDto> findAll() {
		List<GameMinDto>  result = gameService.findAll();
		return  result;
		
	}

}

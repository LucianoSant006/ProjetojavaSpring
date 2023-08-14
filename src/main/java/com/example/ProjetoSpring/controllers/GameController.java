package com.example.ProjetoSpring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjetoSpring.dto.GameDto;
import com.example.ProjetoSpring.dto.GameListDto;
import com.example.ProjetoSpring.dto.GameMinDto;
import com.example.ProjetoSpring.services.GameListService;
import com.example.ProjetoSpring.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameController {
	
	@Autowired
	private GameListService gameListService;
	
	
	
	@GetMapping
	public List<GameListDto> findAll() {
		List<GameListDto>  result = gameListService.findAll();
		return  result;
		
	}
	

}

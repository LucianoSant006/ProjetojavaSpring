package com.example.ProjetoSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ProjetoSpring.dto.GameDto;
import com.example.ProjetoSpring.dto.GameListDto;
import com.example.ProjetoSpring.dto.GameMinDto;
import com.example.ProjetoSpring.entities.Game;
import com.example.ProjetoSpring.entities.GameList;
import com.example.ProjetoSpring.repositories.GameListRepository;
import com.example.ProjetoSpring.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDto> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDto(x)).toList();
		
		
		
	}
	

}

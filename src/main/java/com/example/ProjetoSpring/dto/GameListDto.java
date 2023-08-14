package com.example.ProjetoSpring.dto;

import com.example.ProjetoSpring.entities.GameList;

public class GameListDto {
	 private Long id; 
	  private String title;
	  
	  public GameListDto() {
		  
	  }

	public GameListDto(GameList entity) {
		
		id = entity.getId();
		title = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	  
	  
	  

}

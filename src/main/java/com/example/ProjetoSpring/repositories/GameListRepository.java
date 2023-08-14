package com.example.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoSpring.entities.Game;
import com.example.ProjetoSpring.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}

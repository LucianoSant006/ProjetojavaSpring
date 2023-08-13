package com.example.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjetoSpring.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}

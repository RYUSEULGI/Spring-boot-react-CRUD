package com.example.demo.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bbs.domain.Board;

interface BoardCustomRepository{}

public interface BoardRepository extends JpaRepository<Board, Long>,
											BoardCustomRepository{

}

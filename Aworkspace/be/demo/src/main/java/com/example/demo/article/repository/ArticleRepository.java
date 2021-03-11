package com.example.demo.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.article.domain.Article;

interface ArticleCustomRepository{}

public interface ArticleRepository extends JpaRepository<Article, Long>, 
											ArticleCustomRepository{

}

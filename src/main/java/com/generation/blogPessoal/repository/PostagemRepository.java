package com.generation.blogPessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogPessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{

}

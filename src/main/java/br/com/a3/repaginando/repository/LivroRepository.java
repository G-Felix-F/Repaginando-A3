package br.com.a3.repaginando.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.a3.repaginando.entity.LivroEntity;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {

}

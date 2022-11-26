package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Escuela;


@Repository
public interface EscuelaRepository extends JpaRepository<Escuela, Long>{

}

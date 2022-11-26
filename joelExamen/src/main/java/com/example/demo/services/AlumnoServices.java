package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Alumno;
import com.example.demo.repository.AlumnoRepository;

@Service
public class AlumnoServices implements 	AlumnoRepository{

	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Alumno> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return alumnoRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends Alumno> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return alumnoRepository.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<Alumno> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alumno getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno getReferenceById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll(example);
	}

	@Override
	public <S extends Alumno> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return alumnoRepository.saveAll(entities);
	}

	@Override
	public List<Alumno> findAll() {
		// TODO Auto-generated method stub
		
		return alumnoRepository.findAll();
	}

	@Override
	public List<Alumno> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> S save(S entity) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(entity);
	}

	@Override
	public Optional<Alumno> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);
	}

	@Override
	public void delete(Alumno entity) {
		// TODO Auto-generated method stub
		alumnoRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Alumno> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Alumno> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Alumno> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Alumno> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Alumno> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Alumno> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Alumno, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

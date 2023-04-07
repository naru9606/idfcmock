package com.jsp.idfcmock.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.idfcmock.dto.Stdto;
import com.jsp.idfcmock.repositiory.UserRepository;

@Component
public class Stdao {
@Autowired
UserRepository repository;

public void insert(Stdto dto) {
	repository.save(dto);
}
public void delete(int id) {
	repository.deleteById(id);
}
public Stdto fetch(Stdto dto) {
	Optional<Stdto> d=repository.findById(dto.getStdid());
	Stdto r=d.get();
	return r;
}
}

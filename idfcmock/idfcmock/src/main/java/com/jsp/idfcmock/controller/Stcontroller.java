package com.jsp.idfcmock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.idfcmock.dao.Stdao;
import com.jsp.idfcmock.dto.Stdto;

@RestController
public class Stcontroller {
	
	@Autowired
	Stdao dao;
@PostMapping("/insert")
public void insert(@RequestBody Stdto dto) {
	dao.insert(dto);
	
}
@DeleteMapping("/delete")
public void delete(@RequestBody Stdto dto) {
	int id=dto.getStdid();
	dao.delete(id);
}
@GetMapping("/fetch")
public String fetch(@RequestBody Stdto dto) {
Stdto t=dao.fetch(dto);
	return t.toString();
}
}

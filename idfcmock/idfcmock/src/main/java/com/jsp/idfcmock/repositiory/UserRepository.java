package com.jsp.idfcmock.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.idfcmock.dto.Stdto;
@Repository
public interface UserRepository extends JpaRepository<Stdto, Integer>{

}

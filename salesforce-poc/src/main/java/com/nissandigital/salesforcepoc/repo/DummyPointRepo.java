package com.nissandigital.salesforcepoc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.nissandigital.salesforcepoc.model.DummyPoint;

@Component
public interface DummyPointRepo extends JpaRepository<DummyPoint, String>{

	

}

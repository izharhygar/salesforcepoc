package com.nissandigital.salesforcepoc.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nissandigital.salesforcepoc.model.DummyPoint;
import com.nissandigital.salesforcepoc.repo.DummyPointRepo;

@Service
public class DummyPointService {
	
	@Autowired
	private DummyPointRepo repo;
	
	public List<DummyPoint> getAllPoints(){
		return repo.findAll();
	}
	
	public DummyPoint getOnePoint(String Id) {
		
		return repo.findById(Id).orElse(new DummyPoint());
	}
	
	public ResponseEntity<DummyPoint> postDummyPoint(DummyPoint dummyPoint) {
		DummyPoint savedDummyPoint = repo.save(dummyPoint);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cardNumberHouse}")
				.buildAndExpand(savedDummyPoint.getCardNumberHouse()).toUri();

		return ResponseEntity.created(location).build();
		
	}
	
	public ResponseEntity<DummyPoint> updateDummyPointByID(DummyPoint dummyPoint, String id) {
		
		Optional<DummyPoint> dummyPointOptional = repo.findById(id);

		if (!dummyPointOptional.isPresent())
			return ResponseEntity.notFound().build();

		dummyPoint.setCardNumberHouse(id);
		
		repo.save(dummyPoint);

		return ResponseEntity.noContent().build();
	}
	
	public ResponseEntity<DummyPoint> deleteDummyPointByID(String id)
	{

		Optional<DummyPoint> dummyPointOptional = repo.findById(id);

		if (!dummyPointOptional.isPresent())
			return ResponseEntity.notFound().build();
		
		repo.deleteById(id);
		return ResponseEntity.noContent().build();
		
	}

}

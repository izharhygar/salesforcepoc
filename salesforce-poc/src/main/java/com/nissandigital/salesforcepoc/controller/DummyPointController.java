package com.nissandigital.salesforcepoc.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nissandigital.salesforcepoc.model.DummyPoint;
import com.nissandigital.salesforcepoc.service.DummyPointService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
@Api(value = "salesforce POC controller", description = "Salesforce POC REST endpoint ")
@RequestMapping("dummypoint")
public class DummyPointController {
	
	@Autowired
	private DummyPointService service;

	@ApiOperation(value="get data of all DummyPoints")
	@ApiResponses(value= {
			@ApiResponse(code = 400, message = "Bad Request!!. Please Check your URL"),
			@ApiResponse(code = 200, message = "OK! records fetched")
	})
	@GetMapping(produces = "application/json")
	public List<DummyPoint> getAllDummyPoints()
	{
		return service.getAllPoints();
	}	
	
	@ApiOperation(value = "get data of a specific dummy point using cardHouseNumber")
	@ApiResponses(value= {
			@ApiResponse(code = 400, message = "Bad Request!!. Please Check your URL"),
			@ApiResponse(code = 200, message = "OK! record fetched")
	})
	@GetMapping(value = "/{id}", produces = "application/json")
	public DummyPoint getOneDummyPoint(@PathVariable("id") String Id)
	{
		return service.getOnePoint(Id);
	}
	
	@ApiOperation("post a new DummyPoint through Request Body")
	@ApiResponses(value= {
			@ApiResponse(code = 201, message = "No content as response!!. Record succesfully created"),
			@ApiResponse(code = 500, message = "Internal error! our bad so sorry")
	})
	@PostMapping
	public 	ResponseEntity<DummyPoint> postoneCustomer(@RequestBody DummyPoint dummyPoint)
	{ 
		return service.postDummyPoint(dummyPoint);	 
	}
	
	
	@ApiOperation("update an already created dummy point record using cardHouseNumber")
	@ApiResponses(value= {
			@ApiResponse(code = 204, message = "No Content as response!!. Record succesfully updated"),
			@ApiResponse(code = 500, message = "Internal error! our bad so sorry")
	})
	@PutMapping("/{id}")
	public ResponseEntity<DummyPoint> updateDummyPoint(@RequestBody DummyPoint dummyPoint,@PathVariable String id )
	{
		return service.updateDummyPointByID(dummyPoint,id);
	}
	
	@ApiOperation("delete an already created dummy point record using cardHouseNumber")
	@ApiResponses(value= {
			@ApiResponse(code = 204, message = "No content!!. Record succesfully deleted"),
			@ApiResponse(code = 500, message = "Internal error! our bad so sorry")
	})
	@DeleteMapping("/{id}")
	public ResponseEntity<DummyPoint> deleteDummyPoint(@PathVariable("id") String ID)
	{
		return service.deleteDummyPointByID(ID);
	}
	
	
	
}
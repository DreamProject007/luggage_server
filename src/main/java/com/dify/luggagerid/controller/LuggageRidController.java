package com.dify.luggagerid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dify.luggagerid.entity.LocationEntity;
import com.dify.luggagerid.exception.LuggageRidException;
import com.dify.luggagerid.service.LocationService;

@CrossOrigin
@RestController
@RequestMapping("/api1")
public class LuggageRidController {
	
	@Autowired
	private LocationService locationService;
	
	@GetMapping("/allplaces/{city}")
	public ResponseEntity<List<LocationEntity>> getAllData(@PathVariable String city) throws LuggageRidException{
		List<LocationEntity> list = locationService.findByCity(city);
		return new ResponseEntity<List<LocationEntity>>(list, HttpStatus.OK);
	}
	
}

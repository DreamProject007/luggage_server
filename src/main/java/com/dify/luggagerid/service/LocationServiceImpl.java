package com.dify.luggagerid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dify.luggagerid.entity.LocationEntity;
import com.dify.luggagerid.exception.LuggageRidException;
import com.dify.luggagerid.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository locationRepository;
	
	@Override
	public List<LocationEntity> findByCity(String city) throws LuggageRidException {
		
		List<LocationEntity> list = locationRepository.findByCity(city);
		if(list.size()==0) {
			throw new LuggageRidException("Service.CITY_NOT_FOUND");
		}
		return list;
	}

}

package com.dify.luggagerid.service;

import java.util.List;

import com.dify.luggagerid.entity.LocationEntity;
import com.dify.luggagerid.exception.LuggageRidException;

public interface LocationService {

	public List<LocationEntity> findByCity(String city) throws LuggageRidException;

	public List<LocationEntity> findAllPlaces();

}

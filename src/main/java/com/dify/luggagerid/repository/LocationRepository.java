package com.dify.luggagerid.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dify.luggagerid.entity.LocationEntity;

@Repository
public interface LocationRepository extends CrudRepository<LocationEntity, String>{

	public List<LocationEntity> findByCity(String city);

}

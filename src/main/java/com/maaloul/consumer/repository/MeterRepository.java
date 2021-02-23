package com.maaloul.consumer.repository;

import com.maaloul.consumer.model.Meter;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface MeterRepository extends ElasticsearchRepository<Meter, Long> {
    List<Meter> findByLogicalDeviceName(String logicalDeviceName);
    
}

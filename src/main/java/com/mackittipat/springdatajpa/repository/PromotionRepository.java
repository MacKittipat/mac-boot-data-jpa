package com.mackittipat.springdatajpa.repository;

import com.mackittipat.springdatajpa.domain.Promotion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends CrudRepository<Promotion, Long> {
}

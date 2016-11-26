package com.mackittipat.springbootjpa.repository;

import com.mackittipat.springbootjpa.domain.Promotion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends CrudRepository<Promotion, Long> {
}

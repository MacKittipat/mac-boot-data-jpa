package com.mackittipat.springdatajpa.repository;

import com.mackittipat.springdatajpa.domain.Groups;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsRepository extends CrudRepository<Groups, Long> {
}

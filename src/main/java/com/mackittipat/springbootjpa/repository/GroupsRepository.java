package com.mackittipat.springbootjpa.repository;

import com.mackittipat.springbootjpa.domain.Groups;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsRepository extends CrudRepository<Groups, Long> {
}

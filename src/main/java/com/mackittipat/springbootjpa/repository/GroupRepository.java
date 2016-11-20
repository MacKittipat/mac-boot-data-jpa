package com.mackittipat.springbootjpa.repository;

import com.mackittipat.springbootjpa.domain.Group;
import org.springframework.data.repository.CrudRepository;

public interface GroupRepository extends CrudRepository<Group, Long> {
}

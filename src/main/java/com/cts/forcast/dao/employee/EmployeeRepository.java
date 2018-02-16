package com.cts.forcast.dao.employee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {

    List<EmployeeEntity> findByAssociateName(String lastName);
}
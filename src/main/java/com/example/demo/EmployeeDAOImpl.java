package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
	//@PersistenceContext
    //EntityManager entityManager;

	@Override
	public void createEmployee(EmployeeDTO employeeDTO) {
	
		
	}

}

package com.springbootdemo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springbootdemo.model.User;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long>{
	
	User findByName(String name);
	
	
	@Query("Select c from User c where c.name like :name%")
	List<User> searchByNameStartsWith(@Param("name")String name);
	
	
	


	
	@Query("Select c from User c where c.salary LIKE :salary")
		List<User> findBySalaryStartsWith(@Param("salary")Integer salary);


	
}

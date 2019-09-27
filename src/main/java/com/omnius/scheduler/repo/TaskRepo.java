package com.omnius.scheduler.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.omnius.scheduler.models.Task;

@Repository

public interface TaskRepo extends JpaRepository<Task,Integer>{
	
}

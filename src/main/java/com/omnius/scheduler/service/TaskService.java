package com.omnius.scheduler.service;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omnius.scheduler.models.Task;
import com.omnius.scheduler.repo.TaskRepo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

@Data
@Service
public class TaskService {
	
	@Autowired
	private final TaskRepo taskRepo;

    public List<Task> findAll() {
        return taskRepo.findAll();
    }

    public Optional<Task> findById(final Integer id) {
        return taskRepo.findById(id);
    }

    public Task save(final Task task) {
        return taskRepo.save(task);
    }

    public void deleteById(final Integer id) {
        taskRepo.deleteById(id);
    }
	
	
		
}

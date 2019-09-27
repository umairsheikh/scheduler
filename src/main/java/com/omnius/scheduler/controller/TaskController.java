package com.omnius.scheduler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

import com.omnius.scheduler.models.Task;
import com.omnius.scheduler.service.TaskService;
	

	@CrossOrigin
	@RestController
	@RequestMapping(path ="/api/task")
	public class TaskController {

	    @Autowired
	    TaskService taskService;

	    @GetMapping("/all")
	    public List<Task> getAllTasks() {
	    	System.out.println("getallTasks");
	        return taskService.findAll();
	    }

	    @PostMapping("/create")
	    public Task createTask(@Valid @RequestBody Task task) {
	     	
	    	return taskService.save(task);
	    }

	    @GetMapping("/{id}")
	    public Optional<Task> getTaskById(@PathVariable(value = "id") int taskId) {
	     	System.out.println("getTaskByID");
	        return taskService.findById(taskId);
	               
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<Task> update(@PathVariable Integer id, @Valid @RequestBody Task product) {
	        if (!taskService.findById(id).isPresent()) {
	            System.out.println("Id " + id + " is not existed");
	            ResponseEntity.badRequest().build();
	        }

	        return ResponseEntity.ok(taskService.save(product));
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity delete(@PathVariable Integer id) {
	        if (!taskService.findById(id).isPresent()) {
	            System.out.println("Id " + id + " is not existed");
	            ResponseEntity.badRequest().build();
	        }
	        taskService.deleteById(id);
	        return ResponseEntity.ok().build();
	    }
	    
	}
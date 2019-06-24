package com.fsd.projectmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsd.projectmanager.entity.Task;

@Repository("taskRepository")
public interface TaskRepository extends JpaRepository<Task, Integer>{
	public Task findTaskIdByTask(String task);
	

}

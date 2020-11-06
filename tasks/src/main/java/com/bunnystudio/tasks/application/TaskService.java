package com.bunnystudio.tasks.application;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.bunnystudio.tasks.domain.TaskDto;
import com.bunnystudio.tasks.domain.TaskRepository;
import com.bunnystudio.tasks.domain.TaskStatus;
import com.bunnystudio.tasks.domain.TaskUtil;
import com.bunnystudio.tasks.domain.documents.Task;
import com.bunnystudio.tasks.infrastructure.InvalidValueException;
import com.bunnystudio.tasks.infrastructure.NotFoundException;

@Validated
@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public List<TaskDto> getAll() {
		return taskRepository.findAll().stream()
				.map(TaskUtil::convertToDto)
				.collect(Collectors.toList());
	}

	public TaskDto findTask(long taskId) {
		Task task = taskRepository.findById(taskId)
				.orElseThrow(() -> new NotFoundException(taskId));
		return TaskUtil.convertToDto(task);
	}
	
	public List<TaskDto> findTaskByUserId(long userId) {
		List<Task> tasks = taskRepository.findByUserId(userId);
		return tasks.stream().map(TaskUtil::convertToDto)
				.collect(Collectors.toList());
	}

	public TaskDto addTask(@Valid TaskDto taskDto) {
		if(taskDto.getUserId() <= 0) {
			throw new InvalidValueException("UserId is required. Invalid userId: " + taskDto.getUserId());
		}
		if(taskDto.getStatus() == null) {
			taskDto.setStatus(TaskStatus.TODO);
		}
			
		Task savedTask = taskRepository.save(TaskUtil.convertToDocument(taskDto));
		return TaskUtil.convertToDto(savedTask);
	}

	public TaskDto updateTask(@Valid TaskDto taskDto) {
		Task task = taskRepository.findById(taskDto.getId())
				.orElseThrow(() -> new NotFoundException(taskDto.getId()));
		task.setDesc(taskDto.getDesc());
		task.setStatus(taskDto.getStatus());
		Task saved = taskRepository.save(task);
		return TaskUtil.convertToDto(saved);
	}

	public TaskDto deleteTask(@Valid long taskId) {
		Task task = taskRepository.findById(taskId)
				.orElseThrow(() -> new NotFoundException(taskId));
		taskRepository.delete(task);
		return TaskUtil.convertToDto(task);
	}

	
}

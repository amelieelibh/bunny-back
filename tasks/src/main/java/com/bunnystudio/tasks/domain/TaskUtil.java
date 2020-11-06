package com.bunnystudio.tasks.domain;

import com.bunnystudio.tasks.domain.documents.Task;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class TaskUtil {
	
	public static Task convertToDocument(TaskDto taskDto) {
		return Task.builder()
				.id(taskDto.getId())
				.userId(taskDto.getUserId())
				.desc(taskDto.getDesc())
				.status(taskDto.getStatus())
				.build();
	}
	
	public static TaskDto convertToDto(Task task) {
		return TaskDto.builder()
				.id(task.getId())
				.userId(task.getUserId())
				.desc(task.getDesc())
				.status(task.getStatus())
				.build();
	}
}
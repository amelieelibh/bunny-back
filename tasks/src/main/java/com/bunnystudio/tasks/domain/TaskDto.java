package com.bunnystudio.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDto {

	private long id;
	
	private long userId;
	
	private String desc;
	
	private TaskStatus status;
}

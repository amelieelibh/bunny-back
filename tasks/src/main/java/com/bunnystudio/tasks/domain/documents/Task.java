package com.bunnystudio.tasks.domain.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bunnystudio.tasks.domain.TaskStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tasks")
public class Task {

	@Transient
	public static final String SEQUENCE_NAME = "tasks_sequence";

	@Id
	private long id;
	
	@Indexed(direction = IndexDirection.ASCENDING)
	private long userId;
	
	private String desc;
	
	private TaskStatus status;
}

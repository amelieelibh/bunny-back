package com.bunnystudio.tasks.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.bunnystudio.tasks.application.SequenceGeneratorService;
import com.bunnystudio.tasks.domain.documents.Task;

@Component
public class TaskModelListener extends AbstractMongoEventListener<Task> {

	@Autowired
	private SequenceGeneratorService sequenceGenerator;
	
	@Override
	public void onBeforeConvert(BeforeConvertEvent<Task> event) {
	    if (event.getSource().getId() < 1) {
	        event.getSource().setId(sequenceGenerator.generateSequence(Task.SEQUENCE_NAME));
	    }
	}
	
}

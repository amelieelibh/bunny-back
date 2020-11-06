package com.bunnystudio.users.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

import com.bunnystudio.users.application.SequenceGeneratorService;
import com.bunnystudio.users.domain.documents.User;

@Component
public class UserModelListener extends AbstractMongoEventListener<User> {

	@Autowired
	private SequenceGeneratorService sequenceGenerator;
	
	@Override
	public void onBeforeConvert(BeforeConvertEvent<User> event) {
	    if (event.getSource().getId() < 1) {
	        event.getSource().setId(sequenceGenerator.generateSequence(User.SEQUENCE_NAME));
	    }
	}
	
}

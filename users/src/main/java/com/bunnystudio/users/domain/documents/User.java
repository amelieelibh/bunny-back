package com.bunnystudio.users.domain.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class User {

	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";
 
	@Id
	private long id;
	
	@Indexed(direction = IndexDirection.ASCENDING)
	private String name;
}

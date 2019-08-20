package com.minhduc.LearningCriteria.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Person {
	
	@Id
	@GeneratedValue()
	private Long id;
	
	private String nickName;
	
	private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;
	
	@OneToMany()
	private L
}

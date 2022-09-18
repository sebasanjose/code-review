package com.interchecks.review.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "COMPANYNAME")
	private String companyName;
	private String position;

	@ManyToOne
	private Person person;

}

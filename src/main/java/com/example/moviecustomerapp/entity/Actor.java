package com.example.moviecustomerapp.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Actor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long actorNo;
	
	@Column(nullable = false, unique = true)
	private String actorName;
	
	@OneToMany(mappedBy = "movieNo",cascade=CascadeType.ALL)
	List<Movie> movies;

}	

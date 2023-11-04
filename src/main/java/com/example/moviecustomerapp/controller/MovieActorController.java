package com.example.moviecustomerapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviecustomerapp.dao.ActorRepository;
import com.example.moviecustomerapp.dao.MovieRepository;
import com.example.moviecustomerapp.entity.Movie;

@RestController
public class MovieActorController {
	
	@Autowired
	ActorRepository actorRepository;
	
	@Autowired
	MovieRepository movieRepository;
	
	@GetMapping("/movie/{id}")
	public ResponseEntity<Movie> getMovie(@RequestParam Long movieNo){
		
		try {
			Optional<Movie> movie = movieRepository.findById(movieNo);
			movie.ifPresentOrElse();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return HttpStatus.;
		
	}

}

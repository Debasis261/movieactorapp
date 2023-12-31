package com.example.moviecustomerapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviecustomerapp.dao.ActorRepository;
import com.example.moviecustomerapp.dao.MovieRepository;
import com.example.moviecustomerapp.entity.Actor;
import com.example.moviecustomerapp.entity.Movie;

@RestController
@RequestMapping("/movieactorapp")
public class MovieActorController {

	@Autowired
	ActorRepository actorRepository;

	@Autowired
	MovieRepository movieRepository;

	@GetMapping(value="/movie/{id}")
	@ResponseBody
	public ResponseEntity<Movie> getMovie(@PathVariable(name = "id", required = true) String movieNo) {
		Optional<Movie> movie = null;
		try {
			movie = movieRepository.findById(Long.parseLong(movieNo));

		} catch (Exception e) {

			e.printStackTrace();
		}

		if (movie.isPresent())
			return ResponseEntity.ok().body(movie.get());
		else
			return ResponseEntity.notFound().build();
	}

	@PostMapping(value="/movie/createmovie")
	public ResponseEntity<Movie> createMovieRecord(@RequestBody Movie movie) {

		try {
			movieRepository.save(movie);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

	@PostMapping(value="/actor/createactor")
	public ResponseEntity<Movie> createActorRecord(@RequestBody Actor actor) {

		try {
			actorRepository.save(actor);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

	@GetMapping(value="/actor/{id}")
	@ResponseBody
	public ResponseEntity<Actor> getActor(@PathVariable(name = "id", required = true) String actorId) {
		Optional<Actor> actor = null;
		try {
			actor=actorRepository.findById(Long.parseLong(actorId));
		} catch (Exception e) {
				
			e.printStackTrace();
		}

		if (actor.isPresent())
			return ResponseEntity.ok().body(actor.get());
		else
			return ResponseEntity.notFound().build();
	}

}

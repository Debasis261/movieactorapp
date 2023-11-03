package com.example.moviecustomerapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moviecustomerapp.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long> {

}

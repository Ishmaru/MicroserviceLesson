package com.tts.basicJoke.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.basicJoke.model.Joke;

@Repository
public interface JokeRepository extends CrudRepository<Joke, Long>  {
	@Override
	public List<Joke> findAll();
	public Joke findJokeById(Long id);
}

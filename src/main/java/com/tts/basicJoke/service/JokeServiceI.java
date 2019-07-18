package com.tts.basicJoke.service;

import java.util.List;

import com.tts.basicJoke.model.Joke;

public interface JokeServiceI {
    public List<Joke> findAll();
    
   	public Joke findJokeById(Long id);

	public void saveJoke(Joke joke);
	
	public void deleteAll() ;
	
	public void deleteJokeById(Long id);
	
	public void updateJokeById(Long id, Joke jokeData);
}

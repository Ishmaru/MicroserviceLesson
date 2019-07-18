package com.tts.basicJoke.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.basicJoke.model.Joke;
import com.tts.basicJoke.repository.JokeRepository;

@Service
public class JokeServiceImpl implements JokeServiceI{

	@Autowired
	private JokeRepository jokeRepository;
	
	@Override
	public List<Joke> findAll(){
		return jokeRepository.findAll();
	}

	@Override
	public Joke findJokeById(Long id) {
		return jokeRepository.findJokeById(id);
	}
	
	@Override
	public void saveJoke(Joke joke) {
		jokeRepository.save(joke);
	}
	
	@Override
	public void deleteAll() {
		jokeRepository.deleteAll();
	}
	
	@Override
	public void deleteJokeById(Long id) {
		jokeRepository.deleteById(id);
	}
	
	@Override
	public void updateJokeById(Long id, Joke jokeData) {
		Joke jokeToReplace = jokeRepository.findJokeById(id);
		String content = jokeData.getContent();
		String punchLine = jokeData.getPunchLine();
		if(content != null) jokeToReplace.setContent(content);
		if(punchLine != null) jokeToReplace.setPunchLine(punchLine);
		jokeRepository.save(jokeToReplace);
	}
}

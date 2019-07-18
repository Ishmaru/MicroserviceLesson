package com.tts.basicJoke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.basicJoke.model.Joke;
import com.tts.basicJoke.service.JokeServiceImpl;

@RestController
public class JokeController {
	
	@Autowired
	JokeServiceImpl jokeServiceImpl;
	
	@GetMapping("/")
	public String index()
	{
		return "<h1>Joke Home Page</h1>";
	}
	
	@GetMapping("/joke/{id}")
	public Joke findById(@PathVariable("id") Long id) {
		return jokeServiceImpl.findJokeById(id);
	}
	//Add CrossOrigin to allow for crossorigin requests from specified url:port
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/jokes")
	public List<Joke> getAllJokes(){
		return jokeServiceImpl.findAll();
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/joke/new")
	public String createJoke(Joke joke){
		jokeServiceImpl.saveJoke(joke);
		return "Message Created Successfully";
	}
	
	@DeleteMapping("/joke/{id}")
	public String deleteJokeById(@PathVariable("id") Long id) {
		jokeServiceImpl.deleteJokeById(id);
		return "Joke deleted Successfully";
	}
	
	@DeleteMapping("/jokes")
	public String deleteAllJokes() {
		jokeServiceImpl.deleteAll();
		return "All jokes deleted Successfully";
	}
	
	@PostMapping("/joke/{id}")
	public String updateJokeById(@PathVariable("id") Long id, Joke joke) {
		jokeServiceImpl.updateJokeById(id, joke);
		return "Jokes updated Successfully";
	}
}

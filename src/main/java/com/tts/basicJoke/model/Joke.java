package com.tts.basicJoke.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Joke {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String content;
	private String punchLine;
	public Joke() {
	}
	public Joke(String content, String punchLine) {
		this.content = content;
		this.punchLine = punchLine;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPunchLine() {
		return punchLine;
	}
	public void setPunchLine(String punchLine) {
		this.punchLine = punchLine;
	}
	public Long getId() {
		return id;
	}
}

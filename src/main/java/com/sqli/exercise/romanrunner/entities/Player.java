package com.sqli.exercise.romanrunner.entities;

import java.util.List;

public abstract class Player {
	
	protected int score;
	protected boolean isPlay;
	protected String name; 
	protected char charactere;
	protected char ancien_charactere_1;
	protected char ancien_charactere_2;
	protected int niveau;
	protected boolean position;
	protected Circences circences;
	
	
	
	public Player() {
	}
	public Player(String name) {
		this.name = name;
		int a=name.charAt(0)-('a'-'A');
		charactere=(char) a;
	}
	 public void startGame(Circences c) 
	 {
		 niveau=score=0;
		 isPlay=true;
		 position=false;
		 circences=c;
		 
		 ancien_charactere_1='@';
		 ancien_charactere_2=' ';
		 
		 List<String> piste=c.getPiste();
		 piste.set(0,"|"+charactere+" |");
		 
	 }
	
	abstract public Player forward() throws ObstacleHitedException;
	abstract public Player right() throws ObstacleHitedException;
	abstract public Player left() throws ObstacleHitedException;
	
	public int score() { return score;};
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean isPlay() {
		return isPlay;
	}
	public void setPlay(boolean isPlay) {
		this.isPlay = isPlay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getCharactere() {
		return charactere;
	}
	public void setCharactere(char charactere) {
		this.charactere = charactere;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public boolean isPosition() {
		return position;
	}
	public void setPosition(boolean position) {
		this.position = position;
	}
	public Circences getCircences() {
		return circences;
	}
	public void setCircences(Circences circences) {
		this.circences = circences;
	}
	public char getAncien_charactere_1() {
		return ancien_charactere_1;
	}
	public void setAncien_charactere_1(char ancien_charactere_1) {
		this.ancien_charactere_1 = ancien_charactere_1;
	}
	public char getAncien_charactere_2() {
		return ancien_charactere_2;
	}
	public void setAncien_charactere_2(char ancien_charactere_2) {
		this.ancien_charactere_2 = ancien_charactere_2;
	}
	
	
	
}

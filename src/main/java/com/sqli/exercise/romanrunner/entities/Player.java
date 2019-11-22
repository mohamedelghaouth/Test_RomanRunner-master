package com.sqli.exercise.romanrunner.entities;

public abstract class Player {
	
	private int score;
	private boolean isPlay;
	
	public void startGame(Circences c);
	public Player forward() throws ObstacleHitedException;
	public int score()throws ObstacleHitedException;
	public Player right() throws ObstacleHitedException;
	public Player left() throws ObstacleHitedException;
	
	
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
	
	
	
	

}

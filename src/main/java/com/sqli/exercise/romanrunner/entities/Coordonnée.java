package com.sqli.exercise.romanrunner.entities;

public class Coordonnée {

	private boolean pos ;
	private char charactere;
	
	public Coordonnée(boolean pos, char charactere) {
		this.pos = pos;
		this.charactere = charactere;
	}

	public boolean isPos() {
		return pos;
	}

	public void setPos(boolean pos) {
		this.pos = pos;
	}

	public char getCharactere() {
		return charactere;
	}

	public void setCharactere(char charactere) {
		this.charactere = charactere;
	}

	@Override
	public String toString() {
		if(pos) return "|" +" "+ pos +"|";
		else return "|"+pos+" "+"|";
	} 
	
	
	
}

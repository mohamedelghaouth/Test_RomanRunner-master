package com.sqli.exercise.romanrunner.entities;

import java.util.List;

public abstract class Circences {
	
		
	protected List<Coordonnée> piste_base;
	protected List<String> piste; 
	protected boolean position;
	
	 abstract public Circences addCoin();
	 abstract public Circences addEmptySlot();
	 abstract public Circences addObstacle();
	 abstract public Circences build();
	 abstract public String draw();
	 abstract public Circences right();
	 abstract public Circences left();
	 
	 
	public List<Coordonnée> getPiste_base() {
		return piste_base;
	}
	public void setPiste_base(List<Coordonnée> piste_base) {
		this.piste_base = piste_base;
	}
	public List<String> getPiste() {
		return piste;
	}
	public void setPiste(List<String> piste) {
		this.piste = piste;
	}
	public boolean isPosition() {
		return position;
	}
	public void setPosition(boolean position) {
		this.position = position;
	}
	 
	 
	
}

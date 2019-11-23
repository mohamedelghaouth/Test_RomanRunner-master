package com.sqli.exercise.romanrunner.entities;

import java.util.ArrayList;

public class CircensesBuilder extends Circences {

	
	public CircensesBuilder() {
		this.piste = new ArrayList<String>();
		this.piste_base = new ArrayList<Coordonnée>();
	}

	public Circences addCoin() {
		piste_base.add(new Coordonnée(position, 'o'));
		return this;
	}

	public Circences addEmptySlot() {
		piste_base.add(new Coordonnée(position, ' '));
		return this;
	}

	public Circences addObstacle() {
		piste_base.add(new Coordonnée(position, '_'));
		return this;
	}
	
	public void AddNewString(Coordonnée cor) 
	{
			String s="";
			
			if(cor.isPos()) s="| "+cor.getCharactere()+"|"+'\n';
			
			else  s="|"+cor.getCharactere()+" |"+'\n';
			
			piste.add(s);
		
	}
	
	public void ModifieString(Coordonnée cor,Coordonnée coordonée_precedent) 
	{
		
		 String s="|";
		
		if(cor.isPos()) s+=coordonée_precedent.getCharactere()+""+cor.getCharactere()+"|"+'\n';
		
		else s+=cor.getCharactere()+""+coordonée_precedent.getCharactere()+"|"+'\n';
		
		piste.set(piste.size()-1, s);
		
	}

	public Circences build() {
		//ajouter la premiere ligne
		piste.add("|  |");
		Coordonnée coordonée_precedent=new Coordonnée(false, '\n');
		for (Coordonnée cor : piste_base) 
			{
				if(cor.isPos()==coordonée_precedent.isPos())   AddNewString(cor);
				
				else ModifieString( cor, coordonée_precedent) ;
				
				// mettre a jour les coordonee precedente
				coordonée_precedent.setCharactere(cor.getCharactere());
				coordonée_precedent.setPos(cor.isPos());;
			}
		//ajouter la derniere ligne
		piste.add("|##|"+'\n');
		return this;
		
	}

	public String draw() {
		String s="";
		for (int i = piste.size()-1; i >= 0; i--) s+=piste.get(i);
		return s;
	}
	
	public Circences left() {
		position=false;
		return this;
	}
	
	public Circences right() {
		position=true;
		return this;
	}

	
}

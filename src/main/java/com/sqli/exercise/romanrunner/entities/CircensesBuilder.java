package com.sqli.exercise.romanrunner.entities;

import java.util.ArrayList;

public class CircensesBuilder extends Circences {

	
	public CircensesBuilder() {
		this.piste = new ArrayList<String>();
		this.piste_base = new ArrayList<Coordonn�e>();
	}

	public Circences addCoin() {
		piste_base.add(new Coordonn�e(position, 'o'));
		return this;
	}

	public Circences addEmptySlot() {
		piste_base.add(new Coordonn�e(position, ' '));
		return this;
	}

	public Circences addObstacle() {
		piste_base.add(new Coordonn�e(position, '_'));
		return this;
	}
	
	public void AddNewString(Coordonn�e cor) 
	{
			String s="";
			
			if(cor.isPos()) s="| "+cor.getCharactere()+"|"+'\n';
			
			else  s="|"+cor.getCharactere()+" |"+'\n';
			
			piste.add(s);
		
	}
	
	public void ModifieString(Coordonn�e cor,Coordonn�e coordon�e_precedent) 
	{
		
		 String s="|";
		
		if(cor.isPos()) s+=coordon�e_precedent.getCharactere()+""+cor.getCharactere()+"|"+'\n';
		
		else s+=cor.getCharactere()+""+coordon�e_precedent.getCharactere()+"|"+'\n';
		
		piste.set(piste.size()-1, s);
		
	}

	public Circences build() {
		//ajouter la premiere ligne
		piste.add("|  |");
		Coordonn�e coordon�e_precedent=new Coordonn�e(false, '\n');
		for (Coordonn�e cor : piste_base) 
			{
				if(cor.isPos()==coordon�e_precedent.isPos())   AddNewString(cor);
				
				else ModifieString( cor, coordon�e_precedent) ;
				
				// mettre a jour les coordonee precedente
				coordon�e_precedent.setCharactere(cor.getCharactere());
				coordon�e_precedent.setPos(cor.isPos());;
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

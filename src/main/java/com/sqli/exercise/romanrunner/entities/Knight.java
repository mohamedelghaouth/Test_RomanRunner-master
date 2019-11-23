package com.sqli.exercise.romanrunner.entities;

import java.util.List;

public class Knight extends Player{

	public Knight() {
		
	}
	public Knight(String s) {
		super(s);
	}
	
	public Player forward() throws ObstacleHitedException
	{
		if(isPlay) 
		{
			 List<String> piste=circences.getPiste();
			 String s="";
			 
			 if(position) s="|"+ancien_charactere_2 +""+ancien_charactere_1+"|";
			 else s="|"+ancien_charactere_1 +""+ancien_charactere_2+"|";
			 
			 if (niveau!=0) s+='\n';
			 
			 piste.set(niveau,s);
			 
			 niveau++;
			 
			 int index_1=position?2:1;
			 int index_2=(!position)?2:1;
			 ancien_charactere_1=piste.get(niveau).toCharArray()[index_1];
			 ancien_charactere_2=piste.get(niveau).toCharArray()[index_2];
			 
			 if(ancien_charactere_1=='o')
				 {
				 	ancien_charactere_1='x';
					score+=20;	 
					
				 }
			 if(ancien_charactere_1=='_')
			 {
				 if(score<=10) 
				 {
					score-=5;	 
					isPlay=false;
					charactere='D';
				 }
				 else score-=10;	
			 }
			 
			 if(position) s="|"+ancien_charactere_2+charactere+"|"+'\n';
			 else s="|"+charactere+ancien_charactere_2+"|"+'\n';
			 
			 piste.set(niveau,s);
			 
			 if(niveau==piste.size()-1) 
			 {
				 score+=100;
				 isPlay=false;
			 } 
			 return this;
		} 
		else throw new ObstacleHitedException();
		
	}
	
	
	public Player right() throws ObstacleHitedException {
		if(isPlay) 
		{
			if(!isPosition())  
			{
				String s="";
				List<String> piste=circences.getPiste();
				
				char tmp_char=ancien_charactere_1;
				ancien_charactere_1=ancien_charactere_2;
				ancien_charactere_2=tmp_char;
				
				if(ancien_charactere_1=='_')
				 {
					if(score<=10) 
					 {
						score-=5;	 
						isPlay=false;
						charactere='D';
					 }
					 else score-=10;
				 }
				if(ancien_charactere_1=='o')
				 {
				 	ancien_charactere_1='x';
					score+=20;	 
					
				 }
				
				s="|"+ancien_charactere_2+charactere+"|";
				 if (niveau!=0) s+='\n';
				piste.set(niveau,s);
				position=true;
			}
			return this;
		}
		else throw new ObstacleHitedException();
	}
	
	public Player left() throws ObstacleHitedException {
		if(isPlay) 
		{
			if(isPosition())  
			{
				String s="";
				List<String> piste=circences.getPiste();
				
				char tmp_char=ancien_charactere_1;
				ancien_charactere_1=ancien_charactere_2;
				ancien_charactere_2=tmp_char;
				
				if(ancien_charactere_1=='_')
				 {
					if(score<=10) 
					 {
						score-=5;	 
						isPlay=false;
						charactere='D';
					 }
					 else score-=10;
				 }
				if(ancien_charactere_1=='o')
				 {
				 	ancien_charactere_1='x';
					score+=20;	 
					
				 }
				s="|"+charactere+ancien_charactere_2+"|";
				 if (niveau!=0) s+='\n';
				piste.set(niveau,s);
				position=false;
			}
			return this;
		}
		else throw new ObstacleHitedException();
	}

	

}

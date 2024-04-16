package com.kbp.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("criket")
public class Criket implements Coach {
  
	private MatchTime matchtime;
	
	@Autowired
	@Qualifier("nighttime")
	public void setMatchtime(MatchTime matchtime) {
		this.matchtime = matchtime;
	}

	public Criket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Criket(MatchTime matchtime) {
		super();
		this.matchtime = matchtime;
	}

	public void getWorout() {
		System.out.println("Criket: running");
	}

	@Override
	public void getDiet() {
		System.out.println("Criket: veg");
	}

	@Override
	public String getMatchTime() {
		// TODO Auto-generated method stub
		return matchtime.getMatchTime();
	}

}

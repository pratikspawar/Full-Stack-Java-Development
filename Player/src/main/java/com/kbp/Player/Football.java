package com.kbp.Player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Football implements Coach{
	private MatchTime matchtime;
	@Override
	public void getWorout() {
		System.out.println("Football: hardRunning");
	}

	@Override
	public void getDiet() {
		System.out.println("Football: veg");
	}

	@Override
	public String getMatchTime() {
		// TODO Auto-generated method stub
		return matchtime.getMatchTime();
	}

	public Football(MatchTime matchtime) {
		super();
		this.matchtime = matchtime;
	}

	public Football() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setMatchtime(MatchTime matchtime) {
		this.matchtime = matchtime;
	}

}

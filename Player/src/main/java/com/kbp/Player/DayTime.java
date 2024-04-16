package com.kbp.Player;

import org.springframework.stereotype.Component;

@Component
public class DayTime implements MatchTime {

	@Override
	public String getMatchTime() {
		// TODO Auto-generated method stub
		return "Day 10 AM";
	}

}

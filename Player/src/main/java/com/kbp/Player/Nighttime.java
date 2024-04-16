package com.kbp.Player;

import org.springframework.stereotype.Component;

@Component
public class Nighttime implements MatchTime {

	@Override
	public String getMatchTime() {
		// TODO Auto-generated method stub
		return "Night 7 PM";
	}
}

package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
    private LocalDateTime date; //Has A Property
    
    //create season finder method
    public String findSeasonName() {
    	//get current month of year
    	int month=date.getMonthValue();
    	//find the season name
    	if(month>=3 && month<=6) {
    		return "Summer Season";
    	}else if(month>=7 && month<=10) {
    		return"Rainy Season";
    	}else
    		return "Winter Season";
    }
}

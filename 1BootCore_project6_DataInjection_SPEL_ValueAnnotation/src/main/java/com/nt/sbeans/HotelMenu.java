package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("menu")
@Data
public class HotelMenu {
	@Value("${dosa.price}")
	private  Float dosaRate; 
	@Value("${idly.price}")
	private  Float idlyRate;
	@Value("${wada.price}")
	private  Float wadaRate;
	@Value("${tea.price}")
	private  Float teaRate;
	@Value("${poha.price}")
	private  Float pohaRate;
	@Value("${poori.price}")
	private  Float pooriRate;
	@Value("${coffe.price}")
	private  Float coffeRate;
	
	
	//toString()(alt+shift+s,s)
	@Override
	public String toString() {
		return "HotelMenu [dosaRate=" + dosaRate + ", idlyRate=" + idlyRate + ", wadaRate=" + wadaRate + ", teaRate="
				+ teaRate + ", pohaRate=" + pohaRate + ", pooriRate=" + pooriRate + ", coffeRate=" + coffeRate + "]";
	}
	
	
	

}

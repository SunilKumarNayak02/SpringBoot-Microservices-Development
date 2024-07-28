package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hInfo")
@Data
public class HotelInfo {
	@Value("1001")  //hard coded input
	private Integer id;
	@Value("${hotel.name}")  //key of the properties file
	private String  hotelname;
	@Value("${hotel.location}")
	private String  location;
	@Value("${cust.name}")
	private  String customerName;
	
	@Value("#{menu.dosaRate + menu.pohaRate + menu.teaRate}")  //SPEL
	private   Float billAmt;
	
	@Value("${os.name}")  //system  proeprty (fixed key)
	private String  osName;
	@Value("${user.name}")   //system property (fixed key)
	private  String winUsername;
	
	@Value("${Path}")
	private  String pathData;

	
	
	//toString()
	@Override
	public String toString() {
		return "HotelInfo [id=" + id + ", hotelname=" + hotelname + ", location=" + location + ", customerName="
				+ customerName + ", billAmt=" + billAmt + ", osName=" + osName + ", winUsername=" + winUsername
				+ ", pathData=" + pathData + "]";
	}
}

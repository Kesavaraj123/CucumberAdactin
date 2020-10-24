package com.configuration.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Properties;

import com.google.j2objc.annotations.Property;

import cucumber.api.java.fr.Et;

public class ConfigureReader {

	public static Properties p;

	public ConfigureReader() throws IOException {

		File f = new File("C:\\Users\\kesavaraj\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\configuration\\property\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);
	}

	public String getBrowserLaunch() {
		String browserLaunch = p.getProperty("browserLaunch");
		return browserLaunch;

	}

	public String getUrll() {
		String url = p.getProperty("gettUrl");
		return url;

	}
}
/*
 * public String userName() { String username = p.getProperty("userName");
 * return username; }
 * 
 * public String getPasswor() { String password = p.getProperty("password");
 * return password;
 * 
 * }
 * 
 * public String getLocation() { String location = p.getProperty("location");
 * return location;
 * 
 * }
 * 
 * public String getHotel() { String hotel = p.getProperty("hotel"); return
 * hotel;
 * 
 * }
 * 
 * public String getRoomType() { String roomtype = p.getProperty("roomtype");
 * return roomtype;
 * 
 * }
 * 
 * 
 * public String getRoomCount() { String rc = p.getProperty("roomcount"); return
 * rc;
 * 
 * }
 * 
 * public String getCheckIn() { String cin = p.getProperty("checkin"); return
 * cin;
 * 
 * }
 * 
 * public String getCheckOut() { String cout = p.getProperty("checkout"); return
 * cout;
 * 
 * }
 * 
 * public String getAdult() { String adult = p.getProperty("adult"); return
 * adult;
 * 
 * }
 * 
 * public String getChild() { String child = p.getProperty("child"); return
 * child;
 * 
 * }
 * 
 * public String getFistName() { String firstnam = p.getProperty("firstnam");
 * return firstnam;
 * 
 * }
 * 
 * public String getLastName() { String lastnam = p.getProperty("lastnam");
 * return lastnam; }
 * 
 * public String getAddress() { String address = p.getProperty("address");
 * return address; }
 * 
 * public String getCreditCard() { String card = p.getProperty("creditcard");
 * return card; }
 * 
 * public String getCardType() { String type = p.getProperty("cardtype"); return
 * type; }
 * 
 * public String getExpMonth() { String expmonth = p.getProperty("expmonth");
 * return expmonth; }
 * 
 * public String getExpYear() { String expyear = p.getProperty("expyear");
 * return expyear;
 * 
 * }
 * 
 * public String getCvv() { String cvv = p.getProperty("cvv"); return cvv; }
 * 
 * }
 */

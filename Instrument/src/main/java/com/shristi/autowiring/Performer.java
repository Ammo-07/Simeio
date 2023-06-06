package com.shristi.autowiring;

@Component
public class Performer {
private Instrument instrument;
void playSong(String type,String song) {
	System.out.println("playing song");
	if(type.equals("k"))
		System.out.println("Twinkle twinkle little star");
	if(type.equals("g"))
		System.out.println("Humpty Dumpty");
	if(type.equals("t"))
		System.out.println("Merry Roses");
}
}

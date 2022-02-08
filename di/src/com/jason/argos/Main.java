package com.jason.argos;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String url = "https://www.amazon.com/Marvels-Spider-Man-Miles-Morales-Launch-PlayStation/dp/B08FC5J867/ref=sr_1_12?qid=1644334362&refinements=p_89%3APlayStation&rnid=2528832011&s=videogames-intl-ship&sr=1-12";

        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);

        System.out.println(result);

    }
}

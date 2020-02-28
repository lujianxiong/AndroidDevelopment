package com.manbuilding;

public class Client {

	public static void main(String[] args) {
		
		BlackManBuilder blackmanBuilder = new BlackManBuilder();
		HumanDirector blackmanDirector = new HumanDirector(blackmanBuilder);
		blackmanDirector.construct();
		Human blackman = blackmanBuilder.getHuman();
		System.out.println("black man performs------------");
		blackman.getHead().function();
		blackman.getBody().function();
		blackman.getFoot().function();
		
		YellowManBuilder yellowmanBuilder = new YellowManBuilder();
		HumanDirector yellowmanDirector = new HumanDirector(yellowmanBuilder);
		yellowmanDirector.construct();
		Human yellowman = yellowmanBuilder.getHuman();
		System.out.println("yellow man performs------------");
		yellowman.getHead().function();
		yellowman.getBody().function();
		yellowman.getFoot().function();

			}

	}


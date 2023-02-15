package com.onesoft.day4;

public class Direction {

	public static void main(String[] args) {
		String direction = "west";
		switch(direction) {
		case  "east": System.out.println("EAST direction");
		break;
		case "west": System.out.println("WEST direction");
		break;
		case "north": System.out.println("NORTH direction");
		break;
		case "south": System.out.println("SOUTH direction");
		break;
		default: System.out.println("Not a Direction");
		break;
		}

	}

}

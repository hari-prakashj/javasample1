package com.onesoft.day11;

public abstract class GovtTravels implements Travels {
	public String mode(String mode) {
		return mode;
	}
	public String powerSource(String powerSource) {
		return powerSource;
	}
	abstract public int fare();
	public int kms(int kms) {
		return kms;
	}

}

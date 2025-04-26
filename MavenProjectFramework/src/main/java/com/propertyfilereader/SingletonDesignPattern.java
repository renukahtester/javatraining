package com.propertyfilereader;

import java.io.IOException;

public class SingletonDesignPattern {

	/*
	 * step1: create a constructor
	 * step2: change constructor public to private 
	 * step3: create new method for configure reader
	 * step4: create object singleton inside the constructor
	 */

	private SingletonDesignPattern SingletonDesignPattern() {
		SingletonDesignPattern sdp = new SingletonDesignPattern();
		return sdp;
	}
	public static ConfigurationReader crReader() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}

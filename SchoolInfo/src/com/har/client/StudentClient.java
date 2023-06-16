package com.har.client;

import com.har.info.Library;
import com.har.info.Transportation;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		library.libraryInfo();
		
		Transportation transportation = new Transportation();
		transportation.transporatationInfo(13);
	}

}

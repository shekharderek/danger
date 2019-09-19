package com.npst;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONTest {
	private static final ObjectMapper mapper = new ObjectMapper();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "[{ResErrMsg=SUCCESS, ResMobileNumber=+917906743578, maskedCardNumber=46877801****5006, cardStatus=0}, {ResErrMsg=SUCCESS, ResMobileNumber=+917906743578, maskedCardNumber=46877801****5096, cardStatus=0}]";
		System.out.println("Response : "+str);
		
		ResponseData res=new ResponseData();
		res.setData(str);
		
	}

	
	public static String convertObjctToJson(Object request) {
		String reqData = null;
		try {
			reqData = mapper.writeValueAsString(request);
		} catch (IOException e) {
			
		
		}
		return reqData;
	}
	
}

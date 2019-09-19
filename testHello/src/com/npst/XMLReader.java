package com.npst;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.util.Properties;

import javax.xml.bind.JAXB;

public class XMLReader {
	public static void main(String[] args) {
		try {
			InputStream input = new FileInputStream("/home/npst/Avinash/Myspaces/MB/FRM+OMNI+Biometric/testHello/src/com/npst/CBSLink.properties");
			
			Properties props=new Properties();
			props.load(input);
			
			Input xmlObj = unmarshal(props.getProperty("INPUT_STRING"), Input.class);
			xmlObj.setMobileNo("+919540202589");
			System.out.println("UnMarshalled");
			System.out.println("Input is as :" + xmlObj.getMobileNo());
			System.out.println("Operation:" + xmlObj.getOperation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static <T> T unmarshal(String xmlStr, Class<T> t) throws Exception {
		try (StringReader sr = new StringReader(xmlStr);) {
			return JAXB.unmarshal(sr, t);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}

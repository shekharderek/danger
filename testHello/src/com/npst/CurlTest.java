package com.npst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class CurlTest {

	/*
	 * public static void main(String[] args) throws IOException { Process process =
	 * Runtime.getRuntime().exec(new String[] { "curl", "-H",
	 * "Content-Type: application/json", "--data",
	 * "{\"payload\":\"94ef88ee8ea4497e737a92737fca21059dad894d7d22be9c2723d92a56d8cfccd23445e2cd91276134a8fe7690fdda3a\",\"partner_key\":\"abcd-1234-efg\"}",
	 * "https://callback-preprod.gonuclei.com/api/partner-identity/seamless/v1/generatetoken"
	 * });
	 * 
	 * InputStream is = process.getInputStream(); InputStreamReader isr = new
	 * InputStreamReader(is); BufferedReader br = new BufferedReader(isr); String
	 * line;
	 * 
	 * while ((line = br.readLine()) != null) { System.out.println(line); }}
	 */

	public static void main(String[] args) {
		StringBuilder resp = new StringBuilder();
		StringBuilder request = new StringBuilder();
		InputStream in = null;
		Process process = null;
		try {

			// request.append("curl --globoff --insecure --silent -i -d {\"payload\":
			// \"94ef88ee8ea4497e737a92737fca21059dad894d7d22be9c2723d92a56d8cfccd23445e2cd91276134a8fe7690fdda3a\",\"partner_key\":\"abcd-1234-efg\"}");
			// request.append(" -H 'Accept: application/json'");
			// request.append(" -H 'Content-Type: application/json'");
			// request.append(" -X POST
			// https://callback-preprod.gonuclei.com/api/partner-identity/seamless/v1/generatetoken");
			System.out.println(request.toString());
			process = Runtime.getRuntime().exec(new String[] { "curl", "-H", "Content-Type: application/json", "--data",
					"{\"payload\": \"94ef88ee8ea4497e737a92737fca21059dad894d7d22be9c2723d92a56d8cfccd23445e2cd91276134a8fe7690fdda3a\",\"partner_key\":\"abcd-1234-efg\"}",
					"https://callback-preprod.gonuclei.com/api/partner-identity/seamless/v1/generatetoken" });
			in = process.getInputStream();
			// in = process.getErrorStream();
			// process.waitFor();

			BufferedReader is = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line;
			// reading the output
			while ((line = is.readLine()) != null)
				resp.append(line);
			System.out.println(resp.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			process.destroy();
		}
	}
}

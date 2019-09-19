package com.npst;

import java.util.StringTokenizer;
import java.util.Vector;

public class AccountNumTest {
	public static void main(String[] args) {
		int countwhile=0;
		try{

			// TODO Auto-generated method stub
	String data=" 13   0507101030723  507   SAV   0507104330493  507   NRO   0507101343481  507   SAV "+
	 "0507101343482  507   SAV   0507101343483  507   SAV   0507101343484  507   SAV   0507101343485  507   SAV   0507101343486  507   SAV   0507101343487  507   SAV   0507101343488  507   SAV   0507101343489  507   SAV   0507101343490  507   SAV   0507101343491  507   SAV"; 
		
		StringTokenizer userID=new StringTokenizer(data.trim());
		Vector accNo = new Vector();
		Vector branchCode = new Vector();
		StringBuffer AccountNo = new StringBuffer();
		StringBuffer branches = new StringBuffer();
		String custName=null;
		userID.nextToken();
		int count = userID.countTokens();
		System.out.println("Total Tokens==" + count);
		
		while (userID.hasMoreTokens()) {///error raised here
			System.out.println("userid : :"+userID.nextToken().toString());
			String acc = userID.nextToken().toString();
			System.out.println(acc);
			//System.out.println(acc.substring(9));
			accNo.add(acc);
//			System.out.println("added in vector");
			AccountNo.append(acc + ",");
//			System.out.println(acc+"\tappended");
			String brCode = userID.nextToken().toString();
			System.out.println("brCode \t"+brCode);
			branchCode.add(brCode);
//			System.out.println(brCode+"\tadded in vector");
			branches.append(brCode + ",");
//			System.out.println(brCode+"\tappended");
			countwhile++;
		}
		
//		String regCode = data.substring(0, 4).trim();
//		AccountNo.append(accountNum);
//		accNo.add(accountNum);
//		branchCode.add(regReq1.substring(52, 57).trim());
//		branches.append(regReq1.substring(52, 57).trim())
		
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println(countwhile);
		}
	}

}

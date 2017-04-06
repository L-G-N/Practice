/**
 * 
 */
package com.test.lgn;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author logendran.kandasamy
 *
 */
public class DateValidations {
	
	private String validDate(String dtInput){
		String flag = null;
		String error = "";
		String match = "0000-00-00";
		if(dtInput == null){
//		if(dtInput == null || dtInput.matches(match)){
			flag = "\\N";
		}else{
			try{
				SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
				Date date = (Date)format.parse(dtInput);
				System.out.println(date);
			}catch (Exception e) {
				error = "ERROD :"+e.getMessage();
				System.out.println(error);
			}
			if(error.length() > 0)
				flag = "\\N";
			else
				flag = dtInput;
		}
		return flag;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("/~~~~~~~~~ MAIN STARTS ~~~~~~~~~~/");
		DateValidations dateValidations = new DateValidations();
		String output = null; 
		output= dateValidations.validDate("");
		System.out.println("\"\" --> "+output);
		output= dateValidations.validDate("2010-06-26");
		System.out.println("2010-06-26 --> "+output);
		output= dateValidations.validDate("2084-99-99");
		System.out.println("2084-99-99 --> "+output);
		output= dateValidations.validDate("0000-00-00");
		System.out.println("0000-00-00 --> "+output);
		output= dateValidations.validDate("5500");
		System.out.println("5500 --> "+output);
		System.out.println("/~~~~~~~~~ MAIN ENDS ~~~~~~~~~~/");

	}

}

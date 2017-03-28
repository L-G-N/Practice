/**
 * 
 */
package com.test.lgn;

/**
 * @author logendran.kandasamy
 *
 */
public class StringPractice {

	public void strCmpr(){
		String s1 = "logu";
		String s2 = new String("logu");
		String s21 = new String("logu");
		String s3 = "logu";
		String s4 = s2;
		String s5 = s1;
		System.out.println("memory of s1 :: "+System.identityHashCode(s1));
		System.out.println("memory of s2 :: "+System.identityHashCode(s2));
		System.out.println("hascode of s21 :: "+System.identityHashCode(s21));
		System.out.println("hascode of s3 :: "+System.identityHashCode(s3));
		System.out.println("hascode of s4 :: "+System.identityHashCode(s4));
		System.out.println("hascode of s5 :: "+System.identityHashCode(s5));
		System.out.println(s1.equals(s2)); // Compare the values of object in the memory. // logu.equals(logu)
		System.out.println(s1==s2); // compare the object sharing the same memory location or not. // 366712642==1829164700
		System.out.println(s1.equals(s3)); // logu.equals(logu)
		System.out.println(s1==s3); //366712642 == 366712642
		System.out.println(s2.equals(s4));// logu.equals(logu)
		System.out.println(s2==s4); //1829164700==1829164700
		System.out.println(s3.equals(s5));// logu.equals(logu)
		System.out.println(s3==s5); //366712642==366712642
		System.out.println(s21.equals(s2));// logu.equals(logu)
		System.out.println(s21==s2);//2018699554==1829164700
	}
	
	public static void main(String[] args) {
		System.out.println("/~~~~~~~~~ MAIN STARTS ~~~~~~~~~~/");
		StringPractice strPrac = new StringPractice();
		strPrac.strCmpr();
		System.out.println("/~~~~~~~~~ MAIN ENDS ~~~~~~~~~~/");
	}
}

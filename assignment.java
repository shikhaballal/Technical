//Program for consonant shifting 
package myPackage;

import java.util.Scanner;

public class ConsonantShift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char str[] = s.toCharArray();
		int len = s.length();
		for(int i = 0; i < len; i++) {
			if(str[i] == 'c')
				str[i] = 't';
			else if(str[i] == 't')
				str[i] = 'c';
			else if(str[i] == 'd')
				str[i] = 'n';
			else if(str[i] == 'n')
				str[i] = 'd';
		}
		System.out.println(new String(str));
	}

}
   
SeriesSum.java
@@ -0,0 +1,20 @@
//Program to find the sum of the series
package myPackage;

public class SeriesSum {

	public static void main(String[] args) {
		int num = new java.util.Scanner(System.in).nextInt();
		double fact = 1, result = 0;
		for(int i = 1; i <= num; i ++) {
			fact *= i;
			if(i % 2 == 0)
				result -= (i / fact);
			else
				result += (i / fact);
			System.out.println(fact + " " + result);
		}
		System.out.println(result);
	}

} 
VowelShift1.java
@@ -0,0 +1,26 @@
//Program to vowel Shifting
package myPackage;

import java.util.Scanner;

public class VowelShift1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char str[] = s.toCharArray();
		int len = s.length();
		for(int i = 0; i < len; i++) {
			if(str[i] == 'e')
				str[i] = 'o';
			else if(str[i] == 'o')
				str[i] = 'e';
			else if(str[i] == 'i')
				str[i] = 'u';
			else if(str[i] == 'u')
				str[i] = 'i';
		}
		System.out.println(new String(str));
	}

}

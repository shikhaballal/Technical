//Program for Chocolate Factory
import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int index1 = 0;
		for(int i = 0; i < n; i++) {
			int in = sc.nextInt();
			if(in != 0)
				a[index1++] = in;
		}
		for(int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

}
2.//X-Pattern program

public class Pattern {
	public static void main(String args[]) {
		String str = new java.util.Scanner(System.in).next();
		int len = str.length();
		char c[] = str.toCharArray();
		int index = 0;
		for(int i = 1; i < len * 2; i++) {
			if(i == len)
				System.out.println(" ".repeat(index) + c[index] + " ".repeat(index++));
			else
				System.out.println(" ".repeat(index) + c[index] + " ".repeat((len - index) * 2 - 3) + c[index] + " ".repeat(index++));
			if(i >= len)
				index -= 2;
		}
	}
}
3.//Program for pairing socks
import java.util.Arrays;
import java.util.Scanner;

public class Socks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int i = 0;
		System.out.println("Enter values");
		int ar[] = new int[n];
		for(i = 0; i < n; i++)
			ar[i] = sc.nextInt();
		Arrays.sort(ar);
		int count = 0;
		for(i = 0; i < n - 1; i ++) {
			if(ar[i] != ar[i + 1])
				count++;
			else
				i++;
		}
		if(i == n - 1)
			count++;
		System.out.println(count);
	}

}
4.//Program for String Validation

import java.util.Arrays;

public class StringValidation {

	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		int len = str.length();
		int n1 = 0, n2 = 0;
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) == '#')
				n1++;
			else
				n2++;
		}
		System.out.println(n2 - n1);
	}
}
5.//Program for Super Market

public class SuperMarket {

	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		long res = 1;
		int len = str.length();
		for(int i = 0; i < len; i++)
			res *= Character.getNumericValue(str.charAt(i));
		System.out.println(res);
	}

}
6.//Program to find no. of vehicles
import java.util.Scanner;

public class Tyres {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int w = sc.nextInt();
		if(w < 2 || w % 2 != 0 || w <= v) {
			System.out.println("INVALID INPUT");
			return;
		}
		int fw = (w - 2 * v) / 2;
		int tw = v - fw;
		System.out.println(tw + " " + fw);
	}
}
7.//Program for Washing Machine

public class WashingMachine {
	public static void main(String args[]) {
		int w = new java.util.Scanner(System.in).nextInt();
		if(w < 0)
			System.out.println("Invalid Input");
		else if(w == 0)
			System.out.println("Time Estimated: 0 minutes");
		else if(w <= 2000)
			System.out.println("Time Estimated: 25 minutes");
		else if(w <= 4000)
			System.out.println("Time Estimated: 35 minutes");
		else if(w <= 7000)
			System.out.println("Time Estimated: 45 minutes");
		else
			System.out.println("Overloaded");
	}
}

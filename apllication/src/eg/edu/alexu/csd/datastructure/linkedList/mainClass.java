package eg.edu.alexu.csd.datastructure.linkedList;


import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int beb = 1;
		ILinkedList variablesContain = new singlyLinkedList();
		while(beb == 1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose an action");
		System.out.println("-----------------------");
		System.out.println("1- Set a polynomial variable");
		System.out.println("2- Print the value of a polynomial variable");
		System.out.println("3- Add two polynomials");
		System.out.println("4- Subtract two polynomials");
		System.out.println("5- Multiply two polynomials");
		System.out.println("6- Evaluate a polynomial at some point");
		System.out.println("7- Clear a polynomial variable");
		System.out.println("======================================================");
		char ch , var;
		ch = sc.next().charAt(0);
		IPolynomialSolver first = new ans();
		if(ch == '1') {
			String str = "";
			int[][] terms = new int[2][10000];
			while(true) {
				System.out.println("Insert the variable name: A, B or c");
				var = sc.next().charAt(0);
				if(var == 'A' || var == 'B' || var == 'C') {
					break;
				}else System.out.println("Not Allowed");
			}
			System.out.println("Insert the polynomial terms in the form:");
			System.out.println("(coeff1, exponent1), (coeff2, exponent2), ...");
			str += sc.next();
			int i=0,j=0,k=0,q=0;
			int flag =0;
			while(i<str.length()) {
				if(str.charAt(i) == '(' || (str.charAt(i)==',' && i+1<str.length() &&str.charAt(i+1)!='(')) {
					i++;
					j=i;
					while(str.charAt(j) != ',' && str.charAt(j)!=')') {
						j++;
					}
					String sub = str.substring(i, j);
					int x = Integer.parseInt(sub);
					if(flag == 0) {
						terms[flag][k] = x;
						flag=1;
						k++;
					}else {
						terms[flag][q] = x;
						flag=0;
						q++;
					}
					i=j;
				}else {
					i++;
				}
			}
			
			System.out.printf("Polynomial %c is set", var);
			System.out.println();
			first.setCol(q);
			first.setPolynomial(var, terms);
			variablesContain.add(var);
		}else if(ch == '2') {
			char cha ;
			System.out.println("Insert the variable name: A, B, C or R");
			cha = sc.next().charAt(0);
			if(variablesContain.contains(cha)) {
				System.out.printf("%c Value in %c : ",cha,cha);
				System.out.println(first.print(cha));
			}else {
				System.out.println("Variable not set");
			}
		}else if(ch == '3') {
			char cha;
			char p1 = 'z';
			char p2 = 'q';
			int count =0;
			variablesContain.add('R');
			while(true) {
				System.out.println("Insert the variable name: A, B, C or R");
				cha = sc.next().charAt(0);
				if(!variablesContain.contains(cha)) {
					System.out.println("Variable not set");
				}else {
					count++;
					if(count == 1) p1 = cha;
					if(count == 2) p2 = cha;
				}
				if(count == 2) {
					break;
				}
			}
			if(count == 2) { 
				int[][] add = first.add(p1, p2);
				int x = (first.bal('R')/2);
				System.out.print("Result set in R: ");
				for(int i=0;i<x;i++) {
					System.out.print("(");
					for(int j=0;j<2;j++) {
							System.out.print(add[j][i]);
							if(j==1) {
								System.out.print(")");
							}else {
								System.out.print(",");
							}
					}
					if(i<x-1) {
						System.out.print(",");
					}
				}
				System.out.println();
			}
			
		}else if(ch == '4') {
			char cha;
			char p1 = 'z';
			char p2 = 'q';
			int count =0;
			variablesContain.add('R');
			while(true) {
				System.out.println("Insert the variable name: A, B, C or R");
				cha = sc.next().charAt(0);
				if(!variablesContain.contains(cha)) {
					System.out.println("Variable not set");
				}else {
					count++;
					if(count == 1) p1 = cha;
					if(count == 2) p2 = cha;
				}
				if(count == 2) {
					break;
				}
			}
			if(count == 2) { 
				int[][] subtract = first.subtract(p1, p2);
				int x = (first.bal('R')/2);
				System.out.print("Result set in R: ");
				for(int i=0;i<x;i++) {
					System.out.print("(");
					for(int j=0;j<2;j++) {
							System.out.print(subtract[j][i]);
							if(j==1) {
								System.out.print(")");
							}else {
								System.out.print(",");
							}
					}
					if(i<x-1) {
						System.out.print(",");
					}
				}
				System.out.println();
			}
		}else if(ch == '5') {
			char cha;
			char p1 = 'z';
			char p2 = 'q';
			int count =0;
			variablesContain.add('R');
			while(true) {
				System.out.println("Insert the variable name: A, B, C or R");
				cha = sc.next().charAt(0);
				if(!variablesContain.contains(cha)) {
					System.out.println("Variable not set");
				}else {
					count++;
					if(count == 1) p1 = cha;
					if(count == 2) p2 = cha;
				}
				if(count == 2) {
					break;
				}
			}
			if(count == 2) { 
				int[][] multi = first.multiply(p1, p2);
				int x = (first.bal('R')/2);
				System.out.print("Result set in R: ");
				for(int i=0;i<x;i++) {
					System.out.print("(");
					for(int j=0;j<2;j++) {
							System.out.print(multi[j][i]);
							if(j==1) {
								System.out.print(")");
							}else {
								System.out.print(",");
							}
					}
					if(i<x-1) {
						System.out.print(",");
					}
				}
				System.out.println();
			}

		}else if(ch == '6') {
			char cha;
			char p1 = 'z';
			int count =0;
			while(true) {
				System.out.println("Insert the variable name: A, B, C or R");
				cha = sc.next().charAt(0);
				if(!variablesContain.contains(cha)) {
					System.out.println("Variable not set");
				}else {
					count++;
					if(count == 1) p1 = cha;
				}
				if(count == 1) {
					break;
				}
			}
			System.out.println("Insert the value :");
			float val = sc.nextFloat();
			if(count == 1) {
				System.out.print("Result : ");
				System.out.print(first.evaluatePolynomial(p1, val)); 
				System.out.println();
			}
		}else if(ch == '7') {
			char cha;
			char p1 = 'z';
			int count =0;
			while(true) {
				System.out.println("Insert the variable name: A, B, C or R");
				cha = sc.next().charAt(0);
				if(!variablesContain.contains(cha)) {
					System.out.println("Variable not set");
				}else {
					count++;
					if(count == 1) p1 = cha;
				}
				if(count == 1) {
					break;
				}
			}
			if(count == 1) {
				first.clearPolynomial(p1);
			}
		}
		if(ch!='1' && ch!='2'&&ch!='3'&&ch!='4'&&ch!='5'&&ch!='6'&&ch!='7') {
			beb=0;
		}
	  }

	}
}

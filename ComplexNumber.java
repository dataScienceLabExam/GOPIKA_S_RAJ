package co;

import java.util.Scanner;



	public class  ComplexNumber {
		int real,img;
	
	public void input(){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the real number");
		real=in.nextInt();
		System.out.println("enter the imaginary part");
		 img=in.nextInt();
		
		}
	public void display() {
		System.out.println(real+"+"+(img)+"i");
		
	}
	public static void main (String args[]) {
		ComplexNumber c1=new ComplexNumber();
		ComplexNumber c2=new ComplexNumber();
		System.out.println("enter the first complex number");
		c1.input();
		System.out.println("enter the second complex number");
		c2.input();
		c1.display();
		c2.display();
		System.out.println("the additiom of 2 complex numbers is");
		System.out.println(c1.real+c2.real+"+"+(c1.img+c2.img)+"i");
	}

}

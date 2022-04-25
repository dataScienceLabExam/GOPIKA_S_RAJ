package co;

import java.util.Scanner;

public class p {
	String pname;
	int pcode,price;
	p(String a,int b,int c){
		pname=a;
		pcode=b;
		price=c;
		
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the product name");
		String a=in.nextLine();
		System.out.println("enter the product code");
		int b=in.nextInt();
		System.out.println("enter the product price");
		 int c = in.nextInt();
		 p obj1=new p(a,b,c);
		 obj1.display();
		                          
			                   System.out.println("enter the product name");
			                   String d=in.nextLine();
			                   in.nextLine();
			                   System.out.println("enter the product code");
			                   int e=in.nextInt();
			                   in.nextLine();
			                   System.out.println("enter the product price");
			                   int f = in.nextInt();
			                   in.nextLine();
			                   p obj2=new p(d,e,f);
			                   obj2.display();
System.out.println("enter the product name");
String g=in.nextLine();
 in.nextLine();
System.out.println("enter the product code");
int h=in.nextInt();
in.nextLine();
System.out.println("enter the product price");
 int i = in.nextInt();
in.nextLine();
 p obj3=new p(g,h,i);
 obj3.display();
		 
		 if(obj1.price>obj2.price && obj1.price > obj3.price) {
			 System.out.println("first product has larger price");
		 }
		 if(obj2.price>obj1.price && obj2.price>obj3.price) {
			 System.out.println("second product has larger price"); 
		 }
		 if(obj3.price>obj1.price && obj3.price>obj2.price) {
			 System.out.println("third product has larger price"); 
		 }
			 
		
	}
	public void display() {
		System.out.println("product name:"+pname);
		System.out.println("code:"+pcode);
		System.out.println("Price: " + price);
		
	}

}

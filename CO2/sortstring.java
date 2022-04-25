package co;

import java.util.Scanner;

public class sortstring {

	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
System.out.println("number of the strings is 4");
int n=4;
String names[]= {"virat","shreyas","Axar","pandya"};
String temp;
for(int i=0;i<n;i++) {
	for (int j = i + 1; j < n; j++) {
		if(names[i].compareTo(names[j])>0){
			temp=names[i];
			names[i]=names[j];
			names[j]=temp;
			
		}
	}
	

}
System.out.println("the alphabetical order of the string is");
for(int i=0;i<n;i++) {
	System.out.println(names[i]);
}

	}

}

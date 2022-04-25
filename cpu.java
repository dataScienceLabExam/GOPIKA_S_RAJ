package co;

public class cpu{
	
	class processor{
		int core;
		String producer;
		int pric;
		processor(int cores,String producers,int price){
			core=cores;
			producer=producers;
			pric=price;
		}
		void display() {
			System.out.println("the memory is "+core);
			System.out.println("the manufacturer is "+producer);
			System.out.println("the price is "+pric);
			
		}
		
	}
	static class ram{
		int mem;
		String manuf;
		int cos;
		ram(int memory,String manufact,int cost){
			mem=memory;
			manuf=manufact;
			cos=cost;
		}
		
		void disp() {
			System.out.println("the memory is "+mem);
			System.out.println("the manufacturer is "+manuf);
			System.out.println("the price is "+cos);
			
			
			
		}
	}
	
	public static void main(String[] args) {
		 cpu obj1=new cpu();
		 cpu.processor obj2=obj1.new processor(3,"intel",25000);
		 cpu.ram obj3=new ram(256,"samsung",36666);
		obj2.display();
		 obj3.disp();
		 
	}
}
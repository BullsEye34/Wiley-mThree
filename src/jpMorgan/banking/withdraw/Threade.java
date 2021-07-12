package jpMorgan.banking.withdraw;

import java.util.*;

public class Threade extends Thread{

		ArrayList<Integer> wahh = new ArrayList<Integer>();	
		
		public void run() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		Threade threade = new Threade();
		threade.start();
		while(threade.isAlive()) {
			System.out.println("Waiting . . . ");
		}
		
	}
	
	

}

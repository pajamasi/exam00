package c1;

import dto.Person;
import process.Process;
public class C1 {
	
	public double getAv(){
		Person[] p = new Process().getPersonList();
		
		int sum =0;
		for(Person dto : p){
			sum += dto.getScore();
		}
		
		return sum/p.length;
	}
}

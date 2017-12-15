package c3;

import dto.Person;
import process.Process;

public class Multi {
	public int getMulti() {
		Person[] p = new Process().getPersonList();
		int multinum = 1;
		
		
		for(Person dto : p) {
			multinum *= dto.getScore();
		}
		
		return multinum;
	}
	
}

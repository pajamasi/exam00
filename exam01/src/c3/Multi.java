package c3;

import dto.Person;
import process.Process;

public class Multi {
	int multinum = 1;
	Person[] p = new Process().getPersonList();
	
	
	for(Person dto : p) {
		multinum *= dto.getScore();
	}
	
	return multi;
}

package process;

public class Process {
	private person[] getPersonList() {
		Person[] list = new Person[5];

		Person p1 = new Person();
		p1.setName("A");
		p1.setScore(90);

		Person p2 = new Person();
		p2.setName("C");
		p2.setScore(120);

		Person p3 = new Person();
		p3.setName("D");
		p3.setScore(160);

		Person p4 = new Person();
		p4.setName("x");
		p4.setScore(90);

		Person p5 = new Person();
		p5.setName("F");
		p5.setScore(60);

		list[0] = p1;
		list[1] = p2;
		list[2] = p3;
		list[3] = p4;
		list[4] = p5;
		return list;
	}
}

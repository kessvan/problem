package collection;



public class Students {
	String name;
	int rollNo;
	
	public Students(String name, int rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}
	
	
	public void showStudentDetails() {
		System.out.println("name : "+name+"," +"roll no : "+rollNo);
	}
	
	@Override
	public String toString() {
		return 	"name : "+name+","+" roll no : "+rollNo;
	}
	
}



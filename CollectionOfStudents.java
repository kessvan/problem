package collection;


	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Scanner;

	public class CollectionOfStudents {

		public static void main(String[] args) {
			
			List<Students> list = new ArrayList<Students>();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("How many students?");
			int noOfStudents = sc.nextInt();
			
			for (int i = 1; i <= noOfStudents; i++) {
				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Enter Roll number :");
				int rollNo = sc.nextInt();
				Students s = new Students(name, rollNo);
				list.add(s);
			}

			for (Students student : list) {
				student.showStudentDetails();
			}
			
//			List<Student> students = new LinkedList<Student>();
//			Student s = new Student("muthu",44);
//			students.add(s);
//			students.add(new Student("shobika",89));
//			students.add(new Student("hari",79));
//			students.add(new Student("vicky",69));
//			students.add(new Student("ramya",59));
//			students.clear();
//			
////			for (Student student : students) {
////				student.showStudentDetails();
////			}
//			
//			for (int i = 0; i < students.size(); i++) {
//				students.get(i).showStudentDetails();
//			}
			
			
		}

	}



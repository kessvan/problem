package collection;



	import java.util.TreeSet;

	public class StudentsCompareEx {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			StudentsComparator sComp = new StudentsComparator();
			
			TreeSet<Students> students = new TreeSet<Students>(sComp);
			Students s = new Students("muthu",44);
		//System.out.println(s);
			students.add(s);
			students.add(new Students("shobika",89));
			students.add(new Students("hari",79));
			students.add(new Students("vicky",69));
			students.add(new Students("ramya",59));
			students.add(new Students("ramya",59));
			
			for (Students student : students) {
			    student.showStudentDetails();
		}
			//System.out.println(students);
			
		}

	}



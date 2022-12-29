package collection;


	import java.util.Comparator;

	public class StudentsComparator implements Comparator<Students> {

		public int compare(Students stu1, Students stu2) {
			//string ascending comparision
//			int result = stu1.name.compareTo(stu2.name);
//			return result;
			
			if (stu1.rollNo > stu2.rollNo) {
				return 1;
			} else if (stu1.rollNo < stu2.rollNo) {
				return -1;
			} else {
				return 0;
			}
		}

	}



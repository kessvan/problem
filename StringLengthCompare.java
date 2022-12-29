package collection;



	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.TreeSet;

	public class StringLengthCompare {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			StringLengthOrder ascendingLength = new StringLengthOrder();
					
			TreeSet<String> names = new TreeSet<String>(ascendingLength);
			names.add("Akash");
			names.add("Haja");
			names.add("Hari Krish");
			names.add("Dhinagar");
			System.out.println(names);
			
			String s1 = "Hari";
			String s2 = "Akash";
			
			System.out.println("compare to "+s1.equals(s2));

			
			StringReverseComp acendingString = new StringReverseComp();
			
			ArrayList<String> name = new ArrayList<String>();
			name.add("Akash");
			name.add("Haja");
			name.add("Hari Krish");
			name.add("Dhinagar");
			
			Collections.sort(name,acendingString);
			System.out.println(name);
		}

	}



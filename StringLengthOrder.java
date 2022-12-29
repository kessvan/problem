package collection;



	import java.util.Comparator;

	public class StringLengthOrder implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
    	//System.out.println(o1+" "+o2);
			if(o1.length() == o2.length())
				return 0;
			else if (o1.length()>o2.length())
				return 1;
			else
				return -1;
			
		}

		

	}



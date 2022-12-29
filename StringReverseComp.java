package collection;


	import java.util.Comparator;

	public class StringReverseComp implements Comparator<String> {

		@Override
		public int compare(String s1, String s2) {
			int result = s2.compareTo(s1);
			return result;
		}

	}



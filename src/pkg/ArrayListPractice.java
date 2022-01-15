package pkg;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

	private static final Charset A = null;
	private static final Charset Z = null;

	public static void main(String[] args) {
		//ArrayList arrayList = new ArrayList();
		//ArrayList arrayList = new ArrayList();
		List<Integer> arrayList = new ArrayList<Integer>(5);
		for(int i = 0;i<10;i++) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
		
		for(int list: arrayList) {
			System.out.print(list+" ");
		}
		arrayList.remove(5);
		System.out.println(arrayList);
		System.out.println(arrayList.size());
			

	}

}

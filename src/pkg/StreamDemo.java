package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		List<Integer> squareList = new ArrayList<>();
		for(Integer i : numberList) {
			squareList.add(i*i);
		}
		System.out.println(squareList);
		// use of stream api
		// new list square of number list
		List<Integer> squareList1 = numberList.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squareList1);
		List<String> numberList1 = new ArrayList<>();
		numberList1.add("aaaa");
		numberList1.add("abcs");
		numberList1.add("Bssgdh");
		numberList1.add("fghdj");
		numberList1.add("DSFSGFSD");
		//list start with a
		List<String> list = numberList1.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
		System.out.println(list);
		// sort list in natural order
		List<String> sortedList = numberList1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		// iterate each element
		numberList.stream().forEach(y -> System.out.println("element is : "+y));
		// sum of all the element in the list
		int sum = numberList.stream().reduce(0,(ans,i) -> ans+i );
		System.out.println("sum of all element: "+sum);
		}

}

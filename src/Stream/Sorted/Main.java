package Stream.Sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		book book1 = new book(1, "samet",300);
		book book2 = new book(8, "cavur",544);
		book book3 = new book(4, "tekin",167);
		book book4 = new book(2, "cetin",390);
		
		List<book> booklist = Arrays.asList(book1,book2,book3,book4);
		
		
		List<book> sortedById = booklist.stream()
		.sorted(Comparator.comparingLong(book::getId)) //ID'ye gore siralama yaptirdik.
		.collect(Collectors.toList());
		
		System.out.println(sortedById);
		
		

		List<book> sortedByPageSize = booklist.stream()
		.sorted(Comparator.comparingLong(book::getPageSize)) //PageSize'a gore siralama yaptirdik.
		.collect(Collectors.toList());
		
		System.out.println(sortedByPageSize);
		
	}
}

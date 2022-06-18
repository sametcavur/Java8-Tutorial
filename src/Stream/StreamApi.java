package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {
		// List'i stream'e cevirme
		List<String> list = new ArrayList<String>();
		list.add("Samet");
		list.add("Cavur");
		Stream<String> listToStream = list.stream();

		//Array'i stream'e cevirme
		String[] nums = { "Samet" , "Çavur" };
		Stream<String> arrayToStream = Arrays.stream(nums);
		
		//Sifirdan stream olusturma
		Stream<String> streamOf = Stream.of( "Samet", "Çavur" );
		
		//Stream'i List'e cevirme
		List<String> streamToList = streamOf.toList();
		
		//Stream'i Array'e cevirme
		Object[] streamToArray = streamOf.toArray();
		
	
		
		
		
		//ORNEK
		List<Integer> integerList1 = new ArrayList<Integer>();
		integerList1.add(1);
		integerList1.add(4);
		integerList1.add(7);
		
		//ifPresent bir önceki metoddan donen var ise calisan bir metoddur. Bir onceki metodun findFirst yada findAny olmasi gerekir.
		integerList1.stream()
			.filter(num -> num > 5)
			.findAny()
			.ifPresent(num -> { 
				System.out.println(num);
			});
	
		List<String> integerList2 = new ArrayList<String>();
		integerList2.add("1");
		integerList2.add("4");
		integerList2.add("7");
		
		double max = integerList2.stream()
			.mapToInt(Integer::parseInt) //String stream'i integer'a cevirir.
			.max().getAsInt(); //Bu stream icindeki en buyuk degeri bulur.
		System.out.println(max); 
		
		double average = integerList2.stream()
				.mapToInt(Integer::parseInt)
				.average().getAsDouble();//Bu streamdeki degerlerin ortalamasini bulur.
		System.out.println(average);
		
		
		//Primitive Streamler 
		//Bu primitive streamler uzerinde de filter map gibi stream metodlarini kullanabiliriz.
		
		//1 ile 100 arasindaki sayilardan bir stream olusturduk(1 dahil,100 dahil degil) ve uzerinde toplama yaptik. 
		int sum = IntStream.range(1,100).sum();
		System.out.println(sum);
	}
}
/*
Stream dedigimiz olan uzerinde bir takim islemler yapabilecegimiz dizi,kümedir.

Streamler üzerinde;
filter metodu ile Predicate'lerde oldugu gibi bir takim filtreleme,
map metodu ile Function'larda oldugu gibi ayiklama-haritalama,
foreach metodu ile Consumer'larda oldugu gibi listenin tum uyeleri uzerinde islemler yapabiliriz.


-ForEach bir terminal islemdir. Yani bir üzerinde islem yapabilecegimiz bir sey döndürmez ve en son islemi yapar.
ve forEach'ten sonra stream sonlanir.
-ForEach if present vs disindaki diger metodlar (filter,map,sorted,flatMap vs.) intermediate islemlerdir. Yani listedeki itemler
üzerinde bir takim islemler yapar ve geri item dondururler. 
-Stream'imizin son metodu intermediate metod olursa eger stream calismaz, yani filter,map,sorted gibi metodlardan sonra
foreach, ifpresent gibi terminal metod yazmak sarttir.



*/
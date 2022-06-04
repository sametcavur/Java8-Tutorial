package FunctionalInterfaces;

@FunctionalInterface  //Bu anotasyon �art!
interface IInformation {
	public abstract boolean inquireCridentials(String name);
}

public class Main {
	public static void main(String[] args) {
		//�RNEK 1:
		IInformation informations1 = (String name) -> {
			if(name.equals("Samet"))
				return true;
			else 
				return false;
		};
		System.out.println(informations1.inquireCridentials("Samet"));
		
		//**********************************************************************
		
		//�RNEK 2:
		IInformation informations2 = (name) -> true; 
		//�stte g�r�ld��� �zere parametre tipini(String) yazmak zorunlu de�ildir.
		//Return kullanmak i�in s�sl� parantez i�ine almal�y�z.
		System.out.println(informations2.inquireCridentials("Metin"));
	}
}


 /* @FunctionalInterface :
 * Yaln�zca bir tane *abstract metodu* olan interfacelerdir
 * Birden fazla yada s�f�r metod olamaz. Yaln�zca 1 tane olmal�d�r.
 * Bu metod default yada static olabilir.
 * Bu metod, interface i�inde yada super interfacesinde olabilir.
 * Parametreli yada parametresiz tan�mlanabilir.
 * 
 * Normal interfaceden fark�; interfacelerde Impl class�n�n i�erisinde bu interfacenin metodlar�n� doldururuz. 
 * Fakat bunda direk interfaceyi kullanabiliriz.(�rnek �stte)	
 */



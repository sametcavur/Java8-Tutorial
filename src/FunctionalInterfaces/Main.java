package FunctionalInterfaces;

@FunctionalInterface  //Bu anotasyon sart!
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
		//�stte g�r�ld�g� �zere parametre tipini(String) yazmak zorunlu degildir.
		//Return kullanmak i�in s�sl� parantez i�ine almaliyiz.
		System.out.println(informations2.inquireCridentials("Metin"));
	}
}


 /* @FunctionalInterface :
 * Yaln�zca bir tane *abstract metodu* olan interfacelerdir
 * Birden fazla yada s�f�r metod olamaz. Yaln�zca 1 tane olmalidir.
 * Bu metod default yada static olabilir.
 * Bu metod, interface i�inde yada super interfacesinde olabilir.
 * Parametreli yada parametresiz tanimlanabilir.
 * 
 * Normal interfaceden farki; interfacelerde Impl classinin i�erisinde bu interfacenin metodlarini doldururuz. 
 * Fakat bunda direk interfaceyi kullanabiliriz.(�rnek �stte)	
 */



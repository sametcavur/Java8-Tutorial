package FunctionalInterfaces;

@FunctionalInterface  //Bu anotasyon sart!
interface IInformation {
	public abstract boolean inquireCridentials(String name);
}

public class Main {
	public static void main(String[] args) {
		//ÖRNEK 1:
		IInformation informations1 = (String name) -> {
			if(name.equals("Samet"))
				return true;
			else 
				return false;
		};
		System.out.println(informations1.inquireCridentials("Samet"));
		
		//**********************************************************************
		
		//ÖRNEK 2:
		IInformation informations2 = (name) -> true; 
		//Üstte görüldügü üzere parametre tipini(String) yazmak zorunlu degildir.
		//Return kullanmak için süslü parantez içine almaliyiz.
		System.out.println(informations2.inquireCridentials("Metin"));
	}
}


 /* @FunctionalInterface :
 * Yalnýzca bir tane *abstract metodu* olan interfacelerdir
 * Birden fazla yada sýfýr metod olamaz. Yalnýzca 1 tane olmalidir.
 * Bu metod default yada static olabilir.
 * Bu metod, interface içinde yada super interfacesinde olabilir.
 * Parametreli yada parametresiz tanimlanabilir.
 * 
 * Normal interfaceden farki; interfacelerde Impl classinin içerisinde bu interfacenin metodlarini doldururuz. 
 * Fakat bunda direk interfaceyi kullanabiliriz.(Örnek üstte)	
 */



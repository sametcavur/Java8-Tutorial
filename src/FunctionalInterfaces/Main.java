package FunctionalInterfaces;

@FunctionalInterface  //Bu anotasyon þart!
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
		//Üstte görüldüðü üzere parametre tipini(String) yazmak zorunlu deðildir.
		//Return kullanmak için süslü parantez içine almalýyýz.
		System.out.println(informations2.inquireCridentials("Metin"));
	}
}


 /* @FunctionalInterface :
 * Yalnýzca bir tane *abstract metodu* olan interfacelerdir
 * Birden fazla yada sýfýr metod olamaz. Yalnýzca 1 tane olmalýdýr.
 * Bu metod default yada static olabilir.
 * Bu metod, interface içinde yada super interfacesinde olabilir.
 * Parametreli yada parametresiz tanýmlanabilir.
 * 
 * Normal interfaceden farký; interfacelerde Impl classýnýn içerisinde bu interfacenin metodlarýný doldururuz. 
 * Fakat bunda direk interfaceyi kullanabiliriz.(Örnek üstte)	
 */



//Herkes aynı sınava giriyor fakat herkesin farklı stratejileri var. 

public enum EnumDers {

	TURKCE("Türkçe"),	MATEMATIK("Matematik"),

	FEN("Fen"),

	SOSYAL("Sosyal");

	private String ders;

	EnumDers(String ders) {

		this.ders = ders;

	}

	

	@Override

	public String toString() {

		return ders;

	}

}

/* Aşağıdaki interface sınıfında bir değer döndürülmesi için yukarıdaki EnumDers isimli Enum'u oluşturuyoruz.

Enum kavramı, bir değişken üzerinden önceden tanımlanmış özel java sabitleridir. */

public interface SinavStrateji {

	EnumDers getBirinci();

	EnumDers getIkinci();

	EnumDers getUcuncu();

	EnumDers getDorduncu();

}

/*

Her bir alan için teker teker sınav stratejileri oluşturuyoruz.

*/

public class SozelStratejisi implements SinavStratejisi {

	@Override

	public EnumDers getBirinci() {

		return EnumDers.TURKCE;

	}

	@Override

	public EnumDers getIkinci() {

		return EnumDers.SOSYAL;

	}

	@Override

	public EnumDers getUcuncu() {

		return EnumDers.MATEMATIK;

	}

	@Override

	public EnumDers getDorduncu() {

		return EnumDers.FEN;

	}

}

public class EsitAgirlikStratejisi implements SinavStratejisi {

	@Override

	public EnumDers getBirinci() {

		return EnumDers.TURKCE;

	}

	@Override

	public EnumDers getIkinci() {

		return EnumDers.MATEMATIK;

	}

	@Override

	public EnumDers getUcuncu() {

		return EnumDers.SOSYAL;

	}

	@Override

	public EnumDers getDorduncu() {

		return EnumDers.FEN;

	}

}

public class SayisalStratejisi implements SinavStratejisi {

	@Override

	public EnumDers getBirinci() {

		return EnumDers.MATEMATIK;

	}

	@Override

	public EnumDers getIkinci() {

		return EnumDers.TURKCE;

	}

	@Override

	public EnumDers getUcuncu() {

		return EnumDers.FEN;

	}

	@Override

	public EnumDers getDorduncu() {

		return EnumDers.SOSYAL;

	}

}

/*Daha sonrasında öğrencimizi oluşturuyoruz.

Öğrencinin bölümü ve sınav stratejisi vardır.*/

public class Ogrenci 

{

	private EnumBolum bolum;

	private SinavStratejisi sinavStratejisi;

	public Ogrenci (EnumBolum bolum) //Öğrenciyi bölümüne göre oluşturuyoruz.

	{

		this.bolum = bolum;

		

		if (bolum == null) 

		{

			throw new NullPointerException("Bölüm boş olamaz!"); //her öğrencinin bir bölümü olmak zorunda

		}

		

		switch (bolum) //Sınav stratejisi belirliyoruz

		{

			case SOZEL:

				sinavStratejisi = SozelStratejisi();

				break;

			case ESIT_AGIRLIK:

				sinavStratejisi = EsitAgirlikStratejisi();

				break;

			case SAYISAL:

				sinavStratejisi = SayisalStratejisi();

				break;

				default:

					break;

		}

	}

	public String getOncelikSiralamasi() //öğrenci kendisine bir öncelik sıralaması yapar. sınavda hangisi önce çözülmeli?

	{

		System.out.println(bolum + "için stratejisi: ");

		String siralama = "Önce " + sinavStratejisi.getBirinci() + " çöz. \n" +

			"Sonra " + sinavStratejisi.getIkinci() + " çöz. \n" +

			"Daha sonra " + sinavStratejisi.getUcuncu() + " çöz. \n" +

			"Zaman kalırsa " + sinavStratejisi.getDorduncu + " çözersin. \n";

		return siralama; 

	}

}

//Oluşturduğumuz öğrenci için bölüm oluşturuyoruz.

public EnumBolum {

	SOZEL("Sözel");

	SAYISAL("Sayısal");

	ESİT_AGIRLIK("Eşit Ağırlık");

	private String bolum;

	EnumBolum(String bolum) {

		this.bolum = bolum;

	}

	@Override

	public String toString() {

		return bolum;

	}

}

//Test

public class App

{

	public static void main (String[] args) {

		System.out.println("------------------------------");

		siralamaYazdir(EnumBolum.SAYISAL);

		System.out.println("------------------------------");

		siralamaYazdir(EnumBolum.ESIT_AGIRLIK);

		System.out.println("------------------------------");

		siralamaYazdir(EnumBolum.SOZEL);

	}

	public static void siralamaYazdir(EnumBolum Bolum) {

		Ogrenci ogrenci = new Ogrenci (bolum);

		String oncelikSiralamasi = sayisalOgrencisi.getOncelikSiralamasi();

		System.out.println(oncelikSiralamasi);

	}

}

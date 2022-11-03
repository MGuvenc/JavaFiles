public interface Telefon {

    String getModel();
    String getBatarya();
    int getEn();
    int getBoy();
}

public class S8 implements Telefon {

    private String model;
    private String batarya;
    private int en;
    private int boy;

    public S8(String model, String batarya, int en, int boy) {
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBatarya() {
        return batarya;
    }

    @Override
    public int getEn() {
        return en;
    }

    @Override
    public int getBoy() {
        return boy;
    }

    @Override
    public String toString() { // Neyi oluşturduğumuzu görmek için 
        return "S8{" +
                "model='" + model + '\'' +
                ", batarya='" + batarya + '\'' +
                ", en=" + en +
                ", boy=" + boy +
                '}';
    }
}

/*

S8 için yapılan adımların aynısını NOTE8 için de yapıyoruz.

*/

public class Note8 implements Telefon {

    private String model;
    private String batarya;
    private int en;
    private int boy;

    public Note8(String model, String batarya, int en, int boy) {
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBatarya() {
        return batarya;
    }

    @Override
    public int getEn() {
        return en;
    }

    @Override
    public int getBoy() {
        return boy;
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                ", batarya='" + batarya + '\'' +
                ", en=" + en +
                ", boy=" + boy +
                '}';
    }
}

/*

Telefon üretme işini bayiler değil de fabrikalar üstlensin. 
amacımız telefon üretme işini fabrikaya verip telefon ve bayi arasındaki ilişkiyi minimum bağımlılıkla kurmak

Static metodu üzerinden kendisinin (TelefonFabrikasi) oluşturulmasına gerek olmadan getTelefon metodu kullanılarak 
bize verilen moedele ait sınıfı oluşturup dönüyor.

*/
public class TelefonFabrikasi {

    public static Telefon getTelefon(String model, String batarya, int en, int boy){

        Telefon telefon;
        if ("S8".equalsIgnoreCase(model)){ //küçük ve büyük harf duyarlılığının olması istenmiyor
            telefon = new S8(model, batarya, en, boy);
        } 
  else if ("Note8".equalsIgnoreCase(model)){
            telefon = new Note8(model, batarya, en, boy);
        } 
  else {
            throw new RuntimeException("Geçerli bir model değildir!");
        }

        return telefon;
    }
}

/*

Fabrika sınıfını kullanan bayiler oluşturuluyor.
Bu bayiler de fabrikadan telefon istecekler.

*/
public class TelefonBayi {

    public static void main(String[] args) {

        Telefon s8 = TelefonFabrikasi.getTelefon("s8", "2600mah", 4, 7); //TelefonFabrikasi'ndan bir  telefon isteniyor

        Telefon note8 = TelefonFabrikasi.getTelefon("note8", "3000mah", 5, 8);

        System.out.println("S8 için telefon özellikleri: ");
        System.out.println(s8);

        System.out.println("Note8 için telefon özellikleri: ");
        System.out.println(note8);
    }
}

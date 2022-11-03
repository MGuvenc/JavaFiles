/*Oluşturduğumuz Ev sınıfında aynı tipte birden fazla değişken bulunmaktadır.

Değişken sayısının fazla olması sorunumuzu daha rahat tanımlamaktır.

*/

public class Ev {

    private String il;

    private String ilce;

    private String mahalle;

    private int binaYili;

    private int balkonSayisi;

    private int odaSayisi;

    private int banyoSayisi;

    private int tuvaletSayisi;

    private boolean isDublex;

    private boolean isEsyali;

    private boolean hasOtopark;

    private boolean hasCocukParki;

    private boolean hasKlima;

    private boolean hasHavuz;

    public Ev() { //default constructor

    }

    public Ev(String il, String ilce, String mahalle, int binaYili, int balkonSayisi, int odaSayisi, int banyoSayisi, int tuvaletSayisi, 

		boolean isDublex, boolean isEsyali, boolean hasOtopark, boolean hasCocukParki, boolean hasKlima, boolean hasHavuz) { //Parametreli constructor        this.il = il;

        this.ilce = ilce;

        this.mahalle = mahalle;

        this.binaYili = binaYili;

        this.balkonSayisi = balkonSayisi;

        this.odaSayisi = odaSayisi;

        this.banyoSayisi = banyoSayisi;

        this.tuvaletSayisi = tuvaletSayisi;

        this.isDublex = isDublex;

        this.isEsyali = isEsyali;

        this.hasOtopark = hasOtopark;

        this.hasCocukParki = hasCocukParki;

        this.hasKlima = hasKlima;

        this.hasHavuz = hasHavuz;

    }

    @Override

    public String toString() {

        return "Ev{" +

                "il='" + il + '\'' +

                ", ilce='" + ilce + '\'' +

                ", mahalle='" + mahalle + '\'' +

                ", binaYili=" + binaYili +

                ", balkonSayisi=" + balkonSayisi +

                ", odaSayisi=" + odaSayisi +

                ", banyoSayisi=" + banyoSayisi +

                ", tuvaletSayisi=" + tuvaletSayisi +

                ", isDublex=" + isDublex +

                ", isEsyali=" + isEsyali +

                ", hasOtopark=" + hasOtopark +

                ", hasCocukParki=" + hasCocukParki +

                ", hasKlima=" + hasKlima +

                ", hasHavuz=" + hasHavuz +

                '}';

    }

    public String getIl() {

        return il;

    }

    public void setIl(String il) {

        this.il = il;

    }

    public String getIlce() {

        return ilce;

    }

    public void setIlce(String ilce) {

        this.ilce = ilce;

    }

    public String getMahalle() {

        return mahalle;

    }

    public void setMahalle(String mahalle) {

        this.mahalle = mahalle;

    }

    public int getBinaYili() {

        return binaYili;

    }

    public void setBinaYili(int binaYili) {

        this.binaYili = binaYili;

    }

    public int getBalkonSayisi() {

        return balkonSayisi;

    }

    public void setBalkonSayisi(int balkonSayisi) {

        this.balkonSayisi = balkonSayisi;

    }

    public int getOdaSayisi() {

        return odaSayisi;

    }

    public void setOdaSayisi(int odaSayisi) {

        this.odaSayisi = odaSayisi;

    }

    public int getBanyoSayisi() {

        return banyoSayisi;

    }

    public void setBanyoSayisi(int banyoSayisi) {

        this.banyoSayisi = banyoSayisi;

    }

    public int getTuvaletSayisi() {

        return tuvaletSayisi;

    }

    public void setTuvaletSayisi(int tuvaletSayisi) {

        this.tuvaletSayisi = tuvaletSayisi;

    }

    public boolean isDublex() {

        return isDublex;

    }

    public void setDublex(boolean dublex) {

        isDublex = dublex;

    }

    public boolean isEsyali() {

        return isEsyali;

    }

    public void setEsyali(boolean esyali) {

        isEsyali = esyali;

    }

    public boolean isHasOtopark() {

        return hasOtopark;

    }

    public void setHasOtopark(boolean hasOtopark) {

        this.hasOtopark = hasOtopark;

    }

    public boolean isHasCocukParki() {

        return hasCocukParki;

    }

    public void setHasCocukParki(boolean hasCocukParki) {

        this.hasCocukParki = hasCocukParki;

    }

    public boolean isHasKlima() {

        return hasKlima;

    }

    public void setHasKlima(boolean hasKlima) {

        this.hasKlima = hasKlima;

    }

    public boolean isHasHavuz() {

        return hasHavuz;

    }

    public void setHasHavuz(boolean hasHavuz) {

        this.hasHavuz = hasHavuz;

    }

}

/*

Ev sınıfına ait bütün değişkenleri bu sınıfımızda da oluşturuyoruz. Buradaki fark ise şudur; setter'ların içerisinde her seferinde return olarak yine builder'ı döndürecektir. 

Setter'ların içerisinde her seferinde builder'ı döndürüp evi inşa etmeyecek. Hepsini aldıktan sonra evi inşa edecek.

*/

public class EvBuilder {

    private String il;

    private String ilce;

    private String mahalle;

    private int binaYili;

    private int balkonSayisi;

    private int odaSayisi;

    private int banyoSayisi;

    private int tuvaletSayisi;

    private boolean isDublex;

    private boolean isEsyali;

    private boolean hasOtopark;

    private boolean hasCocukParki;

    private boolean hasKlima;

    private boolean hasHavuz;

    public static EvBuilder startNormalEvBuild(String il, String ilce, String mahalle, int binaYili, int odaSayisi){

        EvBuilder evBuilder = new EvBuilder();

        evBuilder.il = il;

        evBuilder.ilce = ilce;

        evBuilder.mahalle = mahalle;

        evBuilder.binaYili = binaYili;

        evBuilder.odaSayisi = odaSayisi;

        return evBuilder;

    }

    public static EvBuilder startHavuzluEvBuild(String il, String ilce, String mahalle, int binaYili, int odaSayisi){

        EvBuilder evBuilder = new EvBuilder();

        evBuilder.il = il;

        evBuilder.ilce = ilce;

        evBuilder.mahalle = mahalle;

        evBuilder.binaYili = binaYili;

        evBuilder.odaSayisi = odaSayisi;

        evBuilder.hasHavuz = true;

        return evBuilder;

    }

    public Ev build(){

        Ev ev = new Ev();

        ev.setIl(il);

        ev.setIlce(ilce);

        ev.setMahalle(mahalle);

        ev.setBinaYili(binaYili);

        ev.setBalkonSayisi(balkonSayisi);

        ev.setOdaSayisi(odaSayisi);

        ev.setBanyoSayisi(banyoSayisi);

        ev.setTuvaletSayisi(tuvaletSayisi);

        ev.setDublex(isDublex);

        ev.setEsyali(isEsyali);

        ev.setHasOtopark(hasOtopark);

        ev.setHasCocukParki(hasCocukParki);

        ev.setHasKlima(hasKlima);

        ev.setHasHavuz(hasHavuz);

        return ev;

    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {

        this.balkonSayisi = balkonSayisi;

        return this;

    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {

        this.banyoSayisi = banyoSayisi;

        return this;

    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {

        this.tuvaletSayisi = tuvaletSayisi;

        return this;

    }

    public EvBuilder setDublex(boolean dublex) {

        isDublex = dublex;

        return this;

    }

    public EvBuilder setEsyali(boolean esyali) {

        isEsyali = esyali;

        return this;

    }

    public EvBuilder setHasOtopark(boolean hasOtopark) {

        this.hasOtopark = hasOtopark;

        return this;

    }

    public EvBuilder setHasCocukParki(boolean hasCocukParki) {

        this.hasCocukParki = hasCocukParki;

        return this;

    }

    public EvBuilder setHasKlima(boolean hasKlima) {

        this.hasKlima = hasKlima;

        return this;

    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {

        this.hasHavuz = hasHavuz;

        return this;

    }

}

public class Emlakci {

    public static void main(String[] args) {

        Ev ev1 = new Ev();

        ev1.setIl("İstanbul");

        ev1.setIlce("Ataşehir");

        ev1.setMahalle("Atatürk");

        ev1.setOdaSayisi(3);

        ev1.setBinaYili(2010);

        ev1.setHasKlima(true);

        Ev ev2 = new Ev("İstanbul", "Ümraniye", "Tatlısu", 2008, 2, 3, 2, 0, false,

                false, true, true, true, false);

        printEv(ev1);

        printEv(ev2);

    }

    private static  void printEv(Ev ev){

        System.out.println();

        System.out.println("Ev eklendi -> " + ev);

        System.out.println();

    }

}

/*

EmlakciV2 ev'i değil de evBuilder'ı kullanır.

Emlakçı listesine ev ekler.

*/

public class EmlakciV2 {

    public static void main(String[] args) {

        Ev ev1 = EvBuilder.startNormalEvBuild("İstanbul", "Ümraniye", "Tatlısu", 2008, 3)

                .setHasCocukParki(true)

                .setHasOtopark(true)

                .build();

        Ev ev2 = EvBuilder.startHavuzluEvBuild("İstanbul", "Ataşehir", "Atatürk", 2010, 4)

                .setHasCocukParki(true)

                .setHasOtopark(true)

                .build();

        printEv(ev1);

        printEv(ev2);

    }

    private static  void printEv(Ev ev){

        System.out.println();

        System.out.println("Ev eklendi -> " + ev);

        System.out.println();

    }

}

/*

Emlakcı sınıfında oluşturulan ev çok karışıktır. neye false dendiği ya da neye true dendiğinde karmaşıklıklar oluşabilmektedir.

Ya da oluşturulan ev nesnesinde bazı özellikler eksik olabilir. Ama aslında constuctur'da zorunlu kılınmıştı bütün özellikler. 

Bütün bunların yanında constuctor'ların isimleri yok.

EmlakciV2'de ise durum bunların tam tersi. Özellikler zorunlu değil istediğimizi kullanıyoruz. Ayrıca constructor'lara isimlendirme yapabiliyoruz.

Yani builder tasarım deseninin amacı karmaşıklığı azaltıp esnekliği arttırmaktır.*/

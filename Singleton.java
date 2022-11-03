public class Singleton {

    private static Singleton singleton;

    private Singleton()

    { 

        

    }

//New demeden nesneye ait bir metodu kullanmak için static yapıyoruz

    public static Singleton getSingleton()

    {

        return singleton;

    }

}

public class App {

    public static void main(String[] args) {

            Singleton singleton = Singleton.getSingleton();

    }

}

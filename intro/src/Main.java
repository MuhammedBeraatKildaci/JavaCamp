public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade süresi";
        System.out.println(ortaMetin);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.10;

        boolean dolarDustuMu = true;

        String okYonu = "";

        if (dolarBugun < dolarDun) {
            okYonu = "down.svg";
            System.out.println(okYonu);
        } else if (dolarBugun > dolarDun) {
            okYonu = "up.svg";
            System.out.println(okYonu);
        } else {
            okYonu = "equal.svg";
            System.out.println(okYonu);
        }

        String[] krediler={"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}

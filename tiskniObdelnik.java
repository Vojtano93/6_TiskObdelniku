public class tiskniObdelnik {

    public static void tiskniObdelnik(int vyska, int sirka) {
        // Ošetření vstupních hodnot
        if (vyska < 1 || vyska > 8) {
            System.out.println("Chyba: Výška musí být mezi 1 a 8.");
            return;
        }
        if (sirka < 3 || sirka > 20) {
            System.out.println("Chyba: Šířka musí být mezi 3 a 20.");
            return;
        }

        // Tisk horní hrany obdélníku
        for (int i = 0; i < sirka; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Tisk bočních hran obdélníku
        for (int i = 0; i < vyska - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < sirka - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // Tisk dolní hrany obdélníku
        for (int i = 0; i < sirka; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Zvolení rozměrů obdelníku
        tiskniObdelnik(4, 6);
    }
}

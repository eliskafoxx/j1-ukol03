package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        Pocitac eliskyPocitac;
        eliskyPocitac = new Pocitac();

        Procesor eliskyProcesor = new Procesor();
        eliskyProcesor.setRychlost(3_200_000_000_000L);
        eliskyProcesor.setVyrobce("Apple");

        Pamet eliskyPamet = new Pamet();
        eliskyPamet.setKapacitaPameti(8_000_000_000L);

        Disk eliskyDisk = new Disk();
        eliskyDisk.setKapacita(245_107_195_904L);
        eliskyDisk.setVyuziteMisto(232_109_182_098L);

        /* vypise chybu "PC nelze zapnout bez procesoru!":
        System.out.println(eliskyPocitac.toString());
        eliskyPocitac.zapniSe();
        */

        eliskyPocitac.setCpu(eliskyProcesor);

        /* vypise chybu "PC nelze zapnout bez operacni pameti!":
        System.out.println(eliskyPocitac.toString());
        eliskyPocitac.zapniSe();
        */

        eliskyPocitac.setRam(eliskyPamet);

        /* vypise chybu "PC nelze zapnout bez HD!":
        System.out.println(eliskyPocitac.toString());
        eliskyPocitac.zapniSe();
        */
        eliskyPocitac.setPevnyDisk(eliskyDisk);

        // dojde k zapnuti PC:
        System.out.println(eliskyPocitac.toString());
        eliskyPocitac.zapniSe();

        /* vypise chybu "PC je jiz zapnuto!":
        System.out.println(eliskyPocitac.toString());
        eliskyPocitac.zapniSe();
         */

        // vypnuti PC -> off:
        System.out.println(eliskyPocitac.toString());
        eliskyPocitac.vypniSe();

        // nevypise chybu -> nic se nedeje:
        System.out.println(eliskyPocitac.toString());
        eliskyPocitac.vypniSe();

        // CAST 2
        // nelze vytvaret soubory pri vypnutem PC - chyba (nic se nedeje):
        eliskyPocitac.vytvorSouborOVelikosti(300_000_001L);

        // vytvareni a mazani souboru:
        eliskyPocitac.zapniSe();
        eliskyPocitac.vytvorSouborOVelikosti(300_000_001L);
        eliskyPocitac.vymazSouborOVelikosti(300_000_001L);

        // vypise chybu: "Nelze vytvorit pozadovany soubor, HD nema dostatecnou kapacitu!":
        eliskyPocitac.vytvorSouborOVelikosti(999_999_000_001L);

        // nelze mazat soubory pri vypnutem PC - chyba (nic se nedeje):
        eliskyPocitac.vypniSe();
        eliskyPocitac.vymazSouborOVelikosti(300_000_001L);
    }

}

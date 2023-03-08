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


        eliskyPocitac.setCpu(eliskyProcesor);

        eliskyPocitac.setRam(eliskyPamet);

        eliskyPocitac.setPevnyDisk(eliskyDisk);


        System.out.println(eliskyPocitac.toString());
        eliskyPocitac.zapniSe();


    }

}

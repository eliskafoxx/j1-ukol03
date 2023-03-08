package cz.czechitas.ukol3;

public class Pamet {
    private Long kapacitaPameti;

    public Long getKapacitaPameti() {
        return kapacitaPameti;
    }

    public void setKapacitaPameti(Long kapacitaPameti) {
        this.kapacitaPameti = kapacitaPameti;
    }
    @Override
    public String toString() {
        return "Kapacita operacni pameti je: " + kapacitaPameti + " bajtu.";
    }
}

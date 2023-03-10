package cz.czechitas.ukol3;

public class Disk {
    private Long kapacita;
    private Long vyuziteMisto;

    public Long getKapacita() {
        return kapacita;
    }

    public void setKapacita(Long kapacita) {
        this.kapacita = kapacita;
    }

    public Long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(Long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }
    @Override
    public String toString() {
        return "HD: "+ kapacita + " bajtu, vyuzite: "+ vyuziteMisto + " bajtu.";
    }
}

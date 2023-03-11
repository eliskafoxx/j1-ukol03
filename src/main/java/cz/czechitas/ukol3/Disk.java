package cz.czechitas.ukol3;

public class Disk {
    private Long kapacita;
    private Long vyuziteMisto;

    public Long getKapacita() {
        return kapacita;
    }
    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }
    public long getVyuziteMisto() {
        return vyuziteMisto;
    }
    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }
    @Override
    public String toString() {
        return "HD: "+ kapacita + " bajtu, vyuzite: "+ vyuziteMisto + " bajtu.";
    }
}

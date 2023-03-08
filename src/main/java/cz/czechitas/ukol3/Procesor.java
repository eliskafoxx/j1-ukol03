package cz.czechitas.ukol3;

public class Procesor {
    private String vyrobce;
    private Long rychlost;

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public Long getRychlost() {
        return rychlost;
    }

    public void setRychlost(Long rychlost) {
        this.rychlost = rychlost;
    }
    @Override
    public String toString() {
        return "Procesor je: " + vyrobce + " " + rychlost + " Hz.";
    }
}

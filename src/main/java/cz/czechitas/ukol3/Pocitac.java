package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public boolean isjeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.err.println("Chyba: PC je jiz zapnuto!");
        } else if (cpu == null) {
            System.err.println("Chyba: PC nelze zapnout bez procesoru!");
        } else if (ram == null) {
            System.err.println("Chyba: PC nelze zapnout bez operacni pameti!");
        } else if (pevnyDisk == null) {
            System.err.println("Chyba: PC nelze zapnout bez HD!");
        } else {
            jeZapnuty = true;
            System.out.println("PC se zapnulo.");
        }
    }
    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("(off)");
        } else {
            System.out.println("(nic se nedeje)");
        }
    }
    }
package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, cijena;
    private int kod;
    public Artikl(String naziv, int kod, String cijena) {
        this.naziv = naziv; this.cijena = cijena; this.kod = kod;
    }
    public String getNaziv() {
        return naziv;
    }
    public String getCijena() {
        return cijena;
    }
    public int getKod() {
        return kod;
    }
}

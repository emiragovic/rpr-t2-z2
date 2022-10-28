public class Racun {
    public Long brojRacuna;
    public Osoba korisnikRacuna;
    public boolean odobrenjePrekoracenja;
    public Double stanjeRacuna;
    //private Double iznosOdobrenogPrekoracenja;


    public Racun(Long brojRacuna, Osoba osoba) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = new Osoba(osoba);
        this.stanjeRacuna = 0.0;
        this.odobrenjePrekoracenja = false;
    }

    public Racun(Racun r) {
        this.brojRacuna = r.brojRacuna;
        this.korisnikRacuna = r.korisnikRacuna;
        this.odobrenjePrekoracenja = r.odobrenjePrekoracenja;
        this.stanjeRacuna = r.stanjeRacuna;
    }

    private boolean provjeriOdobrenjePrekoracenja() {
        return true;
    }

    public boolean izvrsiUplatu(Double iznos) {
        return true;
    }

    public boolean izvrsiIsplatu(Double iznos) {
        return true;
    }

    public void odobriPrekoracenje(Double iznos) {
    }

}

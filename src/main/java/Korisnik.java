public class Korisnik extends Osoba{
    private Racun racun;

    public Korisnik(String ime, String prezime){
        super(ime, prezime);
    }

    public void DodajRacun(Racun R){
        racun = new Racun(R);
    }
}

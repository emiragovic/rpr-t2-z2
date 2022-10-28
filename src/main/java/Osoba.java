public class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Osoba(Osoba O) {
        this.ime = O.ime;
        this.prezime = O.prezime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
};


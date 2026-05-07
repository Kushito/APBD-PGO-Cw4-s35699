public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    // Getters and setters
    public String getIdPracownika() {
        return idPracownika;
    }
    public void setIdPracownika(String idPracownika) {
        this.idPracownika = idPracownika;
    }
    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public double getStawkaBazowa() {
        return stawkaBazowa;
    }
    public void setStawkaBazowa(double stawkaBazowa) {
        this.stawkaBazowa = stawkaBazowa;
    }

    public final String pobierzIdPracownika() {
        return String.format("ID: %s", idPracownika);
    }

    public double obliczWynagrodzenie() {
        return stawkaBazowa;
    }

    public String Opis(){
        return String.format("Pracownik: %s %s, ID: %s, Stawka bazowa: %.2f", imie, nazwisko, idPracownika, stawkaBazowa);
    }

    @Override
    public String toString() {
        return Opis();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pracownik pracownik = (Pracownik) obj;
        return idPracownika.equals(pracownik.idPracownika);
    }

}
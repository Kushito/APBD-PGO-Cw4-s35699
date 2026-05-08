public class Programista extends Pracownik {

    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public String Technologia(){
        return String.format("Główny język programowania: %s", glownyJezyk);
    }

    @Override
    public double obliczWynagrodzenie(){
        return super.obliczWynagrodzenie() + (liczbaRepozytoriow * 50);
    }

    @Override
    public String Opis(){
        return String.format("Programista: %s %s, ID: %s, Stawka bazowa: %.2f, Główny język: %s, Liczba repozytoriów: %d",
                getImie(), getNazwisko(), getIdPracownika(), getStawkaBazowa(), glownyJezyk, liczbaRepozytoriow);
    }

    @Override
    public String toString() {
        return Opis();
    }
}

public class Programista extends Pracownik {

    private String mainLang;
    private int liczbaRepozytoriow;

    public Programista(String Id, String name, String surname, double BaseSalary, String mainLang, int liczbaRepozytoriow) {
        super(Id, name, surname, BaseSalary);
        this.mainLang = mainLang;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public String Technologia(){
        return String.format("Główny język programowania: %s", mainLang);
    }

    @Override
    public double obliczWynagrodzenie(){
        return super.obliczWynagrodzenie() + (liczbaRepozytoriow * 50);
    }

    @Override
    public String Opis(){
        return String.format("Programista: %s %s, ID: %s, Stawka bazowa: %.2f, Główny język: %s, Liczba repozytoriów: %d",
                getName(), getSurname(), getId(), getBaseSalary(), mainLang, liczbaRepozytoriow);
    }

    @Override
    public String toString() {
        return Opis();
    }
}

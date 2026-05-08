public class Pracownik {
    private String Id;
    private String name;
    private String surname;
    private double BaseSalary;

    public Pracownik(String Id, String name, String surname, double BaseSalary) {
        this.Id = Id;
        this.name = name;
        this.surname = surname;
        this.BaseSalary = BaseSalary;
    }

    // Getters and setters
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public double getBaseSalary() {
        return BaseSalary;
    }
    public void setBaseSalary(double BaseSalary) {
        this.BaseSalary = BaseSalary;
    }

    public final String pobierzIdPracownika() {
        return String.format("ID: %s", Id);
    }

    public double obliczWynagrodzenie() {
        return BaseSalary;
    }

    public String Opis(){
        return String.format("Pracownik: %s %s, ID: %s, Stawka bazowa: %.2f", name, surname, Id, BaseSalary);
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
        return Id.equals(pracownik.Id);
    }

}
public class Tester extends Pracownik {

    private boolean isAutomationTester;
    private int numberOfTests;

    public Tester(String Id, String name, String surname, double BaseSalary, boolean isAutomationTester, int numberOfTests) {
        super(Id, name, surname, BaseSalary);
        this.isAutomationTester = isAutomationTester;
        this.numberOfTests = numberOfTests;
    }

    public boolean getIsAutomationTester() {
        return isAutomationTester;
    }

    public int getNumberOfTests() {
        return numberOfTests;
    }

    public void runningTestsReport() {
        System.out.println("Running tests...");
    }

    @Override
    public double obliczWynagrodzenie() {
        double bonus = isAutomationTester ? 200 : 0;
        return super.obliczWynagrodzenie() + bonus + (numberOfTests * 10);
    }

    @Override
    public String Opis() {
        return String.format("Tester: %s %s, ID: %s, Stawka bazowa: %.2f, Automatyzacja: %b, Liczba testów: %d",
                getName(), getSurname(), getId(), getBaseSalary(), isAutomationTester, numberOfTests);
    }

}

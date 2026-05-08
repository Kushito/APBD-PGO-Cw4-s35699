public class Main {
    public static void main(String[] args) {
        
        ProjectTeam Team1 = new ProjectTeam("Projekt Alpha");

        Programista programista1 = new Programista("P001", "Jan", "Kowalski", 5000, "Java", 5);
        Programista programista2 = new Programista("P002", "Anna", "Nowak", 5500, "Python", 3);
        Tester tester1 = new Tester("T001", "Piotr", "Zieliński", 4000, true, 20);

        Team1.addTeamMember(programista1);
        Team1.addTeamMember(programista2);
        Team1.addTeamMember(tester1);

        Team1.displayTeamInfo();
        System.out.println("Total Salary: " + Team1.calculateTotalSalary());

        System.out.println(programista1.Opis());
        System.out.println(programista2.Opis());

        if (programista1 instanceof Programista) {
            Programista p = (Programista) programista1;
            System.out.println(p.Technologia());
        }

        System.out.println(programista2.equals(new Tester("TOO2", "Michal", "Lewandowski", 9000.0, false, 10)));
        System.out.println(programista2);

    }
}
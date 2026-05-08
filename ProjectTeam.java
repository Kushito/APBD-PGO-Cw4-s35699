import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Pracownik> teamMembers;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.teamMembers = new ArrayList<>();
    }

    public void addTeamMember(Pracownik member) {
        teamMembers.add(member);
    }

    public void displayTeamInfo() {
        System.out.println("Project: " + projectName);
        for (Pracownik member : teamMembers) {
            System.out.println(member);
        }
    }

    public double calculateTotalSalary() {
        double totalSalary = 0;
        for (Pracownik member : teamMembers) {
            totalSalary += member.obliczWynagrodzenie();
        }
        return totalSalary;
    }

    public Pracownik findMemberById(String id) {
        for (Pracownik member : teamMembers) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null; // Not found
    }

    public Programista displayProgramista() {
        Programista displayProgramista = null;
        for (Pracownik member : teamMembers) {
            if (member instanceof Programista) {
                displayProgramista = (Programista) member;
                teamMembers.remove(member);
                break;
            }
        }
        return displayProgramista; // Returns the displayed programmer or null if none found
    }

    public Tester displayTester() {
        Tester displayTester = null;
        for (Pracownik member : teamMembers) {
            if (member instanceof Tester) {
                displayTester = (Tester) member;
                teamMembers.remove(member);
                break;
            }
        }
        return displayTester; // Returns the displayed tester or null if none found
    }
}

package Collection;
import java.util.*;
class Project {
    private String projectName;
    private String projectDescription;
    private Set<String> teamMembers;

    public Project(String projectName, String projectDescription) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.teamMembers = new HashSet<>();
    }

    public void addTeamMember(String teamMember) {
        teamMembers.add(teamMember);
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public Set<String> getTeamMembers() {
        return teamMembers;
    }

    @Override
    public String toString() {
        return "Project Name: " + projectName + "\nProject Description: " + projectDescription +
               "\nTeam Members: " + teamMembers;
    }
}

public class ProjectManagement{
    private static Map<String, Project> projects = new HashMap<>();
    private static Set<String> projectNames = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Project Management System ");
            System.out.println("1.Add Project");
            System.out.println("2.Assign Team Members");
            System.out.println("3.View Project Details");
            System.out.println("4.List All Projects");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    addProject(scanner);
                    break;
                case 2:
                    assignTeamMember(scanner);
                    break;
                case 3:
                    viewProjectDetails(scanner);
                    break;
                case 4:
                    listAllProjects();
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting Project Management System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addProject(Scanner scanner) {
        System.out.print("Enter project name: ");
        String projectName = scanner.nextLine();
        if (projectNames.contains(projectName)) {
            System.out.println("Project with the same name already exists. Please use a unique name.");
            return;
        }
        System.out.print("Enter project description: ");
        String projectDescription = scanner.nextLine();

        Project project = new Project(projectName, projectDescription);
        projects.put(projectName, project);
        projectNames.add(projectName); 
        System.out.println("Project added successfully: " + projectName);
    }

    private static void assignTeamMember(Scanner scanner) {
        System.out.print("Enter project name: ");
        String projectName = scanner.nextLine();

        Project project = projects.get(projectName);
        if (project != null) {
            System.out.print("Enter team member's name: ");
            String teamMember = scanner.nextLine();

            project.addTeamMember(teamMember);
            System.out.println("Team member " + teamMember + " assigned to " + projectName);
        } else {
            System.out.println("Project not found: " + projectName);
        }
    }

    private static void viewProjectDetails(Scanner scanner) {
        System.out.print("Enter project name: ");
        String projectName = scanner.nextLine();

        Project project = projects.get(projectName);
        if (project != null) {
            System.out.println("Project Details:\n" + project);
        } else {
            System.out.println("Project not found: " + projectName);
        }
    }

    private static void listAllProjects() {
        System.out.println("\nList of All Projects:");
        for (Project project : projects.values()) {
            System.out.println(project);
            
        }
    }
}

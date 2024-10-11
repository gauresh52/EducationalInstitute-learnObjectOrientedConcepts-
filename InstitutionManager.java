import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InstitutionManager {
    private List<Institution> institutions;

    public InstitutionManager() {
        institutions = new ArrayList<>();
    }

    // Method to load institutions from CSV file
    public void loadInstitutions(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",", -1);
                if (data.length == 6) { // Ensure there are exactly 6 elements
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    String city = data[2].trim();
                    String state = data[3].trim();
                    String act = data[4].trim().replace("\"", ""); // Remove quotes
                    String ministry = data[5].trim();
                    institutions.add(new Institution(id, name, city, state, act, ministry));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the CSV file: " + e.getMessage());
        }
    }

    // Method to display all institutions
    public void displayInstitutions() {
        for (Institution institution : institutions) {
            System.out.println(institution);
        }
    }

    // Method to search institutions by name
    public void searchInstitutionByName(String name) {
        for (Institution institution : institutions) {
            if (institution.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(institution);
            }
        }
    }
}

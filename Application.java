import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;

public class Application {
    public static void main(String[] args) {
        House[] housesArray = createHouses();
        DynamicArray studentsArray = fillStudentsArray();

        System.out.println("----Hogwarts Houses----");
        for (House house : housesArray) {
            System.out.println(house.getName());
        }

        System.out.println();
        System.out.println("----Hogwarts Students----");
        for (int i = 0; i < studentsArray.size(); i++) {
            System.out.println("Student number " + (i + 1) + ": " + studentsArray.get(i).getFullName());
        }
        System.out.println("----Printed first 20 students----");
        System.out.println(studentsArray.size());

    }
    public static House[] createHouses() {
        House[] housesArray = new House[4];
        housesArray[0] = new House("Gryffindor", "Godric Gryffindor", "scarlet", "gold");
        housesArray[1] = new House("Hufflepuff", "Helga Hufflepuff", "yellow", "black");
        housesArray[2] = new House("Ravenclaw", "Rowena Ravenclaw", "blue", "bronze");
        housesArray[3] = new House("Slytherin", "Salazar Slytherin", "green", "silver");
        return housesArray;
    }

    public static DynamicArray fillStudentsArray() {
        // Change this location to match the location on your machine.
        String studentsDataLocation = "C:/Users/malte/Documents/GitHub/java-harry-potter-aflevering/hogwarts-opgave/src/students.json";

        DynamicArray studentArray = new DynamicArray();

        // Reads the file and parses it. Then loops through the array and creates new Student objects for each of them.
        try (FileReader reader = new FileReader(studentsDataLocation)) {
            JsonArray studentsJSON = JsonParser.parseReader(reader).getAsJsonArray();

            for (JsonElement element : studentsJSON) {
                String name = element.getAsJsonObject().get("name").getAsString();
                Student newStudent = new Student(name);
                studentArray.add(newStudent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return studentArray;
    }
}

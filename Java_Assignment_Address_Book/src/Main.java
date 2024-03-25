import Controller.Controller;
import Model.Model;
import View.View;
/**
 * Identification comments:
 * Name:Manas Patil
 * JAVA Extra Assignment
 *   Title:Simple Address Book Application
 * program to read/write/delete/Edit file and display contents
 * Experiment Date: 26-03-2024
 * @version 1.0




 * Beginning comments:
 * Filename: Main.java
 * @author: Manas Patil
 * Overview: This is main Class which make Object of Model and Veiw and pass to Controller
 **/


public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}
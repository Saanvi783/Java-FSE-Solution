/*
QUESTION:
Implementing the MVC Pattern
Scenario: MVC pattern for Student record management.
*/

class StudentModel {
    private String name, id;
    public StudentModel(String id, String name) { this.id = id; this.name = name; }
    public String getName() { return name; }
    public String getId() { return id; }
}
class StudentView {
    public void printDetails(String name, String id) { System.out.println("Student: " + name + " [ID: " + id + "]"); }
}
class StudentController {
    private StudentModel model; private StudentView view;
    public StudentController(StudentModel m, StudentView v) { this.model = m; this.view = v; }
    public void updateView() { view.printDetails(model.getName(), model.getId()); }
}
public class Exercise10_MVCPattern_Solution {
    public static void main(String[] args) {
        StudentController controller = new StudentController(new StudentModel("S1", "John"), new StudentView());
        controller.updateView();
    }
}

import java.util.ArrayList;

// Student-klassen, der arver fra Person
class Student extends Person {
    private ArrayList<String> passedCourses;   // Liste over beståede kurser
    private ArrayList<String> currentCourses;  // Liste over nuværende kurser

    // Konstruktør for Student, hvor passedCourses angives
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);  // Kalder Person-konstruktøren
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList<>();
    }

    // Override af addCourse-metoden for Student
    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;  // Studerende kan ikke tage kurser, som allerede er bestået
        } else {
            currentCourses.add(course);  // Tilføj kursus til currentCourses
            return true;
        }
    }
}

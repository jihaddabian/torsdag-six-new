import java.util.ArrayList;

// Teacher-klassen, der arver fra Person
class Teacher extends Person {
    private ArrayList<String> canTeach;       // Liste over kurser, læreren kan undervise i
    private ArrayList<String> currentCourses; // Liste over nuværende kurser

    // Konstruktør for Teacher, hvor canTeach angives
    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);  // Kalder Person-konstruktøren
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();
    }

    // Override af addCourse-metoden for Teacher
    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {
            currentCourses.add(course);  // Tilføj kursus til currentCourses
            return true;
        } else {
            return false;  // Læreren kan ikke undervise i kurset
        }
    }
}

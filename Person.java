// Person-klassen er abstrakt og har en abstrakt metode addCourse
abstract class Person {
    private String name;

    // Konstruktør for Person-klassen
    public Person(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Abstrakt metode addCourse, som subklasser skal implementere
    public abstract boolean addCourse(String course);
}

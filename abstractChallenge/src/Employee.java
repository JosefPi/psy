public abstract class Employee {
    protected String name, surname;

    //Konstruktory:
    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //Metody:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

/* To zadziała:
    public String toString(String className) {
        return className + "{name='" + name + '\'' +
                ", surname='" + surname + '\''+"}";
    }

 */

/* To też zadziałą:
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }

 */

    //Ale my chcemy tak:

    @Override
    public abstract String toString();
}

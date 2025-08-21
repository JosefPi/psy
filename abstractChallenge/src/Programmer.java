public class Programmer extends Employee {
    protected String languages;

    //Konstruktory:
    public Programmer(String languages) {
        this.languages = languages;
    }

    public Programmer(String name, String surname, String languages) {
        super(name, surname);
        this.languages = languages;
    }

    //Metody:
    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }



    @Override
    public String toString() {
        /* To działa:
        return "Programmer{name=" + '\'' + super.getName() + '\'' +
                         ", surname= " + '\'' + super.getSurname() + '\'' +
                         ", language= " + '\'' + this.languages + '\'' + "}";

         */
        //ale można tez tak, bo zmienne name i surname są oznaczone tylko jako 'protected'
        //więc sąwidoczne w klasie dziedziczącej i znajdującej się w tym samym pakiecie:
        return "Programmer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", languages='" + languages + '\'' +
                '}';

    }
}

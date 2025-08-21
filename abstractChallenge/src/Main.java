//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/**
 1. Stwórz klasę abstrakcyjną Employee posiadającą:
    a) pola protected String name, surname
    b) konstruktor oraz gettery i settery dla powyższych pól
    c) publiczną abstrakcyjną metodę toString() zwracąjącą łańcuch znaków
 2. Stwórz klasę Programmer rozszerzającą abstrakcyjną klasę Employee:
    a) dodaj do tej klasy pole String protected o nazwie languages
    b) dodaj getter i setter
    c) na koniec stwórz metodę toString(), która prezentowałą by dane z Employee i Programmer
 */
        System.out.println();
        System.out.println("Przykład zastosowania klasy abstrakcyjnej o nazwie 'Employee'");
        Employee employee = new Programmer("Witold", "Kozakiewicz", "C++, Turbo Pascal");
        //Można tak:
        System.out.println(employee.toString());
        //Ale InteliJ mówi,że można teżtak:
        System.out.println(employee);
    }
}
/*
Przykład zastosowania klasy abstrakcyjnej o nazwie 'Employee'
Programmer{name='Witold', surname='Kozakiewicz', languages='C++, Turbo Pascal'}
Programmer{name='Witold', surname='Kozakiewicz', languages='C++, Turbo Pascal'}

Process finished with exit code 0
 */
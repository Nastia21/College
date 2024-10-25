import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.fillArray();
        arrayHandler.printArray();
        arrayHandler.searchElement(7);
        arrayHandler.deleteElement(10);
        arrayHandler.insertElement(5, 9);

        Person person = new Person("Слава", "Ивушкин", 30);
        person.printInfo();

        PersonArrayHandler personHandler = new PersonArrayHandler();
        personHandler.addPerson(person, 0);

        Person foundPerson = personHandler.searchPerson("Слава");
        if (foundPerson != null) {
            foundPerson.printInfo();
        } else {
            System.out.println("Человек не найден.");
        }

        personHandler.deletePerson(0);
    }
}

class ArrayHandler {

    private int[] array = new int[100];

    public void fillArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArray() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void searchElement(int element) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Элемент " + element + " найден на позиции " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Элемент " + element + " не найден.");
        }
    }

    public void deleteElement(int element) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                found = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                System.out.println("Элемент " + element + " удален.");
                break;
            }
        }
        if (!found) {
            System.out.println("Элемент " + element + " не найден.");
        }
    }

    public void insertElement(int element, int position) {
        if (position < 0 || position >= array.length) {
            System.out.println("Неверная позиция.");
            return;
        }

        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = element;
        System.out.println("Элемент " + element + " вставлен на позицию " + position);
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", Возраст: " + age);
    }
}

class PersonArrayHandler {
    private Person[] people = new Person[100];

    public void addPerson(Person person, int index) {
        if (index >= 0 && index < people.length) {
            people[index] = person;
        }
    }

    public Person searchPerson(String firstName) {
        for (Person person : people) {
            if (person != null && person.getFirstName().equals(firstName)) {
                return person;
            }
        }
        return null;
    }

    public void deletePerson(int index) {
        if (index >= 0 && index < people.length) {
            people[index] = null;
        }
        else {
            System.out.println("Неверный индекс");
        }
    }
}

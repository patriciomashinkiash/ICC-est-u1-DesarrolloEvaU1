import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusqueda {

    // Selection sort by age
    public void sortByAgeWithSelection(Person[] personas) {
        // TODO: Implement selection sort by age
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (personas[j].getAge() < personas[min].getAge()) {
                    min = j;
                }
            }
            Person personasAux = personas[i];
            personas[i] = personas[min];
            personas[min] = personasAux;
        }
    }

    // Selection sort by height
    public void sortByHeightWithSelection(Person[] personas) {
        // TODO: Implement selection sort by height
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (personas[j].getHeight() < personas[min].getHeight()) {
                    min = j;
                }
            }
            Person personasAux = personas[i];
            personas[i] = personas[min];
            personas[min] = personasAux;
        }
    }

    // Insertion sort by age
    public void sortByAgeWithInsertion(Person[] personas) {
        // TODO: Implement insertion sort by age
        int n = personas.length;
        for (int i = 1; i < n; i++) {
            Person personasAux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getAge() > personasAux.getAge()) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
            personas[j + 1] = personasAux;
        }
    }

    // Insertion sort by height
    public void sortByHeightWithInsertion(Person[] personas) {
        // TODO: Implement insertion sort by height
        int n = personas.length;
        for (int i = 1; i < n; i++) {
            Person personasAux = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getHeight() > personasAux.getHeight()) {
                personas[j + 1] = personas[j];
                j = j - 1;
            }
            personas[j + 1] = personasAux;
        }
    }

    // Binary search by age
    public int searchBinaryByAge(Person[] people, int age) {
        // TODO: Implement binary search by age
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int mitad = left + (right - left) / 2;

            if (people[mitad].getAge() == age) {
                return mitad;
            }

            if (people[mitad].getAge() < age) {
                left = mitad + 1;
            }

            else {
                right = mitad - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Binary search by height
    public int searchBinaryByHeight(Person[] people, int height) {
        // TODO: Implement binary search by height
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            int mitad = left + (right - left) / 2;

            if (people[mitad].getHeight() == height) {
                return mitad;
            }

            if (people[mitad].getHeight() < height) {
                left = mitad + 1;
            }

            else {
                right = mitad - 1;
            }
        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Person[] persons) {
        // TODO: Implement showPeople
        for (Person person : persons) {
            System.out.println(persons);

        }
    }
}
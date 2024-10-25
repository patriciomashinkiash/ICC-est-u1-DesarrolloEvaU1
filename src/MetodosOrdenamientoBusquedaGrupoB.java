import models.Carro;
import models.Person;

/**
 * MetodosOrdenamientoBusqueda
 * 
 * Aqui programar los motodos de busqueda y ordenamiento
 * segun le tocaron en su enunciado de la evaluacion
 * 
 */
public class MetodosOrdenamientoBusquedaGrupoB {

    // Selection sort by year Asendentemente
    public void sortBYearWithBubbleAvnAsendente(Carro[] carro) {
        // TODO: Implement selection sort by age
        int n = carro.length;

        for (int i = 0; i < n - 1; i++) {
            boolean inter = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (carro[j].getYear() > carro[j + 1].getYear()) {
                    Carro temp = carro[j];
                    carro[j] = carro[j + 1];
                    carro[j + 1] = temp;
                }
            }

            if (!inter) {
                break;
            }
        }
    }

    // Selection sort by year Desendentemente
    public void sortBYearWithBubbleAvnDesendente(Carro[] carro) {
        // TODO: Implement selection sort by height

    }

    // Binary search by year
    public int searchBinaryByYear(Carro[] carro, int year) {
        // TODO: Implement binary search by height
        int left = 0;
        int right = carro.length - 1;

        while (left <= right) {
            int mitad = left + (right - left) / 2;

            if (carro[mitad].getYear() == year) {
                return mitad;
            }

            if (carro[mitad].getYear() < year) {
                left = mitad + 1;
            }

            else {
                right = mitad - 1;
            }

        }
        return -1; // Placeholder return value
    }

    // Metodo que imprime el listado de personas
    public void showPeople(Carro[] carros) {
        // TODO: Implement showPeople
        for (Carro carro : carros) {
            System.out.println(carros);

        }
    }
}
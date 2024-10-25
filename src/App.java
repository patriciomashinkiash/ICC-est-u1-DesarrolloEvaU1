
import models.Carro;
import models.CarrosGenerator;
import models.PersonasGenerator;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {

        MetodosOrdenamientoBusqueda mOB = new MetodosOrdenamientoBusqueda();
        Person[] personas = new PersonasGenerator().generarPersonas();

        for (Person person : personas) {
            System.out.println(person);
        }

        // SELECCION Y BUSQUEDA POR EDAD
        mOB.sortByAgeWithSelection(personas);
        // mOB.showPeople(personas);

        int result = mOB.searchBinaryByAge(personas, 33);

        if (result == -1) {
            System.out.println("\nNo se encontro a la persona con la edad de 33");
        } else {
            System.out.println("\nLa persona con la edad de 32 esta en la posicion: " + result);
        }

        // SELECCION Y BUSQUEDA POR ALTURA
        mOB.sortByHeightWithSelection(personas);
        // mOB.showPeople(personas);
        int result2 = mOB.searchBinaryByHeight(personas, 160);

        if (result2 == -1) {
            System.out.println("\nNo se encontró a la persona con la altura ingresada");
        } else {
            System.out.println("\nLa persona con la altura ingresada esta en la posicion: " + result2);
        }

        // INSERCION Y BUSQUEDA POR EDAD
        mOB.sortByAgeWithInsertion(personas);
        // mOB.showPeople(personas);

        int result3 = mOB.searchBinaryByAge(personas, 78);

        if (result3 == -1) {
            System.out.println("\nNo se encontró la persona con la edad de 18");
        } else {
            System.out.println("\nLa persona con la edad de 18 esta en la posicion: " + result3);
        }

        // INSERCION Y BUSQUEDA POR ALTURA
        mOB.sortByHeightWithInsertion(personas);
        // mOB.showPeople(personas);

        int result4 = mOB.searchBinaryByHeight(personas, 188);

        if (result4 == -1) {
            System.out.println("\nNo se encontró la persona con la altura ingresada");
        } else {
            System.out.println("\nLa persona con la altura ingresada esta en la posicion: " + result4);
        }

        MetodosOrdenamientoBusquedaGrupoB mOB2 = new MetodosOrdenamientoBusquedaGrupoB();
        Carro[] carros = new CarrosGenerator().generarCarros();

        /*
         * CarrosGenerator generator = new CarrosGenerator();
         * 
         * // Obtener el arreglo de 50 carros generadas aleatoriamente
         * Carro[] carros = generator.generarCarros();
         * 
         * System.out.println("Listado de carros generadas:");
         * for (Carro persona : carros) {
         * System.out.println(persona);
         * }
         */

        // BURBUJA AJUSTE Y BUSQUEDA POR AÑO -- ASENDENTE
        mOB2.sortBYearWithBubbleAvnAsendente(carros);

        int res = mOB2.searchBinaryByYear(carros, 2019);

        if (res == -1) {
            System.out.println("\nNo se encontro el carro con el año 2020");
        } else {
            System.out.println("\nSe encontro el carro con el año 2020 en la posicion:" + res);
        }
    }
}

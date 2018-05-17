
/**
 *
 * @author Anonymous
 */
public class Jam {

    //Definició de variables de la clase
    private String contents;
    private String date;
    private int capacity;
    private static int numTotalJars, noJam = 0;

    //Constructor únic que obté per parametres el String contents, String date i un integer Size
    Jam(String contents, String date, int size) {
        this.contents = contents;
        this.date = date;
        capacity = size;
        numTotalJars++;
    }

    /**
     *
     * @return retorna true en el cas de que la capacitat sigui 0, retorna false
     * en cas contrari
     */
    public boolean empty() {
        return (capacity == 0);
    }

    /**
     * Aquesta funció imprimeix per pantalla dels dades de la classe Jam
     */
    public void print() {
        System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
        System.out.println("El n�mero total de Jars creats des de l'inici dels temps s�n: " + Jam.getNumTotalJars());
        System.out.println("El n�mero de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
    }

    /**
     *
     * @param fluidOz variable que obté via paràmetres, és un integer amb la cantitat que hi ha a la jerra
     */
    public void spread(int fluidOz) {
        if (!empty()) {
            if (fluidOz < capacity) {
                System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
                capacity = capacity - fluidOz;
            } else {
                System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
                capacity = 0;
                noJam++;
            }
        } else {
            System.out.println("No jam in the Jar!");
        }
    }

    /**
     *
     * @return retorna el nombre total de jerres
     */
    public static int getNumTotalJars() {
        return numTotalJars;
    }

    /**
     *
     * @return retorna la variable noJam de tipus Integer
     */
    public static int getNoJam() {
        return noJam;
    }
}

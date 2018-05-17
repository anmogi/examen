
/**
 *
 * @author Anonymous
 */
public class Pantry {

    //Variables de la classe Pantry
    private Jam jar1;
    private Jam jar2;
    private Jam jar3;
    private Jam selected;

    //Constructor de la classe el qual obté per paràmetres 3 jerres i inicialitza selected amb valor null
    Pantry(Jam jar1, Jam jar2, Jam jar3) {
        this.jar1 = jar1;
        this.jar2 = jar2;
        this.jar3 = jar3;
        selected = null;
    }

    /**
     * Imprimeix per pantalla el métode print de la classe Jam
     */
    public void print() {
        System.out.print("1: ");
        jar1.print();
        System.out.print("2: ");
        jar2.print();
        System.out.print("3: ");
        jar3.print();
    }

    /**
     * Aquest métode rep per paràmetres quina és la jerra que volem seleccionar
     * i la selecciona
     *
     * @param jarNumber és la variable que conté el nombre de la jerra que volem
     * seleccionar
     */
    public void select(int jarNumber) {
        if (jarNumber == 1) {
            selected = jar1;
        } else if (jarNumber == 2) {
            selected = jar2;
        } else {
            selected = jar3;
        }
    }

    /**
     *
     * @param oz variable que rep per parametres i serà la jerra que montarà
     */
    public void spread(int oz) {
        selected.spread(oz);
    }
}

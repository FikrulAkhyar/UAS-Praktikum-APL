/***
 * Class FilmAvenger
 * implements interface FilmAction
 * 
 * @author Fikrul Akhyar
 * @version 1.3
 */

public class FilmAvenger implements FilmAction {

    /**
     * Override method action dari interface FilmAction
     */
    @Override
    public void action() {
        System.out.println("Film Action");
    }

    /**
     * Method toString
     * 
     * @return Avenger
     */
    public String toString() {
        return "Avenger";
    }
}

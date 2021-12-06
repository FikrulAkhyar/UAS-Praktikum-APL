/***
 * Class FilmIronMan
 * implements interface FilmAction
 * 
 * @author Fikrul Akhyar
 * @version 1.3
 */

public class FilmIronman implements FilmAction {

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
     * @return IronMan
     */
    public String toString() {
        return "IronMan";
    }
}

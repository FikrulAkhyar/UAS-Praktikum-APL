/***
 * Class FilmSpiderman
 * implements interface FilmAction
 * 
 * @author Fikrul Akhyar
 * @version 1.3
 */

public class FilmSpiderman implements FilmAction {

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
     * @return SpiderMan
     */
    public String toString() {
        return "SpiderMan";
    }
}

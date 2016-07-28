/**
 * Created by Greg on 7/27/2016.
 * modified to test git
 */


public interface Swears {
    String[] swears = {"fuck","shit","piss","motherfucker","goddamnit","FAAAACK"};
    String[] maleInsults = {"cocksucker","dickhead","faggot","asshole"};
    String[] femaleInsults = {"cunt","whore","daddylicker","tramp","slut"};

    String chooseRandomSwear();
    String chooseMaleInsult();
    String chooseFemaleInsult();

}

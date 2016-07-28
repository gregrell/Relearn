/**
 * Created by Greg on 7/24/2016.
 * Enumeration relearning
 */
public enum RelearnEnum {
    fuck("the F word"),
    shit("the S word"),
    piss("peeeeee"),
    cunt("awesome"),
    ass("asshole");

    private final String Description;

    /*Constructor*/
    RelearnEnum(String inDescription){
        Description =inDescription;
    }
    /*End Constructor*/

    /*method getDescription, returns the String Description*/
    public String getDescription(){
        return Description;
    }



}

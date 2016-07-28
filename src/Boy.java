/**
 * Created by Greg on 7/27/2016.
 */
public class Boy extends Human{
    public Boy(String inName, int inAge){
        super(inName,"Male",inAge);
    }

    @Override
    public void Speak(){
        System.out.println("I'm a dude");
    }




}

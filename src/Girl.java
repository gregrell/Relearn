/**
 * Created by Greg on 7/27/2016.
 */
public class Girl extends Human {
    public Girl(String inName, int inAge){
        super(inName,"Female",inAge);
    }

    @Override
    public void Speak(){
        System.out.println("I'm a girl");
    }
}

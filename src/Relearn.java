/**
 * Created by Greg on 7/23/2016.
 */
public class Relearn extends Lesson{
    String name;
    int hour;
    int minute;
    int second;
    private static int created;

    /*Constructors*/
    /*Mulitple constructor practice*/

    public Relearn(){
        this((String)"No Name",0,0,0);

    }

    public Relearn(String name){
        this(name,0,0,0);

    }

    public Relearn(String name,int h){
        this(name,h,0,0);
    }

    public Relearn(String name, int h, int m, int s){super("Relearn");
        this.name=name;
        hour=(h<24 ? h:0);
        minute=(m<60 ? m:0);
        second=(s<60 ? s:0);
        created++;

    }

    /*Constructors End*/

    public String GetName(){
        return name;
    }

    public int GetHour(){
        return hour;
    }

    public int GetMin(){
        return minute;
    }

    public int GetSecond(){
        return second;
    }

    public static int getObjNums(){
        return created;
    }



}

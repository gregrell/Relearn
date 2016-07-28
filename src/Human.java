/**
 * Created by Greg on 7/27/2016.
 */

import java.util.Random;

public abstract class Human implements Swears{
    public final String sex;
    public int age;
    public final String name;
    public Random rnd;


    public Human (String inName, String inSex, int inAge){
        this.age=inAge;
        this.name=inName;
        this.sex=inSex;
        this.rnd = new Random();

    }

    public abstract void Speak();

    public String toString(){
        return String.format(name+" aged:"+age);
    }

    public void swear(){
        System.out.println(name+" says \""+chooseRandomSwear()+"\"");
    }

    public void insult(Human inHuman){
        if (inHuman.isBoy()){
            System.out.println(this.name+" says \""+inHuman.name+" you're a "+chooseMaleInsult()+"\"");
        }
        else{
            System.out.println(this.name+" says \""+inHuman.name+" you're a "+chooseFemaleInsult()+"\"");
        }
    }

    public String chooseRandomSwear(){
        return swears[rnd.nextInt(swears.length-1)];
    }

    public String chooseMaleInsult() {
        return maleInsults[rnd.nextInt(maleInsults.length - 1)];
    }

    public String chooseFemaleInsult() {
        return femaleInsults[rnd.nextInt(femaleInsults.length - 1)];
    }

    public boolean isBoy(){
        return(this.sex=="Male");
    }

    public boolean isGirl(){
        return(this.sex=="Female");
    }
}



/**
 * Created by Greg on 7/23/2016.
 */

import View.ProgramFrame;
import View.WalkArea;

import java.awt.*;
import javax.swing.*;


public class RelearnMain {
    public static void main(String[] args){
        Human Dave = new Boy("Dave",25);
        Human Rachel = new Girl("Rachel",21);
        ProgramFrame Pf = new ProgramFrame();




        Dave.swear();
        Rachel.swear();

        Dave.insult(Rachel);
        Rachel.insult(Dave);

    }





}

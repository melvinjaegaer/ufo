import GLOOP.*;
public class Ufo{
    private GLTorus rumpf; 
    private GLKugel cockpit;
    private GLKegel fluegel1, fluegel2;
    //[...]

    public Ufo(){


        cockpit = new GLKugel(0,0,0,30);
        cockpit.setzeTextur("src/img/bob.jpg");


        //[...]
    }
 
    public void bewegeLinks(){
    cockpit.verschiebe(-30,0,0) ;}


    public void bewegeRechts(){
        cockpit.verschiebe(30,0,0) ;}
    public void bewegeHoch(){
        cockpit.verschiebe(0,30,0) ;}
    public void bewegeRunter(){
        cockpit.verschiebe(0,-30,0) ;}


    public void explodiere(){
        //[...]
    }

   public double GibX () {return cockpit.gibX();

    }
    public double GibY () {return cockpit.gibY();}
        public double GibZ () {return cockpit.gibZ();}
    }




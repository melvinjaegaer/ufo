import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel;
    //[...]
    private Ufo dasUfo;

    public Asteroid(double pX,double pY){
        kugel = new GLKugel(pX,1000,0, 50, "src/img/Krater.jpg");
        //[...]
    }

    public void bewegeDich() {
        kugel.verschiebe(0, 0, 100);
    }

    public double GibX () {return kugel.gibX();

    }
    public double GibY () {return kugel.gibY();}
    public double GibZ ()
    {return kugel.gibZ();}




public void Zurück(double pX,double pY,double pZ) {
    kugel.setzePosition(pX, pY, -1000);

}}




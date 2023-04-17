import GLOOP.*;
public class Asteroid{ 
    private GLKugel kugel;
    //[...]
    private Ufo dasUfo;

    public Asteroid(double pX,double pY,double pZ,Ufo pdasUfo){
        kugel = new GLKugel(pX,1000,0, 150, "src/img/Krater.jpg");
       dasUfo=pdasUfo;
    }

    public void bewegeDich() {
        kugel.verschiebe(0, 0, 500);
    }

    public double GibX () {return kugel.gibX();

    }
    public double GibY () {return kugel.gibY();}
    public double GibZ ()
    {return kugel.gibZ();}




public void Zurück(double pX,double pY,double pZ) {
    kugel.setzePosition(pX, pY, Math.random()*1000-15000);

}

    public boolean getroffen(){
        double distance = Math.sqrt(Math.pow( kugel.gibX()- dasUfo.GibX(), 2 ) + Math.pow( kugel.gibY()- dasUfo.GibY(), 2 ) + Math.pow( kugel.gibZ()- dasUfo.GibZ(), 2 ));

            if (distance < 200) return true;
            else return false;
        }
}




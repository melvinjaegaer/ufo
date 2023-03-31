import GLOOP.*; 
public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo dasUfo;
     Asteroid schteitene[];
     Asteroid Asteriod;

    public  Ufospiel(){
        kamera = new GLSchwenkkamera(800,600);  
        kamera.verschiebe(0,200,500);
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        dasUfo = new Ufo();

       schteitene = new Asteroid [100];
       for (int i=0;i<schteitene.length;i++){
           schteitene[i]=new Asteroid( 0,0);
       }
       for(int i=0;i < schteitene.length;i++){schteitene[i].Zurück(Math.random()*3000-1500,Math.random()*3000-1000,-10000);}


      // if(dasUfo.GibX() = Asteriod.GibX()){ Sys.beenden();}


        fuehreAus();
    }

    public void fuehreAus(){
        while(!tastatur.esc()){           

            if(tastatur.unten() && dasUfo.GibY()>-250){dasUfo.bewegeRunter();}
            if(tastatur.rechts() && dasUfo.GibX()<600){dasUfo.bewegeRechts();}
            if(tastatur.oben() && dasUfo.GibY()<400){dasUfo.bewegeHoch();}
            if(tastatur.links() && dasUfo.GibX()>-600){dasUfo.bewegeLinks();}

            for (int i=0;i<schteitene.length;i++){
                schteitene[i].bewegeDich();

            if (schteitene[i].GibZ() > 0) {
                schteitene[i].Zurück(Math.random()*3000-1500,Math.random()*3000-1000,-10000);
            }}


//dicks




            Sys.warte(50);
        }
        Sys.beenden(); 
    }
}

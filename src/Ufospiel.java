import GLOOP.*; 
public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo dasUfo;
     Asteroid[]  schteitene;
    //[...]

    public Ufospiel(){
        kamera = new GLSchwenkkamera(800,600);  
        kamera.verschiebe(0,200,500);
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        dasUfo = new Ufo();

       schteitene = new Asteroid [20];
       for (int i=0;i<schteitene.length;i++){
           schteitene[i]=new Asteroid(dasUfo, 0,0);
       }
       for(int i=0;i < schteitene.length;i++){schteitene[i].Zurück(Math.random()*1000-500,Math.random()*1000);}

        
        fuehreAus();
    }

    public void fuehreAus(){
        while(!tastatur.esc()){           

            if(tastatur.unten() && dasUfo.GibY()>-200){dasUfo.bewegeRunter();}
            if(tastatur.rechts() && dasUfo.GibX()<475){dasUfo.bewegeRechts();}
            if(tastatur.oben() && dasUfo.GibY()<200){dasUfo.bewegeHoch();}
            if(tastatur.links() && dasUfo.GibX()>-475){dasUfo.bewegeLinks();}

//dicks




            Sys.warte();
        }
        Sys.beenden(); 
    }
}

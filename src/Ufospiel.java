import GLOOP.*;

import java.util.concurrent.LinkedTransferQueue;

public class Ufospiel{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private GLHimmel himmel;

    private Ufo dasUfo;
     Asteroid schteitene[];
     Asteroid Asteriod;
     GLWuerfel screen ;
     int sekunden ;
GLTafel anzeige;

    public  Ufospiel(){
        kamera = new GLSchwenkkamera(800,600);  
        kamera.verschiebe(0,200,500);
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        himmel = new GLHimmel("src/img/Sterne.jpg");

        dasUfo = new Ufo();
       anzeige=new GLTafel(-400,700,0,500,50)
       ;anzeige.setzeAutodrehung(true);
       schteitene = new Asteroid [100];
       for (int i=0;i<schteitene.length;i++){
           schteitene[i]=new Asteroid( 0,0,Math.random()*1000-15000,dasUfo);
       }
       for(int i=0;i < schteitene.length;i++){schteitene[i].Zurück(Math.random()*100-1500,Math.random()*100-1000,-1000000000);}


      // if(dasUfo.GibX() = Asteriod.GibX()){ Sys.beenden();}


        fuehreAus();
    }
    public void loserscreen(){ screen=new GLWuerfel(0,0,-1500,2300);
        screen.setzeTextur("src/img/image.png");}
    public int timer(){  sekunden=sekunden+50;
        return sekunden;

    }
    public void updateAnzeige(){anzeige.setzeText("score : " + this.timer(),32);

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
                schteitene[i].Zurück(Math.random()*3000-1500,Math.random()*3000-1000,Math.random()*2000000);
            }if(schteitene[i].getroffen()){this.loserscreen(); Sys.warte(5000);
                Sys.beenden();} }



//dicks



this.updateAnzeige();
            Sys.warte(50);
        }
        Sys.beenden(); 
    }

}

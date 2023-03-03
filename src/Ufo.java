import GLOOP.*;
public class Ufo{
    private GLTorus rumpf; 
    private GLKugel cockpit;
    private GLKegel fluegel1, fluegel2;
    //[...]

    public Ufo(){
        rumpf = new GLTorus(0,0,0,50,20);
        rumpf.skaliere (0.5,1,0.5);
        rumpf.setzeQualitaet(24);

        cockpit = new GLKugel(0,0,0,25);
        cockpit.setzeMaterial(GLMaterial.GOLD);

        fluegel1 = new GLKegel(-60,-10,0,15,70);
        fluegel1.skaliere(0.2,1,1);        
        fluegel1.drehe(0,90,0, -60,10,0);
        fluegel1.drehe(0,0,45, 0,0,0);
        fluegel1.setzeFarbe(0,0,1);

        fluegel2 = new GLKegel(60,-10,0,15,70);
        fluegel2.skaliere(0.2,1,1);        
        fluegel2.drehe(0,-90,0, 60,10,0);
        fluegel2.drehe(0,0,-45, 0,0,0);
        fluegel2.setzeFarbe(0,0,1);  
        //[...]
    }
 
    public void bewegeLinks(){
        //[...]
    }

    public void bewegeRechts(){       
        //[...]       
    } 

    public void explodiere(){
        //[...]
    }

}

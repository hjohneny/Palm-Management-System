
package jdbc_test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.ImageIcon;

public class Palm {

    private int SpecimenID;
    private String common;
    private String genus;
    private String species;
    private String stem;
    private String leaf;
    private byte[] Photo;
    private String location;
    private String date;
    byte[] imgData = null ;
    
    public Palm(String location, String date, String genus, String species, String common)
        {
            this.location = location;
            this.date = date;
            this.genus = genus;
            this.species = species;
            this.common = common;
       }
   
       public String getLocation()
       {
           return location;
       }
       
       public String getDate()
       {
           return date;
       }
       
       public String getgenus()
       {
           return genus;
       }
       
       public String getspecies()
       {
           return species;
       }
       
       public String getcommon()
       {
           return common;
       }
    
    public Palm(int ID, String Common, String Genus, String Species, String Stem, String Leaf, byte[] photo){
    
        this.SpecimenID = ID;
        this.common = Common;
        this.genus = Genus;
        this.species = Species;
        this.stem = Stem;
        this.leaf = Leaf;
        this.Photo = photo;
       
    }
    
    
    public int getID(){
      return SpecimenID;
    }
    
    public void setID(int Id){
        this.SpecimenID = Id;
    }
    
    public String getName(){
        return common;
    }
    
    public void setName(String Common){
        this.common = Common;
    }
    
    public String getGenus(){
        return genus;
    }
    
    public void setGenus(String Genus){
        this.genus = Genus;
    }
    
    public String getSpecies(){
        return species;
    }
    
    public void setSpecies(String Species){
        this.species = Species;
    }
    
    public String getStem(){
        return stem;
    }
    
    public void setStem(String Stem){
        this.stem = Stem;
    }
    
    public String getLeaf(){
        return leaf;
    }
    
    public void setLeaf(String Leaf){
        this.leaf = Leaf;
    }
    
    public byte[] getMyPhoto(){ 
        return Photo;
    }
    
    public ImageIcon getImage(){
        return new ImageIcon(Photo);
    }
}

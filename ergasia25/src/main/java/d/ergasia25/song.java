/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d.ergasia25;

/**
 *
 * @author ppapa
 */
//klasi song pou periexe tin diefthinsi tou tragoudiou 
public class song {
boolean hasbeenplayed=false;
    public song(String path) {
        this.path = path;
    }
    
    String path;

    public String getPath() {
        return path;
    }
    boolean play(){
   this.hasbeenplayed=true;
   return hasbeenplayed;
}

    public boolean isHasbeenplayed() {
        return hasbeenplayed;
    }
    
}

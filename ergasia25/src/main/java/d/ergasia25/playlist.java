/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d.ergasia25;

/**
 *
 * @author ppapa
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author ppapa
 */




public class playlist {
    List<String> mp3;
    int next;   
    public playlist(File f){
        mp3=new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;   
            while ((line = br.readLine()) != null) {  //diavazei to arxeio m3u gia arxeia m3u
               addMP3(line);
            }
        } catch (IOException ex) {
            System.out.println("error is reading the file");
        }
        next=-1;
    }    

    private void addMP3(String line){
        if(line==null)return;    //elegxos gia ro arxeio pou psannoume
        if(!Character.isUpperCase(line.charAt(0)))return;
 
        if(line.indexOf(".mp3", line.length()-4)==-1)return;
        mp3.add(line); //prosthiki ton mp3 arxeion sto programma
    }
// ales voithitkes entoles
    public String getNext(){
        next++;
        if(mp3.size()<=next)next=0;
        return mp3.get(next);
    }
    public void display()
    {
        for(int i=0;i<mp3.size();i++)
        {
            System.out.println(mp3.get(i));
        }
    }
    public void randomize()
   {
        Collections.shuffle(mp3);
    }
    public ArrayList<String> returnplaylist()
    {
        return (ArrayList<String>) mp3;
    }
    public int megethos()
    {
        return mp3.size();
    }
    public String getloc(int i)
    {
        return mp3.get(i);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d.ergasia25;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author ppapa
 */
public class folderplaylist {
    String path;
ArrayList<String>  playlist= new ArrayList<String>();
    public folderplaylist(String path) {
        String teleftea;
        this.path = path;
        
        File patht=new File(path);
        File filelist[]= patht.listFiles();
        for(File file : filelist) {
          if (file.getName().length()> 4)  //vriskoume ta teleftea 4 grammata tis diefthinseis tou arxeiou oste na doume an exoume na knaoume me m3u i mp3
         {
          teleftea= file.getName().substring(file.getName().length() - 4);
          if(teleftea.equals(".mp3"))
          {
              this.playlist.add(file.getAbsolutePath());
          }
                                       } 
         
               }
    
}
        public void randomize()
   {
        Collections.shuffle(this.playlist);
    }
    public ArrayList<String> returnplaylist()
    {
        return (ArrayList<String>) this.playlist;
    }
  public int megethos()
    {
        return this.playlist.size();
    }
    public String getloc(int i)
    {
        return this.playlist.get(i);
    }
  public void display()
  {
      for(int i=0;i<playlist.size();i++)
      {
          System.out.println(playlist.get(i));
      }
  }
  public String getsong(int i)
    {
        return this.playlist.get(i);
    }
}
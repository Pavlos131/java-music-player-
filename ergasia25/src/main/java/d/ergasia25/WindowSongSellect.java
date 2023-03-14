/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d.ergasia25;

import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import java.awt.BorderLayout;
import static java.awt.BorderLayout.LINE_END;
import static java.awt.BorderLayout.LINE_START;
import static java.awt.BorderLayout.PAGE_START;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;





/**
 *
 * @author ppapa
 */
public class WindowSongSellect {
    public static String artist(String s) {
         String fileLocation = s;
String returnvalue;
        try {
        
        InputStream input = new FileInputStream(new File(fileLocation));
        ContentHandler handler = new DefaultHandler();
        Metadata metadata = new Metadata();
        Parser parser = new Mp3Parser();
        ParseContext parseCtx = new ParseContext();
        parser.parse(input, handler, metadata, parseCtx);
        input.close();

        // List all metadata
        String[] metadataNames = metadata.names();

        

        
        returnvalue =( metadata.get("xmpDM:artist")); //metadata gia tous 
    

        } catch (FileNotFoundException e) {
            returnvalue=" ";
        } catch (IOException e) {
        returnvalue=" ";
        } catch (SAXException e) {
        returnvalue=" ";
        } catch (TikaException e) {
        returnvalue=" ";
        }
        
    return returnvalue;
    }
       public static String type(String s) {
         String fileLocation = s;
String returnvalue;
        try {
        
        InputStream input = new FileInputStream(new File(fileLocation));
        ContentHandler handler = new DefaultHandler();
        Metadata metadata = new Metadata();
        Parser parser = new Mp3Parser();
        ParseContext parseCtx = new ParseContext();
        parser.parse(input, handler, metadata, parseCtx);
        input.close();

        // List all metadata
        String[] metadataNames = metadata.names();

       


        
        
        returnvalue =( metadata.get("xmpDM:genre")); //metadata gia to idos
    

        } catch (FileNotFoundException e) {
            returnvalue=" ";
        } catch (IOException e) {
        returnvalue=" ";
        } catch (SAXException e) {
        returnvalue=" ";
        } catch (TikaException e) {
        returnvalue=" ";
        }
        
    return returnvalue;
    }
     public static String name(String s) {
         String fileLocation = s;
String returnvalue;
        try {
        
        InputStream input = new FileInputStream(new File(fileLocation));
        ContentHandler handler = new DefaultHandler();
        Metadata metadata = new Metadata();
        Parser parser = new Mp3Parser();
        ParseContext parseCtx = new ParseContext();
        parser.parse(input, handler, metadata, parseCtx);
        input.close();

        // List all metadata
        String[] metadataNames = metadata.names();



                
        returnvalue =( metadata.get("title"));  //metadata gia ton titlo
    

        } catch (FileNotFoundException e) {
            returnvalue=" ";
        } catch (IOException e) {
        returnvalue=" ";
        } catch (SAXException e) {
        returnvalue=" ";
        } catch (TikaException e) {
        returnvalue=" ";
        }
        
    return returnvalue;
    }
    int asd=0;
    JFrame frame= new JFrame();  //dimiourgia frame kainourgiou parathirou koubion kai jlists
    JButton button = new JButton("Play Sellected");
    Player p;
    ArrayList<String> playlist;
    JLabel label1;
    JLabel label2;
    public WindowSongSellect(ArrayList<String> playlist,Player p,JLabel label1,JLabel label2) {
        this.p=p;
        this.playlist=playlist;
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1050,1050);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        String[] arr= new String[this.playlist.size()];
        for(int i=0;i<this.playlist.size();i++)
        {
            arr[i]="genre: "+type(this.playlist.get(i))+" title : "+name(this.playlist.get(i))+" artist: "+artist(this.playlist.get(i)); 
        } //gemisma tis jlist info me ta metadedomena
        JList<String> info = new JList<>(arr);
        JList<String> displayList = new JList<>(this.playlist.toArray(new String[0])); //dimiourgia listas me ta tragouia
               
    
     
		
		
		frame.setVisible(true);
		
    

       
frame.setVisible(true);

        frame.add(button,PAGE_START);
        
       frame.add(displayList);
      
        info.setBounds(00,10 ,400,1000);
        info.setVisible(true);
       
        button.setBounds(10, 10, 150, 150);
       displayList.setBounds(250,400,400,1000);
           JScrollPane pane = new JScrollPane(displayList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
          JScrollPane pane2 = new JScrollPane(info, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
          
               
  
           pane.setVisible(true);
               frame.add(pane,LINE_START);    
               frame.add(pane2,LINE_END);
      frame.setVisible(true);
                  
      
       
        
  
     
        
        this.label1=label1;
      this.label2=label2;
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String sellectedsong=displayList.getSelectedValue();
                try {
InputStream song = new FileInputStream(sellectedsong);    //pezei to epilegmeno tragoudi
label1.setText(p.getStatus().toString());
label2.setText(sellectedsong);
p.stop();

p.startPlaying(song);
}catch (FileNotFoundException e) {
    System.out.println(sellectedsong);
System.out.println (sellectedsong +" not found");
} catch (PlayerException e) {
System.err.println("Something's wrong with the player: " + e.getMessage());
} finally {
if (p != null)
asd=2;
}
}
            
           
    });
    
}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package d.ergasia25;
import java.util.Random;
import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import javax.swing.JFileChooser;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import gr.hua.dit.oop2.musicplayer.Player;
import static gr.hua.dit.oop2.musicplayer.Player.Status.IDLE;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import java.util.ArrayList;
import java.io.File;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author ppapa
 */
public class gui extends javax.swing.JFrame {
int asd;
    /**
     * Creates new form gui
     */
    Player p = PlayerFactory.getPlayer();
    public gui() {
        initComponents();
      this.Status.setText(this.p.getStatus().toString());
      this.songlabel.setText(" ");
    
    }
    ArrayList<String> Playlist= new ArrayList<String>();
    ArrayList<String>UnplayedSongs=new ArrayList<String>();

JList<String> List = new JList<>(this.Playlist.toArray(new String[0]));
int index;
String order;
String playlistadress;
String currentsong;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")  //kodikas sxetima me tin topothetisi ton koumpion etiketon ktlp pano sto frame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Play = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        m3uplalylistbutton = new javax.swing.JButton();
        folderplalylistbutton = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Pause = new javax.swing.JButton();
        Songsellect = new javax.swing.JButton();
        Resume = new javax.swing.JButton();
        songlabel = new javax.swing.JLabel();
        Randoom = new javax.swing.JButton();
        Default = new javax.swing.JButton();
        Repeat = new javax.swing.JButton();
        Stop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Play.setText("Play");
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayMouseClicked(evt);
            }
        });
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        Status.setText("Player Status");

        m3uplalylistbutton.setText("M3U plalylist import");
        m3uplalylistbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3uplalylistbuttonActionPerformed(evt);
            }
        });

        folderplalylistbutton.setText("Folder plalylist import");
        folderplalylistbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folderplalylistbuttonActionPerformed(evt);
            }
        });

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Pause.setText("Pause");
        Pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PauseActionPerformed(evt);
            }
        });

        Songsellect.setText("Song Sellect");
        Songsellect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SongsellectActionPerformed(evt);
            }
        });

        Resume.setText("Resume");
        Resume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumeActionPerformed(evt);
            }
        });

        songlabel.setText("Song");

        Randoom.setText("Randoom order");
        Randoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RandoomActionPerformed(evt);
            }
        });

        Default.setText("Default Order");
        Default.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DefaultActionPerformed(evt);
            }
        });

        Repeat.setText("Repeat");
        Repeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RepeatActionPerformed(evt);
            }
        });

        Stop.setText("Stop");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(songlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Resume, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(folderplalylistbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Songsellect, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Default, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Randoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Repeat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m3uplalylistbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Songsellect, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Default, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Randoom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(m3uplalylistbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(folderplalylistbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resume, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Status)
                    .addComponent(songlabel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        
    }//GEN-LAST:event_PlayActionPerformed

    private void folderplalylistbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folderplalylistbuttonActionPerformed
          if(evt.getSource()==this.folderplalylistbutton)
        {
            
            JFileChooser filechooser= new JFileChooser();
            filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int response =filechooser.showOpenDialog(null);
            
            if(response == JFileChooser.APPROVE_OPTION)
             {
                 
                 
                 this.playlistadress=new String(filechooser.getSelectedFile().getAbsolutePath());
                        System.out.println(playlistadress);
                        playlistclear();
                        setplaylist();
                    }
        }
    }//GEN-LAST:event_folderplalylistbuttonActionPerformed

    private void PlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseClicked
       if(evt.getSource()==this.Play)
       {
           try{
           this.p.stop();
          try {
InputStream song = new FileInputStream(this.currentsong);
this.UnplayedSongs.remove(this.currentsong);
this.songlabel.setText(this.currentsong);
p.startPlaying(song);

this.Status.setText(this.p.getStatus().toString());   //edoli play 
}catch (FileNotFoundException e) {
System.out.println("File " +this.currentsong+" not found");
this.UnplayedSongs.remove(this.currentsong);
} catch (PlayerException e) {
System.err.println("Something's wrong with the player: " + e.getMessage());
} finally {
if (p != null)
asd=25;
        
}
       
       }catch(NullPointerException e)
               {
               System.out.println("den exei ginei import playlist");
               }
       }     
    }//GEN-LAST:event_PlayMouseClicked

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        if(evt.getSource()==this.Next)
        {                                               //edoli next pou pezei to epomeno tragoudi analoga me tin seira
            try{
            if(this.order.equals("default"))    
            {
            try{
            if(this.index<=this.Playlist.size())
            {
                
                this.currentsong=Playlist.get(index+1);
                
                p.stop();
                   try {
InputStream song = new FileInputStream(this.currentsong);
this.songlabel.setText(this.currentsong);  
this.UnplayedSongs.remove(this.currentsong);
index++;
p.startPlaying(song);

this.Status.setText(this.p.getStatus().toString());
}catch (FileNotFoundException e) {
System.out.println("File " +this.currentsong+" not found");
this.UnplayedSongs.remove(this.currentsong);
} catch (PlayerException e) {
System.err.println("Something's wrong with the player: " + e.getMessage());
} finally {
if (p != null)
asd=25;
}
            }
            }
            catch(Exception e)
            {
                System.out.println("den iparxoun ala tragoudia");
            }
        }else if(this.order.equals("randoom"))
        {
              try{
           
        {
int min=0;

    Random generator = new Random();
   int randomNum = ThreadLocalRandom.current().nextInt(min, this.UnplayedSongs.size());
        int randomIndex = generator.nextInt(this.UnplayedSongs.size());
        
            if(!this.UnplayedSongs.isEmpty())
            {
                
                this.p.stop();
          try {
              
InputStream s = new FileInputStream(this.UnplayedSongs.get(randomNum));
this.songlabel.setText(this.UnplayedSongs.get(randomNum));
this.currentsong=this.UnplayedSongs.get(randomNum);
this.UnplayedSongs.remove(this.UnplayedSongs.get(randomNum));

p.startPlaying(s);

this.Status.setText(this.p.getStatus().toString());
}catch (FileNotFoundException e) {
System.err.println("File  not found");
this.UnplayedSongs.remove(this.UnplayedSongs.get(randomNum));
} catch (PlayerException e) {
System.err.println("Something's wrong with the player: " + e.getMessage());
} finally {
if (p != null)
asd=25;
        
}
            }
        }
         }catch(Exception e )
                    {
                      if(this.UnplayedSongs.size()==0)
                      {
                   System.out.println("den ipatxoun tragoudia pou na min exoun peksei");
                      }
                     
                    }

        }else{
                       try{
           this.p.stop();
          try {
InputStream song = new FileInputStream(this.currentsong);

this.songlabel.setText(this.currentsong);
p.startPlaying(song);

this.Status.setText(this.p.getStatus().toString());
}catch (FileNotFoundException e) {
System.out.println("File " +this.currentsong+" not found");
} catch (PlayerException e) {
System.err.println("Something's wrong with the player: " + e.getMessage());
} finally {
if (p != null)
asd=25;
        
}
       
       }catch(NullPointerException e)
               {
               System.out.println("den exei ginei import playlist");
               }
       }  
            
        
    
    
            }catch(java.lang.NullPointerException e)
            { 
            if(this.order==null)
            {
                System.out.println("den exei ginei epilogi siras");
            }
           
            if(this.playlistadress==null)
                    {
                        System.out.println("den exei ginei import playlist");
                    }
        }
        }
    
    }//GEN-LAST:event_NextActionPerformed

    private void PauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PauseActionPerformed
        if(evt.getSource()==this.Pause)
        {                                                      //edoli pause
            this.p.pause();
            this.songlabel.setText(" ");
            this.Status.setText(this.p.getStatus().toString());
            System.out.println("song paused");
        }
    }//GEN-LAST:event_PauseActionPerformed
  
    private void m3uplalylistbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3uplalylistbuttonActionPerformed
        String teleftea = "";  
        if(evt.getSource()==this.m3uplalylistbutton)    
        {                                                                    //edoli gia import playlist tipou m3u
            
            JFileChooser filechooser= new JFileChooser();
            int response =filechooser.showOpenDialog(null);
            if(response== JFileChooser.APPROVE_OPTION)
             { this.playlistadress=new String(filechooser.getSelectedFile().getAbsolutePath());
             if (this.playlistadress.length() > 4) {
    teleftea = this.playlistadress.substring(this.playlistadress.length() - 4);
} else {
    teleftea = this.playlistadress;
}
             if(teleftea.equals(".m3u"))
             {
                        System.out.println(playlistadress);
                        this.playlistadress=playlistadress;
                        playlistclear();
                        setplaylist();
                    }
             else
            {
               System.out.println("to arxeio den einai m3u \n");
            }
        }
        }
    }//GEN-LAST:event_m3uplalylistbuttonActionPerformed

    private void ResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumeActionPerformed
        this.p.resume();
        this.songlabel.setText(this.currentsong);
        this.Status.setText(this.p.getStatus().toString());
        System.out.println("song resumed");
    }//GEN-LAST:event_ResumeActionPerformed

    private void SongsellectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SongsellectActionPerformed
        if(evt.getSource()==this.Songsellect)
        {
                                                               // edoli gia tin epilogi tragoudiou
            WindowSongSellect window=new WindowSongSellect(this.Playlist,this.p,this.Status,this.songlabel);
            
        }
    }//GEN-LAST:event_SongsellectActionPerformed

    private void DefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DefaultActionPerformed
        if(evt.getSource()==Default)
        {                                               
            this.order="default";
        }
    }//GEN-LAST:event_DefaultActionPerformed

    private void RandoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RandoomActionPerformed
if(evt.getSource()==Randoom)
        {                                  
            this.order="randoom";
        }    }//GEN-LAST:event_RandoomActionPerformed

    private void RepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RepeatActionPerformed
       if(evt.getSource()==Repeat)
        {
            this.order="repeat";
        }
    }//GEN-LAST:event_RepeatActionPerformed

    private void StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopActionPerformed
        if(evt.getSource()==Stop)
        {
            this.p.stop();
            this.songlabel.setText(" ");
            this.Status.setText(this.p.getStatus().toString());
            System.out.println("song stopped");

        }
    }//GEN-LAST:event_StopActionPerformed
   public void setplaylist()
  {
      this.UnplayedSongs.clear();
      
      this.p.stop();                                       //edoli gia ton orismo tis neas playlist 
      
      this.index=0;
String teleftea = "";  

if (this.playlistadress.length() > 4) {
    teleftea = this.playlistadress.substring(this.playlistadress.length() - 4);
} else {
    teleftea = this.playlistadress;
}
if(teleftea.equals(".m3u"))
{  File f = new File(this.playlistadress);
    playlist pl= new playlist(f);
    for(int i=0;i<pl.megethos();i++)
 {
     this.Playlist.add(pl.getloc(i));
 }
}else{
 folderplaylist pl=new folderplaylist(this.playlistadress);  
 for(int i=0;i<pl.megethos();i++)
 {
     this.Playlist.add(pl.getsong(i));
 }
}
this.currentsong=Playlist.get(0);
for(int i=0;i<this.Playlist.size();i++)
{
    this.UnplayedSongs.add(Playlist.get(i));
}
   }
   
   
   
   
    void playlistclear(){
        this.Playlist.clear();
    
    
    }
        

        
        
        
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Default;
    private javax.swing.JButton Next;
    private javax.swing.JButton Pause;
    private javax.swing.JButton Play;
    private javax.swing.JButton Randoom;
    private javax.swing.JButton Repeat;
    private javax.swing.JButton Resume;
    private javax.swing.JButton Songsellect;
    private javax.swing.JLabel Status;
    private javax.swing.JButton Stop;
    private javax.swing.JButton folderplalylistbutton;
    private javax.swing.JButton m3uplalylistbutton;
    private javax.swing.JLabel songlabel;
    // End of variables declaration//GEN-END:variables
}

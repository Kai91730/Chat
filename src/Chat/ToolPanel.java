/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import java.awt.*;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author U$ER
 */
class ToolPanel extends JPanel //上方工具列
{
    Window parent;
    
    String chatData = "";
    ToolPanel(Window p)
    {
        super();
        parent = p;
        this.setLayout(new FlowLayout()); //內部Layout
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(0, 30));
        JButton loadChat = new JButton("歷史紀錄");
        this.add(loadChat,FlowLayout.LEFT);;
        
        loadChat.addActionListener (new ActionListener()  
        { 
            public void actionPerformed (ActionEvent e) 
            {             
                try 
                {
                    chatData = p.db.GetData();
                    if (chatData.length()>0) //只擷取有內容的歷史紀錄
                        if(p.curpage==1)
                            p.chatbox.append(chatData);
                        else if (p.curpage==2)  //*
                            p.chatbox2.append(chatData);
                } 
                catch (Exception ex) 
                {
                    System.out.println("something is wrong in ToolPanel.java or Database.java / mySQL is offline"); 
                }
            }
        });
        
    }
    
    
}

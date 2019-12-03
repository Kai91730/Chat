/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*; 
import java.text.SimpleDateFormat;
import java.sql.*; 


/**
 *
 * @author U$ER
 */
class BottomPanel extends JPanel //下方輸入列
{
    Window parent;
    
    
    
    BottomPanel(Window p) 
    {
        super();
        parent=p;
        
    
        this.setBackground(Color.GRAY);
        this.setPreferredSize(new Dimension(0, 60));     
        JButton sendBtn = new JButton("Enter"); 
        this.add(sendBtn);
        
        sendBtn.addActionListener (new ActionListener()  //送出按鈕事件
        { 
            public void actionPerformed (ActionEvent e) 
            {
                if (p.typebox.getText().length()>0) //訊息不為空
                {
                    SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");  //hh:mm:ss >12小時制 HH:mm:ss>24小時制
                    java.util.Date date = new java.util.Date(); //使用java.util.Date (和 java.sql.Date衝突)
                    String strDate = sdFormat.format(date); //格式化系統時間，放按鈕事件裡面才會更新時間
                    
                    if(p.curpage==1)
                    {
                        p.chatbox.append(p.idbox.getText() + " (" + strDate );
                        p.chatbox.append(")\n      " + p.typebox.getText() + "\n"); //在句尾增加文字
                    }
                    else if (p.curpage==2) //*
                    {
                        p.chatbox2.append(p.idbox.getText() + " (" + strDate );
                        p.chatbox2.append(")\n      " + p.typebox.getText() + "\n"); //在句尾增加文字
                    }
                    
                    try
                    {
                        p.db.SendData(strDate, p.idbox.getText(),p.typebox.getText());
                    }
                    catch (Exception sqle)
                    {
                        System.out.println("something is wrong in BottomPanel.java or Database.java / mySQL is offline"); 
                    }
                }
                
                
            }          
        });
        
    } 
}

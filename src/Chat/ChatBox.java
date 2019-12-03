/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import javax.swing.*;
import java.awt.*;


/**
 *
 * @author U$ER
 */
enum PageStatus{inactivated,activated} //分頁狀態

class ChatBox extends JTextArea 
{
    Window parent;
    PageStatus Status;
    
    
    ChatBox (Window p,Color color)
    {
        super();
        parent=p;
        this.setText("Chat here! \n");    
        this.setLineWrap(true); //自動換行
        this.setEditable(false);  //不可編輯
        this.setVisible(true);

        
        if (Status == PageStatus.activated)
        {
            if (p.curpage==1)
                p.txpanel.add(new JScrollPane(p.chatbox),BorderLayout.CENTER);
            else if (p.curpage==2) 
                p.txpanel.add(new JScrollPane(p.chatbox2),BorderLayout.CENTER);
            p.txpanel.revalidate();
        }
        else if (Status == PageStatus.inactivated)
        {
            p.txpanel.removeAll();
            
        }
    }
   

}

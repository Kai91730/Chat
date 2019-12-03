/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
/**
 *
 * @author U$ER
 */
class LeftlistPanel extends JPanel //左側分頁列
{
    Window parent;
    //Vector<ChatBox> pages2 = new Vector<ChatBox>(10); //Chatbox型態的Vector

    LeftlistPanel(Window p)
    {
        super();
        parent=p;
        
        
        this.setBackground(Color.LIGHT_GRAY);
       // this.setPreferredSize(new Dimension(50, 0)); //左Panel初始寬度
        //this.setLayout(null); //null才能改變按鈕大小但還是算了 
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));//Box Layout的Y_AXIS為縱向
        
        JButton pageButton = new JButton("1");
        JButton pageButton2 = new JButton("2");
        this.add(pageButton);
        this.add(pageButton2); 
        
        
        pageButton.addActionListener (new ActionListener()  
        { 
            public void actionPerformed (ActionEvent e) 
            {             
                p.curpage=1;
//                p.chatbox2.Status = PageStatus.inactivated;
//                p.chatbox.Status = PageStatus.activated;
                p.txpanel.removeAll();
                p.txpanel.add(new JScrollPane(p.chatbox),BorderLayout.CENTER);
                p.txpanel.revalidate();
            }
        });
        
        pageButton2.addActionListener (new ActionListener()  
        { 
            public void actionPerformed (ActionEvent e) 
            {             
                p.curpage=2;
//                p.chatbox.Status = PageStatus.inactivated;
//                p.chatbox2.Status = PageStatus.activated;
                p.txpanel.removeAll();
                p.txpanel.add(new JScrollPane(p.chatbox2),BorderLayout.CENTER);
                p.txpanel.revalidate();

            }
        });
        
 
    }
}

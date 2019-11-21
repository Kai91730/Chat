/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package window;

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
    
    
    ChatBox (Window p)
    {
        super();
        parent=p;
        
        
        Status = PageStatus.activated;
        this.setBackground(Color.WHITE);
        this.setText("Chat here! \n");
        this.setEditable(false);  //不可編輯
        //this.revalidate();
    }
   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chat;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author U$ER
 */
class TextPanel extends JPanel
{
    Window parent;
    
    TextPanel(Window p)
    {
        super();
        parent = p;
        this.setLayout(new BorderLayout());
    }
}

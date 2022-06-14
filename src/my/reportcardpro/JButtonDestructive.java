/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.reportcardpro;

import javax.swing.JButton;
import java.awt.Component;
import java.awt.event.ActionListener;


/**
 *
 * @author watet3953
 */
public class JButtonDestructive extends JButton implements ActionListener {
    
    public JButtonDestructive() {
        this.addActionListener(this); // this is ABSURDLY sketchy, but it's the only way i could think of making a button run it's own action
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        Component parent = this.getParent();
        Component grandParent = parent.getParent();
        parent.getParent().remove(parent);
        grandParent.revalidate();
        grandParent.repaint();
        
    }
}

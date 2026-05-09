import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaFenetre extends JFrame implements ActionListener{
    private JRadioButton radio1,radio2,radio3;
    private JButton etat;
    public MaFenetre(){
        setSize(500,500);
        Container contenu=getContentPane();
        contenu.setLayout(new FlowLayout());
        ButtonGroup group=new ButtonGroup();

        radio1=new JRadioButton("r1",true);
        group.add(radio1);
        contenu.add(radio1);
        radio1.addActionListener(this);

        radio2=new JRadioButton("r2");
        group.add(radio2);
        contenu.add(radio2);
        radio2.addActionListener(this);

        radio3=new JRadioButton("r3");
        group.add(radio3);
        contenu.add(radio3);
        radio3.addActionListener(this);

        etat=new JButton("Etat");
        contenu.add(etat);
        etat.addActionListener(this);

    }
    public void actionPerformed(ActionEvent ev){
        Object source=ev.getSource();
        if(source==radio1)
            System.out.println("radio1");
        if(source==radio2)
            System.out.println("radio2");
        if(source==radio3)
            System.out.println("radio3");
        if(source==etat)
            System.out.println("letat: "+radio1.isSelected()+" "+radio2.isSelected()+" "+radio3.isSelected());
    }
}
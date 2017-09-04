package io.github.lucasduete.testeSwing.visao;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class Janela_teste extends JFrame {
    
    public Janela_teste(String titulo){
        super(titulo);
        
        inicializarComponentes();
    }
    
    private void inicializarComponentes() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);

        Container container = getContentPane();

        //container.setLayout(new BorderLayout());
        //container.setLayout(new FlowLayout(FlowLayout.CENTER));
        container.setLayout(new GridLayout(2, 3));

        addButtons(container);

        setVisible(true);
    }

    private void addButtons(Container container) {
        JButton bt1 = new JButton("1");
        //container.add(bt1, BorderLayout.NORTH);
        container.add(bt1);

        JButton bt2 = new JButton("2");
        //container.add(bt2, BorderLayout.SOUTH);
        container.add(bt2);

        JButton bt3 = new JButton("3");
        //container.add(bt3, BorderLayout.EAST);
        container.add(bt3);

        JButton bt4 = new JButton("4");
        //container.add(bt4, BorderLayout.WEST);
        container.add(bt4);

        JButton bt5 = new JButton("5");
        //container.add(bt5, BorderLayout.CENTER);
        container.add(bt5);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.lucasduete.testeSwing.visao;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author IFPB
 */
public class Janela extends JFrame {
    
    public Janela(String titulo){
        super(titulo);
        
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        
        ImageIcon icone = new ImageIcon("imagens/icone.png");
        setIconImage(icone.getImage());
        
        Container container = getContentPane();
        container.setBackground(Color.WHITE);
        
        container.setLayout(null);
        
        addLabels(container);
        addTextFields(container);
        addRadioButtons(container);
        
        setVisible(true);
    }
    
    private void addLabels(Container container) {
        
        //JLabel labelTitulo = new JLabel("Cadastro de Funcionário");
        JLabel labelTitulo = new JLabel();
        labelTitulo.setText("Cadastro De Funcionário");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        labelTitulo.setForeground(Color.red);
        //labelTitulo.setb
        labelTitulo.setBounds(80, 5, 300, 30);
        
        container.add(labelTitulo);        
        
        JLabel labelCPF = new JLabel();
        labelCPF.setText("CPF");
        labelCPF.setFont(new Font("Arial", Font.BOLD, 14));
        labelCPF.setBounds(15, 20, 60, 100);
        
        container.add(labelCPF);    
        
        JLabel labelNome= new JLabel("Nome");
        labelNome.setFont(new Font("Arial", Font.BOLD, 14));
        labelNome.setBounds(15, 50 , 60, 100);
        
        container.add(labelNome);
        
        JLabel labelSexo = new JLabel("Sexo");
        labelSexo.setFont(new Font("Arial", Font.BOLD, 14));
        labelSexo.setBounds(15, 80 , 60, 100);
        
        container.add(labelSexo);
        
        JLabel labelEndereco = new JLabel("Endereço");
        labelEndereco.setFont(new Font("Arial", Font.BOLD, 14));
        labelEndereco.setBounds(15, 110, 80, 100);
        
        container.add(labelEndereco);
        
        JLabel labelCargo = new JLabel("Cargo");
        labelCargo.setFont(new Font("Arial", Font.BOLD, 14));
        labelCargo.setBounds(15, 140, 60, 100);
        
        container.add(labelCargo);
        
    }
    
    private void addTextFields(Container container) {
        JTextField tfCPF = new JTextField(14);
        tfCPF.setFont(new Font("Arial", Font.BOLD, 14));
        tfCPF.setForeground(Color.red);
        tfCPF.setBackground(new Color(255,255,255));
        tfCPF.setBounds(75, 60,  108, 20);
        
        container.add(tfCPF);
        
        JTextField tfNome = new JTextField(100);
        tfNome.setBounds(75, 90, 200, 20);
        tfNome.setFont(new Font("Arial", Font.BOLD, 14));
        
        container.add(tfNome);
        
        JTextField tfEndereco = new JTextField(200);
        tfEndereco.setBounds(95, 150, 200, 20);
        tfEndereco.setFont(new Font("Arial", Font.BOLD, 14));
        
        container.add(tfEndereco);
    }
    
    private void addRadioButtons(Container container){
        
        ButtonGroup grupo = new ButtonGroup();
        
        JRadioButton masculino = new JRadioButton("Masculino");
        masculino.setBounds(80, 120, 100, 20);
        masculino.setFont(new Font("Arial", Font.BOLD, 14));
        masculino.setBackground(Color.WHITE);
        grupo.add(masculino);
        container.add(masculino);
        
        JRadioButton feminino = new JRadioButton("Feminino");
        feminino.setBounds(180, 120, 100, 20);
        feminino.setFont(new Font("Arial", Font.BOLD, 14));
        feminino.setBackground(Color.WHITE);
        grupo.add(feminino);
        container.add(feminino);
        
    }
    
}

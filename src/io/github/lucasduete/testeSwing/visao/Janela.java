package io.github.lucasduete.testeSwing.visao;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Janela extends JFrame {
    
    public Janela(String titulo){
        super(titulo);
        
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        setSize(400, 300);
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
        addComboBox(container);
        addButtons(container);

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

    private void addComboBox(Container container) {

        String tipo[] = {"Assalariado", "Comissionado", "Horista"};

        JComboBox cargo = new JComboBox(tipo);

        cargo.setBounds(95, 180, 250, 20);
        container.add(cargo);

    }

    private void addButtons(Container container) {
        JButton btOk = new JButton("OK");
        btOk.setBounds(30, 220, 100, 20);
        btOk.addActionListener(new Ouvinte());
        container.add(btOk);

        JButton btLimpar = new JButton("Limpar");
        btLimpar.setBounds(150, 220, 100, 20);
        container.add(btLimpar);

        JButton btFechar = new JButton("Fechar");
        btFechar.setBounds(270, 220, 100, 20);
        btFechar.addActionListener((e) -> {
            System.exit(0);
        });

        container.add(btFechar);
    }

    public class Ouvinte implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.print("Ok");
        }
    }
    
}

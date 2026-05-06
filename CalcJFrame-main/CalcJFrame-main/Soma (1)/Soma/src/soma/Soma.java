package soma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Soma extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, raiz;

    public Soma() {
        super("Calculadora Básica");
        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        raiz = new JButton("Raiz Quad.");

        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        texto1.setBounds(150, 20, 180, 20);
        texto2.setBounds(150, 60, 180, 20);

        somar.setBounds(50, 100, 100, 25);
        subtrair.setBounds(160, 100, 100, 25);
        multiplicar.setBounds(50, 135, 100, 25);
        raiz.setBounds(160, 135, 100, 25);

        exibir.setBounds(50, 175, 300, 20);

        // Ação: Somar
        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
                int resultado = numero1 + numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da soma: " + resultado);
            }
        });

        
        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
                int resultado = numero1 - numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da subtração: " + resultado);
            }
        });

        // Ação da Multiplicao
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                int numero2 = Integer.parseInt(texto2.getText());
                int resultado = numero1 * numero2;
                exibir.setVisible(true);
                exibir.setText("Resultado da multiplicação: " + resultado);
            }
        });

        // Ação da Raiz Quadrada 
        raiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero1 = Integer.parseInt(texto1.getText());
                double resultado = Math.sqrt(numero1);
                exibir.setVisible(true);
                exibir.setText("Raiz quadrada de " + numero1 + ": " + resultado);
            }
        });

        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(raiz);
        tela.add(exibir);

        setSize(400, 250);
        setVisible(true);
    }
}
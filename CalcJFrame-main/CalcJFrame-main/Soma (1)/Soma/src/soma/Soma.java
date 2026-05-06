package soma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Soma extends JFrame {
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicar, dividir, raiz;

    public Soma() {
        super("Calculadora Básica");
        Container tela = getContentPane();
        setLayout(null);

        rotulo1 = new JLabel("1º Número: ");
        rotulo2 = new JLabel("2º Número: ");
        exibir = new JLabel("");
        exibir.setFont(new Font("Arial", Font.BOLD, 14));

        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto1.setBackground(new Color(230, 230, 250)); 
        texto2.setBackground(new Color(230, 230, 250));
        texto1.setForeground(Color.BLACK);
        texto2.setForeground(Color.BLACK);

        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        raiz = new JButton("Raiz Quad.");

        somar.setBackground(new Color(135, 206, 250));     
        subtrair.setBackground(new Color(255, 182, 193));    
        multiplicar.setBackground(new Color(144, 238, 144)); 
        dividir.setBackground(new Color(236, 156, 204));
        raiz.setBackground(new Color(255, 255, 102));        

        somar.setForeground(Color.BLACK);
        subtrair.setForeground(Color.BLACK);
        multiplicar.setForeground(Color.BLACK);
        dividir.setForeground(Color.BLACK);
        raiz.setForeground(Color.BLACK);

        somar.setFont(new Font("Arial", Font.BOLD, 12));
        subtrair.setFont(new Font("Arial", Font.BOLD, 12));
        multiplicar.setFont(new Font("Arial", Font.BOLD, 12));
        dividir.setFont(new Font("Arial", Font.BOLD, 12));
        raiz.setFont(new Font("Arial", Font.BOLD, 12));

        rotulo1.setBounds(50, 20, 100, 20);
        rotulo2.setBounds(50, 60, 100, 20);
        texto1.setBounds(150, 20, 180, 20);
        texto2.setBounds(150, 60, 180, 20);

        somar.setBounds(80, 100, 100, 25);
        subtrair.setBounds(200, 100, 100, 25);
        multiplicar.setBounds(80, 135, 100, 25);
        dividir.setBounds(200, 135, 100, 25);
        raiz.setBounds(140, 170, 120, 25);     

        exibir.setBounds(50, 210, 300, 25);

        somar.addActionListener(e -> {
            int numero1 = Integer.parseInt(texto1.getText());
            int numero2 = Integer.parseInt(texto2.getText());
            int resultado = numero1 + numero2;
            exibir.setVisible(true);
            exibir.setText("Resultado da soma: " + resultado);
        });

        subtrair.addActionListener(e -> {
            int numero1 = Integer.parseInt(texto1.getText());
            int numero2 = Integer.parseInt(texto2.getText());
            int resultado = numero1 - numero2;
            exibir.setVisible(true);
            exibir.setText("Resultado da subtração: " + resultado);
        });

        multiplicar.addActionListener(e -> {
            int numero1 = Integer.parseInt(texto1.getText());
            int numero2 = Integer.parseInt(texto2.getText());
            int resultado = numero1 * numero2;
            exibir.setVisible(true);
            exibir.setText("Resultado da multiplicação: " + resultado);
        });

        dividir.addActionListener(e -> {
            int numero1 = Integer.parseInt(texto1.getText());
            int numero2 = Integer.parseInt(texto2.getText());
            if (numero2 == 0) {
                exibir.setText("Erro: divisão por zero!");
            } else {
                double resultado = (double) numero1 / numero2;
                exibir.setText("Resultado da divisão: " + resultado);
            }
            exibir.setVisible(true);
        });

        raiz.addActionListener(e -> {
            int numero1 = Integer.parseInt(texto1.getText());
            if (numero1 < 0) {
                exibir.setText("Erro: raiz quadrada de número negativo!");
            } else {
                double resultado = Math.sqrt(numero1);
                exibir.setText("Raiz quadrada de " + numero1 + ": " + resultado);
            }
            exibir.setVisible(true);
        });

        exibir.setVisible(false);

        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(raiz);
        tela.add(exibir);

        tela.setBackground(new Color(245, 245, 245)); 

        setSize(400, 300);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Soma();
    }
}
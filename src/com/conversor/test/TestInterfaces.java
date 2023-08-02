package com.conversor.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestInterfaces extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public TestInterfaces() {
        // Configurar la ventana principal
        setTitle("Ventana Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el panel con CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Agregar diferentes interfaces como paneles al cardPanel
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("Interfaz 1"));
        cardPanel.add(panel1, "panel1");

        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("Interfaz 2"));
        cardPanel.add(panel2, "panel2");

        // Agregar el cardPanel a la ventana principal
        add(cardPanel);

        // Agregar un botón para cambiar de interfaz
        JButton btnCambiar = new JButton("Cambiar Interfaz");
        btnCambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cambiar al siguiente panel en el CardLayout
                cardLayout.next(cardPanel);
            }
        });

        // Agregar el botón a la ventana principal
        add(btnCambiar, BorderLayout.SOUTH);

        // Mostrar la ventana principal
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TestInterfaces();
            }
        });
    }
}

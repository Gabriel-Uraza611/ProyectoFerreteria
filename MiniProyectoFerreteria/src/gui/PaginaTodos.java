package gui;
import java.awt.Label;
import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BoxLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import gui.Product;

public class PaginaTodos extends JPanel {

    private JPanel bg;

    public PaginaTodos() {
        bg = new JPanel();
        bg.setBackground(new java.awt.Color(255, 254, 196));

        for (Product product : Product.products) {
            JLabel label = new JLabel(product.getName() + "/ :  " +
                                       product.getDescript() + "/ : $" +
                                       product.getPrice() + "/STOCK :" +
                                       product.getAmount());

            bg.add(label);
        }

        bg.setLayout(new GridLayout(3, 1));

        setLayout(new BorderLayout());

        add(new JScrollPane(bg), BorderLayout.CENTER);
    }
}



import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class App  extends JFrame
{   
    //!Declaracion de Objetos
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgotados;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonEstadisticas;
    private javax.swing.JButton botonStock;
    private javax.swing.JButton botonTodos;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel labelLuigy;
    private javax.swing.JLabel labelMario;
    private javax.swing.JLabel labelStar1;
    private javax.swing.JLabel labelStar2;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelTitulo;

    public App()
    {   
        setTitle("Ferreteria: Mario & Luigy");
        setLocation(360,70);
        setResizable(false);
        
        bg = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        labelStar2 = new javax.swing.JLabel();
        labelStar1 = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        botonTodos = new javax.swing.JButton();
        botonStock = new javax.swing.JButton();
        botonAgotados = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEstadisticas = new javax.swing.JButton();
        labelMario = new javax.swing.JLabel();
        labelLuigy = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(196, 255, 225));

        panelTitulo.setBackground(new java.awt.Color(225, 196, 255));
        panelTitulo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelStar2.setIcon(new javax.swing.ImageIcon("C:\\Users\\guraz\\OneDrive\\Escritorio\\ProyectoFerreteria\\MiniProyectoFerreteria\\src\\star.gif")); // NOI18N

        labelStar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\guraz\\OneDrive\\Escritorio\\ProyectoFerreteria\\MiniProyectoFerreteria\\src\\star.gif")); // NOI18N

        labelTitulo.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        labelTitulo.setText("FERRETERIA MARIO & LUIGY");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(labelStar1)
                .addGap(74, 74, 74)
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelStar2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelStar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelStar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        botonTodos.setBackground(new java.awt.Color(255, 196, 226));
        botonTodos.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonTodos.setText("TODOS");
        botonTodos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTodosActionPerformed(evt);
            }
        });

        botonStock.setBackground(new java.awt.Color(255, 196, 226));
        botonStock.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonStock.setText("EN STOCK");
        botonStock.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonStockActionPerformed(evt);
            }
        });

        botonAgotados.setBackground(new java.awt.Color(255, 196, 226));
        botonAgotados.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonAgotados.setText("AGOTADOS");
        botonAgotados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgotadosActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(255, 196, 226));
        botonAgregar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonAgregar.setText("AGREGAR");
        botonAgregar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(255, 196, 226));
        botonEliminar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonEliminar.setText("ELIMINAR");
        botonEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonActualizar.setBackground(new java.awt.Color(255, 196, 226));
        botonActualizar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonActualizar.setText("ACTUALIZAR");
        botonActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonEstadisticas.setBackground(new java.awt.Color(255, 196, 226));
        botonEstadisticas.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonEstadisticas.setText("STATISTICS");
        botonEstadisticas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstadisticasActionPerformed(evt);
            }
        });

        labelMario.setIcon(new javax.swing.ImageIcon("C:\\Users\\guraz\\OneDrive\\Escritorio\\ProyectoFerreteria\\MiniProyectoFerreteria\\src\\luigy.gif")); // NOI18N

        labelLuigy.setIcon(new javax.swing.ImageIcon("C:\\Users\\guraz\\OneDrive\\Escritorio\\ProyectoFerreteria\\MiniProyectoFerreteria\\src\\mario.gif")); // NOI18N

        contenido.setBackground(new java.awt.Color(255, 254, 196));
        contenido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(labelLuigy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonStock, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(botonAgotados, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(botonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(botonEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(labelMario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botonTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(botonTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonStock, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonAgotados, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(botonEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelMario, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLuigy, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

        PaginaTodos p = new PaginaTodos();
        showPanel(p);
    }

    public static void main(String[] args) throws Exception
    {
        App app = new App();
        app.setVisible(true);
    }

    private void showPanel(JPanel p){
        p.setSize(654, 528);
        p.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
    private void botonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTodosActionPerformed
        PaginaTodos pT = new PaginaTodos();
        pT.setSize(654, 528);
        pT.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(pT, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonTodosActionPerformed

    private void botonStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonStockActionPerformed
        PaginaEnStock pS = new PaginaEnStock();
        pS.setSize(654, 528);
        pS.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(pS, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonStockActionPerformed

    private void botonAgotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgotadosActionPerformed
        PaginaAgotados pA = new PaginaAgotados();
        pA.setSize(654, 528);
        pA.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(pA, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonAgotadosActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        PaginaAgregar pAg = new PaginaAgregar();
        pAg.setSize(654, 528);
        pAg.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(pAg, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        PaginaEliminar pE = new PaginaEliminar();
        pE.setSize(654, 528);
        pE.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(pE, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        PaginaActualizar pA = new PaginaActualizar();
        pA.setSize(654, 528);
        pA.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(pA, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstadisticasActionPerformed
        PaginaStatistics pSt = new PaginaStatistics();
        pSt.setSize(654, 528);
        pSt.setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(pSt, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }
}

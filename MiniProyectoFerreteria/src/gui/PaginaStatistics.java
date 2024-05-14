package gui;
import javax.swing.JPanel;


public class PaginaStatistics extends JPanel {
    
    //!DeclaracionDeVariables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;

    public PaginaStatistics()
    {
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        bg.setBackground(new java.awt.Color(255, 254, 196));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel1.setText("PAGINA DE ESTADISTICAS");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(87, 87, 87))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
}

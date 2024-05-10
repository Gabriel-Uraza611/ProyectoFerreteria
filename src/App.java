import javax.swing.JFrame;

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
    private javax.swing.JLabel labelLuigy;
    private javax.swing.JLabel labelMario;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelTitulo;

    public App()
    {
        bg = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(196, 255, 225));

        panelTitulo.setBackground(new java.awt.Color(225, 196, 255));

        labelTitulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        labelTitulo.setText("FERRETERIA MARIO & LUIGY");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(labelTitulo)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        botonTodos.setBackground(new java.awt.Color(255, 196, 226));
        botonTodos.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonTodos.setText("TODOS");

        botonStock.setBackground(new java.awt.Color(255, 196, 226));
        botonStock.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonStock.setText("EN STOCK");

        botonAgotados.setBackground(new java.awt.Color(255, 196, 226));
        botonAgotados.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonAgotados.setText("AGOTADOS");

        botonAgregar.setBackground(new java.awt.Color(255, 196, 226));
        botonAgregar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonAgregar.setText("AGREGAR");

        botonEliminar.setBackground(new java.awt.Color(255, 196, 226));
        botonEliminar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonEliminar.setText("ELIMINAR");

        botonActualizar.setBackground(new java.awt.Color(255, 196, 226));
        botonActualizar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonActualizar.setText("ACTUALIZAR");

        botonEstadisticas.setBackground(new java.awt.Color(255, 196, 226));
        botonEstadisticas.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        botonEstadisticas.setText("STATISTICS");

        labelMario.setIcon(new javax.swing.ImageIcon("C:\\Users\\guraz\\OneDrive\\Escritorio\\ProyectoFerreteria\\luigy.gif")); // NOI18N

        labelLuigy.setIcon(new javax.swing.ImageIcon("C:\\Users\\guraz\\OneDrive\\Escritorio\\ProyectoFerreteria\\mario.gif")); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelLuigy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(botonStock, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(botonAgotados, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(botonActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(botonEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(labelMario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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
                .addComponent(labelLuigy, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }

    public static void main(String[] args) throws Exception
    {
        App app = new App();
        app.setVisible(true);
    }
}

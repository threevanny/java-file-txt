package archivostxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame {

    ArrayList<Alumno> lista = new ArrayList<Alumno>();
    ArrayList<Object[]> datos = new ArrayList<Object[]>();
    DefaultTableModel modelo;
    int filas;

    public Vista() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("CODIGO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("FECHA NAC");
        this.jTable1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTelefono = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 184, 30));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 184, 30));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 184, 30));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 184, 30));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 184, 30));
        jPanel1.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 184, 30));

        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 140, 50));

        jButton2.setText("EDITAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 50));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setForeground(new java.awt.Color(102, 102, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "TELEFONO", "DIRECCION", "F NACIMIENTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 630, 210));

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 140, 50));

        jButton4.setText("CARGAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 140, 50));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton5.setText("GUARDAR CAMBIOS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 140, 50));

        jLabel1.setText("CODIGO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, 72, -1));

        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 20));

        jLabel3.setText("APELLIDOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 20));

        jLabel4.setText("TELEFONO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 20));

        jLabel5.setText("DIRECCION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 70, 20));

        jLabel6.setText("FECHA NACIMIENTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 20));

        jButton6.setText("CARGAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 140, 50));

        jButton7.setText("SALVAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // AGREGAR
        String nombre, apellido, direccion, fechaNacimiento;
        int codigo, telefono;

        codigo = Integer.parseInt(txtCodigo.getText());
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        telefono = Integer.parseInt(txtTelefono.getText());
        direccion = txtDireccion.getText();
        fechaNacimiento = txtFechaNacimiento.getText();

        Alumno al = new Alumno(codigo, nombre, apellido, telefono, direccion, fechaNacimiento);
        lista.add(al);

        Object[] obj = {al.getCodigo(), al.getNombre(), al.getApellido(), al.getTelefono(), al.getDireccion(), al.getFechaNacimiento()};
        datos.add(obj);
        modelo.addRow(obj);

        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtFechaNacimiento.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // CARGAR
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");
        fileChooser.setFileFilter(filtro);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = fileChooser.showOpenDialog(jTable1);
        cargarArchivo(fileChooser.getSelectedFile());
        System.out.println("ARCHIVO CARGADO");
        mostrarTabla();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        borrarFila();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int fila = jTable1.getSelectedRow();

        if (fila >= 0) {
            txtCodigo.setText(String.valueOf(modelo.getValueAt(fila, 0)));
            txtNombre.setText(String.valueOf(modelo.getValueAt(fila, 1)));
            txtApellido.setText(String.valueOf(modelo.getValueAt(fila, 2)));
            txtTelefono.setText(String.valueOf(modelo.getValueAt(fila, 3)));
            txtDireccion.setText(String.valueOf(modelo.getValueAt(fila, 4)));
            txtFechaNacimiento.setText(String.valueOf(modelo.getValueAt(fila, 5)));

            lista.remove(fila);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONA UNA FILA");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // GUARDAR CAMBIOS
        String nombre, apellido, direccion, fechaNacimiento;
        int codigo, telefono;

        codigo = Integer.parseInt(txtCodigo.getText());
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        telefono = Integer.parseInt(txtTelefono.getText());
        direccion = txtDireccion.getText();
        fechaNacimiento = txtFechaNacimiento.getText();
        filas = jTable1.getSelectedRow();

        Alumno al = new Alumno(codigo, nombre, apellido, telefono, direccion, fechaNacimiento);
        lista.add(filas, al);

        Object[] obj = {al.getCodigo(), al.getNombre(), al.getApellido(), al.getTelefono(), al.getDireccion(), al.getFechaNacimiento()};
        datos.add(obj);

        modelo.setValueAt(al.getCodigo(), filas, 0);
        modelo.setValueAt(al.getNombre(), filas, 1);
        modelo.setValueAt(al.getApellido(), filas, 2);
        modelo.setValueAt(al.getTelefono(), filas, 3);
        modelo.setValueAt(al.getDireccion(), filas, 4);
        modelo.setValueAt(al.getFechaNacimiento(), filas, 5);

        txtCodigo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtFechaNacimiento.setText("");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        guardarArchivo();
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    public void mostrarTabla() {

        Object[] datos = new Object[modelo.getColumnCount()];

        for (int i = 0; i < lista.size(); i++) {
            if (lista != null) {
                datos[0] = lista.get(i).getCodigo();
                datos[1] = lista.get(i).getNombre();
                datos[2] = lista.get(i).getApellido();
                datos[3] = lista.get(i).getTelefono();
                datos[4] = lista.get(i).getDireccion();
                datos[5] = lista.get(i).getFechaNacimiento();
            }

            modelo.addRow(datos);

        }

    }

    public void guardarArchivo() {
        FileWriter archivo = null;
        PrintWriter pw = null;
        try {
            archivo = new FileWriter("archivo.txt");
            pw = new PrintWriter(archivo);

            for (int i = 0; i < lista.size(); i++) {
                pw.println(lista.get(i).devolverAlumno());
            }

        } catch (IOException e) {
            System.out.println("ERROR AL GUARDAR");
        } finally {
            try {
                if (null != pw) {
                    pw.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void cargarArchivo(File archivo) {

        String nombre, apellido, direccion, fechaNacimiento;
        int codigo, telefono;

        try {

            File archivoAlumnos = new File("archivo.txt");

            if (archivoAlumnos.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("archivo.txt"));

                String linea;

                while ((linea = br.readLine()) != null) {

                    String[] cadena = linea.split(",");
                    codigo = Integer.parseInt(cadena[0]);
                    nombre = cadena[1];
                    apellido = cadena[2];
                    telefono = Integer.parseInt(cadena[3]);
                    direccion = cadena[4];
                    fechaNacimiento = cadena[5];

                    System.out.println(codigo + ", " + nombre + ", " + apellido + ", " + direccion + ", " + fechaNacimiento);

                    Alumno alumno = new Alumno(codigo, nombre, apellido, telefono, direccion, fechaNacimiento);
                    lista.add(alumno);
                }
                br.close();

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ERROR AL CARGAR EL ARCHIVO");
        } catch (IOException e) {
            System.out.println("ERROR");
        } catch (NumberFormatException e) {
            System.out.println("ERROR");
        }

    }

    public void borrarFila() {
        int eliminar = jTable1.getSelectedRow();

        if (eliminar >= 0) {
            modelo.removeRow(eliminar);
            lista.remove(eliminar);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONA LA FILA A ELIMINAR");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

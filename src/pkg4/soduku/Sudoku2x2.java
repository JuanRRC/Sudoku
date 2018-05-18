/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.soduku;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author jeiso
 */
public class Sudoku2x2 extends javax.swing.JFrame {

    /**
     * Creates new form Sudoku1x1
     */
     int filas,columnas;
     private ArrayList<JTextField> mapaBotones;
     int[][] matriz={
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}};
         int[][] fija={
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}};
    public Sudoku2x2() {
        
        initComponents();
        crearBotones();
    }

    public boolean validar(){
       
        boolean resul=false;
        /*
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                
            }
        }
        */
        if((matriz[0][0]==1)||(matriz[0][0]==2)||(matriz[0][0]==3)||(matriz[0][0]==4)){
            if((matriz[0][0]==matriz[0][1])||(matriz[0][0]==matriz[0][2])||(matriz[0][0]==matriz[0][3])||(matriz[0][0]==matriz[1][0])||(matriz[0][0]==matriz[2][0])||(matriz[0][0]==matriz[3][0])){
                resul=true;    
            }
        }
        if((matriz[0][1]==1)||(matriz[0][1]==2)||(matriz[0][1]==3)||(matriz[0][1]==4)){
            if((matriz[0][1]==matriz[0][0])||(matriz[0][1]==matriz[0][2])||(matriz[0][1]==matriz[0][3])||(matriz[0][1]==matriz[1][1])||(matriz[0][1]==matriz[2][1])||(matriz[0][1]==matriz[3][1])){
                resul=true;
            }
        }
        if((matriz[0][2]==1)||(matriz[0][2]==2)||(matriz[0][2]==3)||(matriz[0][2]==4)){
            if((matriz[0][2]==matriz[0][0])||(matriz[0][2]==matriz[0][1])||(matriz[0][2]==matriz[0][3])||(matriz[0][2]==matriz[1][2])||(matriz[0][2]==matriz[2][2])||(matriz[0][2]==matriz[3][2])){
                 resul=true;
            }
        }
        if((matriz[0][3]==1)||(matriz[0][3]==2)||(matriz[0][3]==3)||(matriz[0][3]==4)){
            if((matriz[0][3]==matriz[0][0])||(matriz[0][3]==matriz[0][1])||(matriz[0][3]==matriz[0][2])||(matriz[0][3]==matriz[1][3])||(matriz[0][3]==matriz[2][3])||(matriz[0][3]==matriz[3][3])){
                 resul=true;
            }
        }
        if((matriz[1][0]==1)||(matriz[1][0]==2)||(matriz[1][0]==3)||(matriz[1][0]==4)){
            if((matriz[1][0]==matriz[0][0])||(matriz[1][0]==matriz[2][0])||(matriz[1][0]==matriz[3][0])||(matriz[1][0]==matriz[1][1])||(matriz[1][0]==matriz[1][2])||(matriz[1][0]==matriz[1][3])){
                resul=true;
            }
        }
        if((matriz[1][1]==1)||(matriz[1][1]==2)||(matriz[1][1]==3)||(matriz[1][1]==4)){
            if((matriz[1][1]==matriz[0][1])||(matriz[1][1]==matriz[1][0])||(matriz[1][1]==matriz[2][1])||(matriz[1][1]==matriz[3][1])||(matriz[1][1]==matriz[1][2])||(matriz[1][1]==matriz[1][3])){
                resul=true;
            }
        }
        if((matriz[1][2]==1)||(matriz[1][2]==2)||(matriz[1][2]==3)||(matriz[1][2]==4)){
            if((matriz[1][2]==matriz[1][0])||(matriz[1][2]==matriz[1][1])||(matriz[1][2]==matriz[1][3])||(matriz[1][2]==matriz[0][2])||(matriz[1][2]==matriz[2][2])||(matriz[1][2]==matriz[3][2])){
                resul=true;
            }
        }
        if((matriz[1][3]==1)||(matriz[1][3]==2)||(matriz[1][3]==3)||(matriz[1][3]==4)){
            if((matriz[1][3]==matriz[0][3])||(matriz[1][3]==matriz[1][0])||(matriz[1][3]==matriz[1][1])||(matriz[1][3]==matriz[1][2])||(matriz[1][3]==matriz[2][3])||(matriz[1][3]==matriz[3][3])){
                resul=true;
            }
        }
        if((matriz[2][0]==1)||(matriz[2][0]==2)||(matriz[2][0]==3)||(matriz[2][0]==4)){
            if((matriz[2][0]==matriz[0][0])||(matriz[2][0]==matriz[1][0])||(matriz[2][0]==matriz[3][0])||(matriz[2][0]==matriz[2][1])||(matriz[2][0]==matriz[2][2])||(matriz[2][0]==matriz[2][3])){
                 resul=true;
            }
        }
        if((matriz[2][1]==1)||(matriz[2][1]==2)||(matriz[2][1]==3)||(matriz[2][1]==4)){
            if((matriz[2][1]==matriz[2][0])||(matriz[2][1]==matriz[2][2])||(matriz[2][1]==matriz[2][3])||(matriz[2][1]==matriz[0][1])||(matriz[2][1]==matriz[1][1])||(matriz[2][1]==matriz[3][1])){
                 resul=true;
            }
        }
        if((matriz[2][2]==1)||(matriz[2][2]==2)||(matriz[2][2]==3)||(matriz[2][2]==4)){
            if((matriz[2][2]==matriz[2][0])||(matriz[2][2]==matriz[2][1])||(matriz[2][2]==matriz[2][3])||(matriz[2][2]==matriz[0][2])||(matriz[2][2]==matriz[1][2])||(matriz[2][2]==matriz[3][2])){
                resul=true;
            }
        }
        if((matriz[2][3]==1)||(matriz[2][3]==2)||(matriz[2][3]==3)||(matriz[2][3]==4)){
            if((matriz[2][3]==matriz[2][0])||(matriz[2][3]==matriz[2][1])||(matriz[2][3]==matriz[2][2])||(matriz[2][3]==matriz[0][3])||(matriz[2][3]==matriz[1][3])||(matriz[2][3]==matriz[3][3])){
                resul=true;
            }
        }
        if((matriz[3][0]==1)||(matriz[3][0]==2)||(matriz[3][0]==3)||(matriz[3][0]==4)){
            if((matriz[3][0]==matriz[0][0])||(matriz[3][0]==matriz[1][0])||(matriz[3][0]==matriz[2][0])||(matriz[3][0]==matriz[3][1])||(matriz[3][0]==matriz[3][2])||(matriz[3][0]==matriz[3][3])){
                resul=true;
            }
        }
        if((matriz[3][1]==1)||(matriz[3][1]==2)||(matriz[3][1]==3)||(matriz[3][1]==4)){
            if((matriz[3][1]==matriz[3][0])||(matriz[3][1]==matriz[3][2])||(matriz[3][1]==matriz[3][3])||(matriz[3][1]==matriz[2][1])||(matriz[3][1]==matriz[1][1])||(matriz[3][1]==matriz[0][1])){
                resul=true;
            }
        }
        if((matriz[3][2]==1)||(matriz[3][2]==2)||(matriz[3][2]==3)||(matriz[3][2]==4)){
            if((matriz[3][2]==matriz[3][0])||(matriz[3][2]==matriz[3][1])||(matriz[3][2]==matriz[3][3])||(matriz[3][2]==matriz[2][2])||(matriz[3][2]==matriz[1][2])||(matriz[3][2]==matriz[0][2])){
               resul=true;
            }
        }
        if((matriz[3][3]==1)||(matriz[3][3]==2)||(matriz[3][3]==3)||(matriz[3][3]==4)){
            if((matriz[3][3]==matriz[3][0])||(matriz[3][3]==matriz[3][1])||(matriz[3][3]==matriz[3][2])||(matriz[3][3]==matriz[2][3])||(matriz[3][3]==matriz[1][3])||(matriz[3][3]==matriz[0][3])){
               resul=true;
            }
        }
        
        return resul;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Resolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cerrar ventana");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese numeros de 1 al 4 en la casilla que desee");

        jButton3.setText("Reiniciar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addGap(40, 40, 40)
                .addComponent(jButton2)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        //mapaBotones.get(2).setText(String.valueOf(4));

         
    
        
        //int per=0;
        int conta=0;
        int numero=0;
        int cd=0;
        int ee=0;
        
            for (int uip=0; uip < matriz.length; uip++) {
                    for (int ujp=0; ujp < matriz[uip].length; ujp++) {
                        matriz[uip][ujp]=Integer.parseInt(mapaBotones.get(cd).getText());
                        cd++;
                        if(matriz[uip][ujp]==0){
                         conta++;   
                        }
                    }
            }
            if(validar()==false){
        try{    
           
                
            
             for (int uis=0; uis < matriz.length; uis++) {
                    for (int ujs=0; ujs < matriz[uis].length; ujs++) {
                        if(matriz[uis][ujs]>4 | matriz[uis][ujs]<0){
                         numero++;   
                        }
                        
                    }
            }
             System.out.println("ceros es "+conta);
            if(conta>=10){
                JOptionPane.showMessageDialog(null, " hay demasiadas soluciones voy a adivinar una ");

            }
            
            
            
            if(numero>0){
                JOptionPane.showMessageDialog(null, " HAY NUMEROS INCORRECTOS ");
            }else{
                boolean solucionado=false;
                while(solucionado==false){
                    
 //traer lo que tiene los textbox  
                int per=0;
               for (int ui=0; ui < matriz.length; ui++) {
                    for (int uj=0; uj < matriz[ui].length; uj++) {
                        matriz[ui][uj]=Integer.parseInt(mapaBotones.get(per).getText());
                        fija[ui][uj]=Integer.parseInt(mapaBotones.get(per).getText());
                        per++;    
                    }
                  
                for (int i=0; i < matriz.length; i++) {
                        for (int j=0; j < matriz[i].length; j++) {
           
                        int c=matriz[i][j];
                
                if(c==0){
                    if(i==0 & j==0){
                         ArrayList<String> a=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                         a.add("1");a.add("2");a.add("3");a.add("4");
                     
                        String ju= String.valueOf(matriz[1][0]);
                     //columna
                        if(a.contains(ju)){                        
                         a.remove(ju);
                        }
                     
                     ju= String.valueOf(matriz[2][0]);
                     if(a.contains(ju)){
                         a.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[3][0]);
                     if(a.contains(ju)){
                         a.remove(ju);
                     }
                      
                     //fila
                      ju= String.valueOf(matriz[0][1]);
                     if(a.contains(ju)){
                         a.remove(ju);
                     }
                      ju= String.valueOf(matriz[0][2]);
                    if(a.contains(ju)){
                         a.remove(ju);
                     }
                     ju= String.valueOf(matriz[0][3]);
                     if(a.contains(ju)){
                         a.remove(ju);
                     }
                    
                     //diagonal
                      ju= String.valueOf(matriz[1][1]);
                     if(a.contains(ju)){
                         a.remove(ju);
                     }
                     
                     if(a.isEmpty()){
                         matriz[0][0]=0;
                     }else{
                           Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(a.size());
           
                        matriz[0][0]=Integer.parseInt(a.get(valor));
                        
                     }
                        
                      
                 }
                 
                 if(i==0&& j==1){
                     ArrayList<String> b=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     b.add("1");b.add("2");b.add("3");b.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[1][1]);
                     //columna
                     if(b.contains(ju)){                        
                         b.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[2][1]);
                     if(b.contains(ju)){
                         b.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[3][1]);
                     if(b.contains(ju)){
                         b.remove(ju);
                     }
                     //fila
                     ju= String.valueOf(matriz[0][0]);
                     if(b.contains(ju)){
                         b.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[0][2]);
                     if(b.contains(ju)){
                         b.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[0][3]);
                     if(b.contains(ju)){
                         b.remove(ju);
                     }
                     //diagonal
                     ju= String.valueOf(matriz[1][0]);
                     if(b.contains(ju)){
                         b.remove(ju);
                     }
                      if(b.isEmpty()){
                         matriz[0][1]=0;
                     }else{
                          Random r1=new Random(System.currentTimeMillis());
                          int valor=r1.nextInt(b.size());
                        matriz[0][1]=Integer.parseInt(b.get(valor));
                        
                     }
                     
     
                 }
                 
                 if(i==0&& j==2){
                     
                     ArrayList<String> d=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     d.add("1");d.add("2");d.add("3");d.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[1][2]);
                     
                     if(d.contains(ju)){                        
                         d.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[2][2]);
                     
                     if(d.contains(ju)){                        
                         d.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[3][2]);
                     
                     if(d.contains(ju)){                        
                         d.remove(ju);
                     }
                     //fila
                     
                     ju= String.valueOf(matriz[0][0]);
                     
                     if(d.contains(ju)){                        
                         d.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[0][1]);
                     
                     if(d.contains(ju)){                        
                         d.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[0][3]);
                     
                     if(d.contains(ju)){                        
                         d.remove(ju);
                     }
                     
                     //diagonal
                     ju= String.valueOf(matriz[1][3]);
                     
                     if(d.contains(ju)){                        
                         d.remove(ju);
                     }
                     if(d.isEmpty()){
                         matriz[0][2]=0;
                     }else{
                        Random r1=new Random(System.currentTimeMillis());
                        int valor=r1.nextInt(d.size());
                        matriz[0][2]=Integer.parseInt(d.get(valor));
                        
                     }

                 }
                 
                 if(i==0&& j==3){
                     ArrayList<String> e=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     e.add("1");e.add("2");e.add("3");e.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[1][3]);
                     
                     if(e.contains(ju)){                        
                         e.remove(ju);
                     }
                     
                      ju= String.valueOf(matriz[2][3]);
                     
                     if(e.contains(ju)){                        
                         e.remove(ju);
                     }
                     
                      ju= String.valueOf(matriz[3][3]);
                     
                     if(e.contains(ju)){                        
                         e.remove(ju);
                     }
                     //fila
              
                      ju= String.valueOf(matriz[0][0]);
                     
                     if(e.contains(ju)){                        
                         e.remove(ju);
                     }
                     
                      ju= String.valueOf(matriz[0][1]);
                     
                     if(e.contains(ju)){                        
                         e.remove(ju);
                     }
                      ju= String.valueOf(matriz[0][2]);
                     
                     if(e.contains(ju)){                        
                         e.remove(ju);
                     }
                     //diagonal
                      ju= String.valueOf(matriz[1][2]);
                     
                     if(e.contains(ju)){                        
                         e.remove(ju);
                     }
                      if(e.isEmpty()){
                         matriz[0][3]=0;
                     }else{
                        Random r1=new Random(System.currentTimeMillis());
                        int valor=r1.nextInt(e.size());
                        matriz[0][3]=Integer.parseInt(e.get(valor));
                        
                     }
                 

                 }
                 //segunda filaaa
                  if(i==1&& j==0){
                      ArrayList<String> f=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     f.add("1");f.add("2");f.add("3");f.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][0]);
                     
                     if(f.contains(ju)){                        
                         f.remove(ju);
                     }
                     ju= String.valueOf(matriz[2][0]);
                     
                     if(f.contains(ju)){                        
                         f.remove(ju);
                     }
                     ju= String.valueOf(matriz[3][0]);
                     
                     if(f.contains(ju)){                        
                         f.remove(ju);
                     }
                     
                     //fila
                      ju= String.valueOf(matriz[1][1]);
                     
                     if(f.contains(ju)){                        
                         f.remove(ju);
                     }
                     
                      ju= String.valueOf(matriz[1][2]);
                     
                     if(f.contains(ju)){                        
                         f.remove(ju);
                     }
                     
                      ju= String.valueOf(matriz[1][3]);
                     
                     if(f.contains(ju)){                        
                         f.remove(ju);
                     }
                     
                     //diagonal
                      ju= String.valueOf(matriz[0][1]);
                     
                     if(f.contains(ju)){                        
                         f.remove(ju);
                     }
                      if(f.isEmpty()){
                         matriz[1][0]=0;
                     }else{
                        Random r1=new Random(System.currentTimeMillis());
                        int valor=r1.nextInt(f.size());
                        matriz[1][0]=Integer.parseInt(f.get(valor));
                        
                     }

                 }
                  
                 if(i==1&& j==1){
                     ArrayList<String> g=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     g.add("1");g.add("2");g.add("3");g.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][1]);
                     
                     if(g.contains(ju)){                        
                         g.remove(ju);
                     }
                     
                    ju= String.valueOf(matriz[2][1]);
                     
                     if(g.contains(ju)){                        
                         g.remove(ju);
                     }
                      ju= String.valueOf(matriz[3][1]);
                     
                     if(g.contains(ju)){                        
                         g.remove(ju);
                     }
                     //fila
                      ju= String.valueOf(matriz[1][0]);
                     
                     if(g.contains(ju)){                        
                         g.remove(ju);
                     }
                      ju= String.valueOf(matriz[1][2]);
                     
                     if(g.contains(ju)){                        
                         g.remove(ju);
                     }
                      ju= String.valueOf(matriz[1][3]);
                     
                     if(g.contains(ju)){                        
                         g.remove(ju);
                     }
                     //diagonal
                      ju= String.valueOf(matriz[0][0]);
                     
                     if(g.contains(ju)){                        
                         g.remove(ju);
                     }

                     if(g.isEmpty()){
                         matriz[1][1]=0;
                     }else{
                          Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(g.size());
                        matriz[1][1]=Integer.parseInt(g.get(valor));
                        
                     }

                 }
                 
                 if(i==1&& j==2){
                     ArrayList<String> h=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     h.add("1");h.add("2");h.add("3");h.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][2]);
                     
                     if(h.contains(ju)){                        
                         h.remove(ju);
                     }
                     
                    ju= String.valueOf(matriz[2][2]);
                     
                     if(h.contains(ju)){                        
                         h.remove(ju);
                     }
                     ju= String.valueOf(matriz[3][2]);
                     
                     if(h.contains(ju)){                        
                         h.remove(ju);
                     }
                     //filas
                     ju= String.valueOf(matriz[1][0]);
                     
                     if(h.contains(ju)){                        
                         h.remove(ju);
                     }
                     ju= String.valueOf(matriz[1][1]);
                     
                     if(h.contains(ju)){                        
                         h.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[1][3]);
                     
                     if(h.contains(ju)){                        
                         h.remove(ju);
                     }
                     //diagonal
                     ju= String.valueOf(matriz[0][3]);
                     
                     if(h.contains(ju)){                        
                         h.remove(ju);
                     }
                     
                     
                      if(h.isEmpty()){
                         matriz[1][2]=0;
                     }else{
                           Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(h.size());
                        matriz[1][2]=Integer.parseInt(h.get(valor));
                        
                     }
                     
                    
                     System.out.println("valor que quedo"+matriz[1][2]);

                 }
                 
                 if(i==1&& j==3){
                      ArrayList<String> k=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     k.add("1");k.add("2");k.add("3");k.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][3]);
                     
                     if(k.contains(ju)){                        
                         k.remove(ju);
                     }
                      ju= String.valueOf(matriz[2][3]);
                     
                     if(k.contains(ju)){                        
                         k.remove(ju);
                     }
                     ju= String.valueOf(matriz[3][3]);
                     
                     if(k.contains(ju)){                        
                         k.remove(ju);
                     }
                     //fila
                      ju= String.valueOf(matriz[1][0]);
                     
                     if(k.contains(ju)){                        
                         k.remove(ju);
                     }
                      ju= String.valueOf(matriz[1][1]);
                     
                     if(k.contains(ju)){                        
                         k.remove(ju);
                     }
                      ju= String.valueOf(matriz[1][2]);
                     
                     if(k.contains(ju)){                        
                         k.remove(ju);
                     }
                     //diagonal
                     ju= String.valueOf(matriz[0][2]);
                     
                     if(k.contains(ju)){                        
                         k.remove(ju);
                     }

                     if(k.isEmpty()){
                         matriz[1][3]=0;
                     }else{
                          Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(k.size());
                         matriz[1][3]=Integer.parseInt(k.get(valor));
                         System.out.println("valor que quedo"+matriz[1][3]);
                     }

                 }
                 
                 //tercer filaa
                 if(i==2&& j==0){
                     ArrayList<String> l=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     l.add("1");l.add("2");l.add("3");l.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][0]);
                     
                     if(l.contains(ju)){                        
                         l.remove(ju);
                     }
                     
                      ju= String.valueOf(matriz[1][0]);
                     
                     if(l.contains(ju)){                        
                         l.remove(ju);
                     }
                      ju= String.valueOf(matriz[3][0]);
                     
                     if(l.contains(ju)){                        
                         l.remove(ju);
                     }
                     //fila
                       ju= String.valueOf(matriz[2][1]);
                     
                     if(l.contains(ju)){                        
                         l.remove(ju);
                     }
                       ju= String.valueOf(matriz[2][2]);
                     
                     if(l.contains(ju)){                        
                         l.remove(ju);
                     }
                       ju= String.valueOf(matriz[2][3]);
                     
                     if(l.contains(ju)){                        
                         l.remove(ju);
                     }
                     //diagonal
                     ju= String.valueOf(matriz[3][1]);
                     
                     if(l.contains(ju)){                        
                         l.remove(ju);
                     }
                      if(l.isEmpty()){
                         matriz[2][0]=0;
                     }else{
                         Random r1=new Random(System.currentTimeMillis());
                        int valor=r1.nextInt(l.size());
                        matriz[2][0]=Integer.parseInt(l.get(valor));
                        
                     }
                     
                     System.out.println("valor que quedo"+matriz[2][0]);

                 }
                 
                 if(i==2 && j==1){
                     
                     ArrayList<String> m=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     m.add("1");m.add("2");m.add("3");m.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][1]);
                     
                     if(m.contains(ju)){                        
                         m.remove(ju);
                     }
                     ju= String.valueOf(matriz[1][1]);
                     
                     if(m.contains(ju)){                        
                         m.remove(ju);
                     }
                     ju= String.valueOf(matriz[3][1]);
                     
                     if(m.contains(ju)){                        
                         m.remove(ju);
                         
                     }
                     //filas
                     ju= String.valueOf(matriz[2][0]);
                     
                     if(m.contains(ju)){                        
                         m.remove(ju);
                     }
                     ju= String.valueOf(matriz[2][2]);
                     
                     if(m.contains(ju)){                        
                         m.remove(ju);
                     }
                     ju= String.valueOf(matriz[2][3]);
                     
                     if(m.contains(ju)){                        
                         m.remove(ju);
                     }
                     //diagonal
                     ju= String.valueOf(matriz[3][0]);
                     
                     if(m.contains(ju)){                        
                         m.remove(ju);
                     }
                      if(m.isEmpty()){
                         matriz[2][1]=0;
                     }else{
                           Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(m.size());
                        matriz[2][1]=Integer.parseInt(m.get(valor));                    
                     }

                 }
                 
                 if(i==2 && j==2){
                      ArrayList<String> n=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     n.add("1");n.add("2");n.add("3");n.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][2]);
                     
                     if(n.contains(ju)){                        
                         n.remove(ju);
                     }
                       ju= String.valueOf(matriz[1][2]);
                     
                     if(n.contains(ju)){                        
                         n.remove(ju);
                     }
                       ju= String.valueOf(matriz[3][2]);
                     
                     if(n.contains(ju)){                        
                         n.remove(ju);
                     }
                     //filas
                      ju= String.valueOf(matriz[2][0]);
                     
                     if(n.contains(ju)){                        
                         n.remove(ju);
                     }
                      ju= String.valueOf(matriz[2][1]);
                     
                     if(n.contains(ju)){                        
                         n.remove(ju);
                     }
                      ju= String.valueOf(matriz[2][3]);
                     
                     if(n.contains(ju)){                        
                         n.remove(ju);
                     }
                     
                    //diagonal
                     ju= String.valueOf(matriz[3][3]);
                     
                     if(n.contains(ju)){                        
                         n.remove(ju);
                     }
                     if(n.isEmpty()){
                         matriz[2][2]=0;
                     }else{
                         Random r1=new Random(System.currentTimeMillis());
                         int valor=r1.nextInt(n.size());
                        matriz[2][2]=Integer.parseInt(n.get(valor));
                        
                     }
                     

                 }
                 
                 if(i==2 && j==3){
                     ArrayList<String> p=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     p.add("1");p.add("2");p.add("3");p.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][3]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     ju= String.valueOf(matriz[1][3]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                      ju= String.valueOf(matriz[3][3]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     //fila
                      ju= String.valueOf(matriz[2][0]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     } 
                     ju= String.valueOf(matriz[2][1]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     ju= String.valueOf(matriz[2][2]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     //diagonal
                      ju= String.valueOf(matriz[3][2]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     
                      if(p.isEmpty()){
                         matriz[2][3]=0;
                     }else{
                           Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(p.size());
                        matriz[2][3]=Integer.parseInt(p.get(valor));
                        
                     }

                 }
                 //cuarta fila
                 if(i==3 && j==0){
                     ArrayList<String> p=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     p.add("1");p.add("2");p.add("3");p.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][0]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     
                     ju= String.valueOf(matriz[1][0]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                      ju= String.valueOf(matriz[2][0]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     
                     //fila
                      ju= String.valueOf(matriz[3][1]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                      ju= String.valueOf(matriz[3][2]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                      ju= String.valueOf(matriz[3][3]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     //diagonal
                      ju= String.valueOf(matriz[2][1]);
                     
                     if(p.contains(ju)){                        
                         p.remove(ju);
                     }
                     
                      if(p.isEmpty()){
                         matriz[3][0]=0;
                     }else{
                           Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(p.size());
                        matriz[3][0]=Integer.parseInt(p.get(valor));
                        
                     }

                 }
                 
                 if(i==3 && j==1){
                     ArrayList<String> rr=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     rr.add("1");rr.add("2");rr.add("3");rr.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][1]);
                     
                     if(rr.contains(ju)){                        
                         rr.remove(ju);
                     }
                      ju= String.valueOf(matriz[1][1]);
                     
                     if(rr.contains(ju)){                        
                         rr.remove(ju);
                     }
                      ju= String.valueOf(matriz[2][1]);
                     
                     if(rr.contains(ju)){                        
                         rr.remove(ju);
                     }
                     //fila
                     ju= String.valueOf(matriz[3][0]);
                     
                     if(rr.contains(ju)){                        
                         rr.remove(ju);
                     }
                     ju= String.valueOf(matriz[3][2]);
                     
                     if(rr.contains(ju)){                        
                         rr.remove(ju);
                     }
                     ju= String.valueOf(matriz[3][3]);
                     
                     if(rr.contains(ju)){                        
                         rr.remove(ju);
                     }
                     //diagonal
                     ju= String.valueOf(matriz[2][0]);
                     
                     if(rr.contains(ju)){                        
                         rr.remove(ju);
                     }
                      if(rr.isEmpty()){
                         matriz[3][1]=0;
                     }else{
                           Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(rr.size());
                        matriz[3][1]=Integer.parseInt(rr.get(valor));
                        
                     }

                 }
                 
                  
                 if(i==3 && j==2){
                     ArrayList<String> pp=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     pp.add("1");pp.add("2");pp.add("3");pp.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][2]);
                     
                     if(pp.contains(ju)){                        
                         pp.remove(ju);
                     }
                      ju= String.valueOf(matriz[1][2]);
                     
                     if(pp.contains(ju)){                        
                         pp.remove(ju);
                     }
                      ju= String.valueOf(matriz[2][2]);
                     
                     if(pp.contains(ju)){                        
                         pp.remove(ju);
                     }
                     //fila
                       ju= String.valueOf(matriz[3][0]);
                     
                     if(pp.contains(ju)){                        
                         pp.remove(ju);
                     }
                       ju= String.valueOf(matriz[3][1]);
                     
                     if(pp.contains(ju)){                        
                         pp.remove(ju);
                     }
                       ju= String.valueOf(matriz[3][3]);
                     
                     if(pp.contains(ju)){                        
                         pp.remove(ju);
                     }
                     //diagonal
                       ju= String.valueOf(matriz[2][3]);
                     
                     if(pp.contains(ju)){                        
                         pp.remove(ju);
                     }
                      if(pp.isEmpty()){
                         matriz[3][2]=0;
                     }else{
                        Random r1=new Random(System.currentTimeMillis());
                        int valor=r1.nextInt(pp.size());
                        matriz[3][2]=Integer.parseInt(pp.get(valor));
                        
                     }
                  
                 }
                   
                    if(i==3 && j==3){
                        ArrayList<String> w=new ArrayList<String>(); //Declaración y creación del ArrayList de enteros.
                     
                     w.add("1");w.add("2");w.add("3");w.add("4");
                     
                     //columna
                     String ju= String.valueOf(matriz[0][3]);
                     
                     if(w.contains(ju)){                        
                         w.remove(ju);
                     }
                     ju= String.valueOf(matriz[1][3]);
                     
                     if(w.contains(ju)){                        
                         w.remove(ju);
                     }
                     ju= String.valueOf(matriz[2][3]);
                     
                     if(w.contains(ju)){                        
                         w.remove(ju);
                     }
                     //fila
                     ju= String.valueOf(matriz[3][0]);
                     
                     if(w.contains(ju)){                        
                         w.remove(ju);
                     }
                     ju= String.valueOf(matriz[3][1]);
                     
                     if(w.contains(ju)){                        
                         w.remove(ju);
                     }
                     ju= String.valueOf(matriz[3][2]);
                     
                     if(w.contains(ju)){                        
                         w.remove(ju);
                     }
                     //diagonal
                     ju= String.valueOf(matriz[2][2]);
                     
                     if(w.contains(ju)){                        
                         w.remove(ju);
                     }
                      if(w.isEmpty()){
                         matriz[3][3]=0;
                     }else{
                           Random r1=new Random(System.currentTimeMillis());
                           int valor=r1.nextInt(w.size());
                        matriz[3][3]=Integer.parseInt(w.get(valor));
                        
                     }
                    
                 }
                 
                 
                 }
            }
        
        }
                    
        }
                int nosolu=0;
               for (int ui=0; ui < matriz.length; ui++) {
                    for (int uj=0; uj < matriz[ui].length; uj++) {
                        if(matriz[ui][uj]==0){
                            nosolu=1;
                        }
                        
                        
                    }
               }
               if(nosolu==1){
                   for (int ui=0; ui < matriz.length; ui++) {
                    for (int uj=0; uj < matriz[ui].length; uj++) {
                        matriz[ui][uj]=fija[ui][uj];
                    }
                }
                   solucionado=false;
               }else{
                   solucionado=true;
               }
               
                }
                 
            }
            
        }catch(NumberFormatException e){
            
            for (int i=0; i < matriz.length; i++) {
                for (int j=0; j < matriz[i].length; j++) {
                    matriz[i][j]=0;
                }
            }
            JOptionPane.showMessageDialog(null, "ERROR DE SINTAXIS");
            
        }
        //llenado de textfield con resultados
        
        int tyu=0;
         for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[i].length; j++) {   
                mapaBotones.get(tyu).setText(String.valueOf(matriz[i][j]));
                tyu++;
            }      
        }
        }JOptionPane.showMessageDialog(null, "NO EXISTE SOLUCION");
         panel.updateUI();
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
           int[][] matriz={
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}};
        
        for (int i=0; i < matriz.length; i++) {
                for (int j=0; j < matriz[i].length; j++) {
                    matriz[i][j]=0;
                }
            }
        
        //llenado de textfield con resultados
        int tyu=0;
         for (int nm=0; nm < matriz.length; nm++) {
            for (int l=0; l < matriz[nm].length; l++) {   
                mapaBotones.get(tyu).setText(String.valueOf(matriz[nm][l]));
                tyu++;
            }      
        }
    }//GEN-LAST:event_jButton3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

void crearBotones(){
    mapaBotones = new ArrayList< JTextField>();
        

        
        filas = 4;
        columnas = 4;
  
        int indice = 1;
        int posicionX = 10;
        int posicionY = 30;
        
        for(int i = 0; i < filas; i++) {
            posicionX = 10;
            for(int j = 0; j < columnas; j++) {
                JTextField boton = new JTextField("0");
                Font fuente=new Font("Dialog", Font.BOLD, 36);
                boton.setFont(fuente);
                boton.setBounds(posicionX, posicionY, 40, 40);
                mapaBotones.add(boton);
                panel.add(boton); 
                posicionX += 40;
                if(posicionX==90){
                    posicionX+=50;
                }
                indice++;
            }
             
             if(posicionY==70){
                posicionY+=50;
             }

            posicionY += 40; 
}
        
        Dimension pantalla=Toolkit.getDefaultToolkit().getScreenSize();
        int height=pantalla.height;
        int width=pantalla.width;
        setSize(width/2,height/2);
        this.setLocationRelativeTo(null);
}


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Juego {
    private String [][]matriz;
    private String [][]matriz2;
    Juego(){
        matriz=new String[4][5];
        matriz2=new String[4][5];
       
        this.llenar();
       // this.Mostrar();
    }

    public String[][] getMatriz2() {
        return matriz2;
    }

    public void setMatriz2(String[][] matriz2) {
        this.matriz2 = matriz2;
    }
    
    
    
    
    
    public void llenar(){
        for(int i=0;i<=this.matriz.length-1;i++){
                for(int j=0;j<=this.matriz.length-1;j++){
                    this.matriz[i][j]="-";
                    this.matriz2[i][j]="-";
            
        }
        }
    }
    
       public String Mostrar(){
           String capturar="";
        for(int i=0;i<=this.matriz.length-1;i++){
                for(int j=0;j<=this.matriz.length-1;j++){
                      capturar=capturar+String.valueOf("["+this.matriz[i][j]+"]"+""+i+j+"\n");
            
        }

        
        }
        
        
           return capturar;
    }
       
     
    public void Asignar(String evento,String valor){
            Random random = new Random();
         //  int i=random.nextInt(3);
         //  int j=random.nextInt(3);
            
          //  this.matriz2[1][0]="tesoro";
            boolean a=true;
            int fila=0;
            int columna=0;
         while(a){
           fila=random.nextInt(4);
            columna=random.nextInt(4);       
         //   JOptionPane.showMessageDialog(null, fila);
             if(this.Validar(fila, columna,evento).equals("existe")){
                 JOptionPane.showMessageDialog(null, "existe");
                 a=true;
             }else{
                  a=false;
             }
             if(a==false){
                 break;
             }
             
            
             
             
         }
         
      
         this.matriz2[fila][columna]=valor;
            
                 
            
    }
    public String Validar(int fila,int columna,String mensaje){
        String exist="";
        if(this.matriz2[fila][columna].equals(mensaje) ){
 
            exist="existe";
            
        }else{
            exist="no";
        }
        return exist;
    }
    
    
    public boolean Buscando(int fila,int columna){
        
         if(this.matriz2[fila][columna].equals("tesoro")||this.matriz2[fila][columna].equals("mina")){
             return false;
         }else{
             return true;
         }
        
    }
    
    
    public void Jugar(){
       
      this.Asignar("mina","mina");
       this.Asignar("tesoro", "tesoro");
       
  boolean encontrado=true;
  int fil=0;
  int col=0;
  while(encontrado){
      String teclado=JOptionPane.showInputDialog(null,"ingrese posicion"+this.Mostrar());
      fil=Integer.parseInt(String.valueOf(teclado.charAt(0)) );
      col=Integer.parseInt(String.valueOf(teclado.charAt(1)));
      encontrado=this.Buscando(fil, col);
      if(encontrado==false){
          break;
      }
      this.matriz[fil][col]="1";
      
  }
      
  if(this.matriz2[fil][col].equals("tesoro")){
      JOptionPane.showMessageDialog(null, "GANASTE ENCONTRASTE EL TESORO");
  }else {
       if(this.matriz2[fil][col].equals("mina")){
             JOptionPane.showMessageDialog(null, "BOOM");
       }
  }
       
}
    
    }
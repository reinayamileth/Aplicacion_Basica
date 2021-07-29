package programacionoo;
import javax.swing.JOptionPane;
public class telefono {
   private String telefono;
   private double saldo;
   private String marca;
   private double tarifa=0.10;
   //Definiendo los GET y SET de las propiedades
   public String getTelefono(){
       return telefono;
   }
   public void setTelefono(String telefono){
       this.telefono= telefono;
   }
   public double getSaldo(){
       return saldo;
   }
   public void setSaldo(double saldo){
       this.saldo= saldo;
   }
   public String getMarca(){
       return marca;
   }
   public void setMarca(String marca){
       this.marca = marca;
   }
   //fin
   //Definiendo el constructor
   public telefono(){
       this.telefono ="00000000";
       this.saldo = 0.0;
       this.marca= "Sin Marca";
   }
   //Fin del constructor
   public void realizarLlamada(String telefono, int minutos){
       double saldoGastar;
       double nuevoSaldo = this.saldo;
       saldoGastar = minutos * this.saldo;
       if(saldoGastar <= this.saldo){
           nuevoSaldo = nuevoSaldo - saldoGastar;
           this.setSaldo(nuevoSaldo);
           JOptionPane.showMessageDialog(null, "Llamada realizada con exito");
   }else{
           JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
       }
   }  
   public void recargarSaldo(double cantidad){
       double nuevoSaldo;
       nuevoSaldo = this.saldo + cantidad;
       this.setSaldo(nuevoSaldo);
       JOptionPane.showMessageDialog(null, "Saldo cargado con exito");
   }
    public void regalarSaldo(String telefono, double cantidad) {
        double nuevoSaldo;
        nuevoSaldo = this.saldo + cantidad;
        this.setSaldo(nuevoSaldo);
        JOptionPane.showMessageDialog(null, "Saldo Cargado con exito al numero "+ telefono);
    }
    public void cambiarTarifa(double tarifa){
        this.tarifa = tarifa;
        JOptionPane.showMessageDialog(null, "La nueva tarifa es: " + this.tarifa);
    }
}

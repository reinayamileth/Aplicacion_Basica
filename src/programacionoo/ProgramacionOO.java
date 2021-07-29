package programacionoo;
import javax.swing.JOptionPane;
public class ProgramacionOO {
   public static void main(String[] args) {
     telefono objTelefono = new telefono();
     int continuar=1;
     while(continuar==1){
         Object []opciones = {"Comprar Telefono",
             "Recargar Saldo","Regalar Saldo",
             "Hacer Llamada","Cambiar tarifa","Mostrar Informacion","Salir"
         };
     Object opcion = JOptionPane.showInputDialog(null, "Selecciona un color",
             "Elegir",JOptionPane.QUESTION_MESSAGE,null,opciones, opciones[0]);
     switch (opcion.toString()){
         case "Salir":
             continuar = 0;
             break;
         
                case "Comprar Telefono":
                    String Telefono0 = objTelefono.getTelefono();
                    if(Telefono0 != "00000000"){
                        JOptionPane.showMessageDialog(null, "El telefono ya ha sido vendido");
                    }else{
                        String telefono, marca;
                        double valor;
                        telefono = JOptionPane.showInputDialog("Ingresar numero de Telefono");
                        Object [] marcasCel = {
                            "Samsung","Xiaomi","Apple","Huawei","LG",
                            "Motorola"
                        };
                        Object marcaCel = JOptionPane.showInputDialog(null, "Secciona una marca", "Elegir", JOptionPane.QUESTION_MESSAGE,null, marcasCel, marcasCel[0]);
                        marca = marcaCel.toString();
                        switch(marca) {
                            case "Samsung":
                                valor = 555.95;
                                if(!telefono.equals("")){
                                    objTelefono.setTelefono(telefono);
                                    objTelefono.setMarca(marca);
                                    JOptionPane.showMessageDialog(null, "Telefono comprado exitosamente por un valor de " + valor);
                                }
                                break;
                            case "Apple":
                                valor = 999.95;
                                if(!telefono.equals("")){
                                    objTelefono.setTelefono(telefono);
                                    objTelefono.setMarca(marca);
                                    JOptionPane.showMessageDialog(null, "Telefono comprado exitosamente por un valor de " + valor);
                                }
                                break;
                                 case "Xiaomi":
                                valor = 305.35;
                                if(!telefono.equals("")){
                                    objTelefono.setTelefono(telefono);
                                    objTelefono.setMarca(marca);
                                    JOptionPane.showMessageDialog(null, "Telefono comprado exitosamente por un valor de " + valor);
                                }
                                break;
                            case "Huawei":
                                valor = 425.75;
                                if(!telefono.equals("")){
                                    objTelefono.setTelefono(telefono);
                                    objTelefono.setMarca(marca);
                                    JOptionPane.showMessageDialog(null, "Telefono comprado exitosamente por un valor de " + valor);
                                }
                                break;
                            case "LG":
                                valor = 375.95;
                                if(!telefono.equals("")){
                                    objTelefono.setTelefono(telefono);
                                    objTelefono.setMarca(marca);
                                    JOptionPane.showMessageDialog(null, "Telefono comprado exitosamente por un valor de " + valor);
                                }
                                break;
                            case "Motorola":
                                valor = 415.85;
                                if(!telefono.equals("")){
                                    objTelefono.setTelefono(telefono);
                                    objTelefono.setMarca(marca);
                                    JOptionPane.showMessageDialog(null, "Telefono comprado exitosamente por un valor de " + valor);
                                }
                                break;
                            default:
                                break;
                        }    
                    }
                    break;
                case "Recargar Saldo":
                    String telefono = objTelefono.getTelefono();
                    if(telefono != "00000000"){
                      Object [] cantidades = {
                        "1",
                        "2",
                        "3",
                        "5",
                        "10",
                        "15",
                      };
                    Object cantidad = JOptionPane.showInputDialog(null, "Secciona una cantidad", "Elegir", JOptionPane.QUESTION_MESSAGE,null, cantidades, cantidades[0]);
                    String recargarString = cantidad.toString();
                    double recarga = Double.parseDouble(recargarString);
                    objTelefono.recargarSaldo(recarga);  
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe compra un telefono primero para recargar saldo");
                    }                    
                    break;
                case "Regalar Saldo":
                    String telefono1 = objTelefono.getTelefono();
                    if(telefono1 != "00000000"){
                       String numeroTel = JOptionPane.showInputDialog("Ingrese el numero al que quiere regalarle el saldo");
                        if(numeroTel != ""){
                            Object [] regalados = {
                            "1",
                            "2",
                            "5",
                            "10",
                            "15",
                            "20"
                          };
                        Object regalo = JOptionPane.showInputDialog(null, "Seccione una cantidad", "Elegir", JOptionPane.QUESTION_MESSAGE,null, regalados, regalados[0]);
                        String regalarString = regalo.toString();
                        double rgl = Double.parseDouble(regalarString);
                        objTelefono.regalarSaldo(numeroTel,rgl);
                        } 
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe compra un telefono primero para regalar saldo");
                    }                   
                    break;
                case "Hacer Llamada":
                    String telefono4 = objTelefono.getTelefono();
                    if(telefono4 != "00000000"){
                        String telefonoDestino;
                        int minutos;
                        telefonoDestino = JOptionPane.showInputDialog("Numero a llamar");
                        minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos a llamar"));
                        objTelefono.realizarLlamada(telefonoDestino, minutos);
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe compra un telefono primero para hacer llamada");
                    }                    
                    break;
                case "Cambiar tarifa":
                    String telefono2 = objTelefono.getTelefono();
                    if(telefono2 != "00000000"){
                        Object [] tarifas = {
                            "0.10",
                            "0.09",
                            "0.08",
                            "0.07"
                          };
                        Object tarifa = JOptionPane.showInputDialog(null, "Secciona una cantidad", "Elegir", JOptionPane.QUESTION_MESSAGE,null, tarifas, tarifas[0]);
                        String tarifaString = tarifa.toString();
                        double tarifaF = Double.parseDouble(tarifaString);
                        objTelefono.cambiarTarifa(tarifaF);
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe compra un telefono primero para cambiar tarifa");
                    }
                    break;
                case "Mostrar Informacion":                    
                    String numeroT = objTelefono.getTelefono();
                    if(numeroT != "00000000"){
                        String marcaT = objTelefono.getMarca();
                        double saldo = objTelefono.getSaldo();
                        JOptionPane.showMessageDialog(null, "Numero de telefono: "+ numeroT +"\nMarca del telefono: "+marcaT+"\nSaldo disponible: "+saldo);
                    }else{
                        JOptionPane.showMessageDialog(null, "Debe compra un telefono primero mostrar informacion");
                    }                
                    break;
                default:
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "Gracias :D");
    }
    
}

/*
6. Escribe un método, de nombre enviarMensaje, que reciba por parámetro una 
cadena de caracteres correspondiente a una dirección de correo electrónico. 
El método comprobará que la dirección recibida es correcta elevando la excepción
DirCorreoIncorrectaExcepcion en caso contrario. La comprobación consistirá en 
verificar que la dirección contiene el carácter (@), algún carácter después de 
él antes del carácter (.) y algún carácter después de éste
 */
package ejercicios;
class DirCorreoIncorrectaExcepcion extends Exception{
    public DirCorreoIncorrectaExcepcion (String cadena){
        super(cadena);
    }
}
public class Ejercicios06 {
    public static void enviarMensaje(String cadena) throws DirCorreoIncorrectaExcepcion{
        
        if (cadena.contains("@")&& cadena.contains(".")){
            System.out.println("Contiene carácteres especiales");
        }else{
            throw new DirCorreoIncorrectaExcepcion("El correo es incorrecto");
        }
    }
    public static void main(String[] args) {
        try{
        String email = "juansas_hghotmailcom";
        enviarMensaje(email);
        }catch(DirCorreoIncorrectaExcepcion e){
            System.out.println(e.getMessage());
        }
    }
}

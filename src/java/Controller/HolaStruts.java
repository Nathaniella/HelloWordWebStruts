package Controller; 
 
import com.opensymphony.xwork2.ActionSupport; 
import Models.Mensaje; 
 
public class HolaStruts extends ActionSupport { 
 
    private Mensaje mensaje;
   // public static final String SUCCESS = "success";
 
    @Override 
    public String execute() { 
        setMensaje(new Mensaje()); // obtener datos del modelo 
        return SUCCESS; 
    } 
 
    public Mensaje getMensaje() { 
        return mensaje; 
    } 
 
    public void setMensaje(Mensaje mensaje) { 
        this.mensaje = mensaje; 
    } 
}
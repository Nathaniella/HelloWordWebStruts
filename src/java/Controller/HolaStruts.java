/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import com.opensymphony.xwork2.ActionSupport; 
import Models.Mensaje; 
/**
 *
 * @author aplicaciones
 */
public class HolaStruts extends ActionSupport{
    private Mensaje mensaje; 
 
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

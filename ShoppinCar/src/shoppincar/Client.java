/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppincar; 
import java.util.ArrayList;

/**
 *
 * @author aheal
 */
public class Client {
    ArrayList idTour; 
    Integer noOrden;
    String correo, nombre, apellido, telefono;
    
    public void setNoOrden (Integer NoOrder) 
    {
        this.noOrden = NoOrder; 
    }    
    public Integer getNoOrden() 
    {
        return this.noOrden;
    }    
    public void setNombre (String name) 
    {
        this.nombre = name; 
    }  
    public String getNombre() 
    {
        return this.nombre;
    }   
    public void setApellido (String surname) 
    {
        this.apellido = surname; 
    } 
    public String getApellido() 
    {
        return this.apellido;
    } 
    public void setCorreo (String mail) 
    {
        this.correo = mail; 
    } 
    public String getCorreo() 
    {
        return this.correo;
    } 
    public void setTelefono (String cellphone) 
    {
        this.telefono = cellphone; 
    } 
    public String getTelefono() 
    {
        return this.telefono;
    }  
    public void setTours (ArrayList tours) 
    {
        this.idTour = tours; 
    } 
    public ArrayList getTours() 
    {
        return this.idTour;
    }
    
    
}

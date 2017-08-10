/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppincar;

import java.sql.*;

/**
 *
 * @author aleja
 */
public class Items 
{
    Integer id, cantidadTotal, cantidadNinos, cantidadAdultos, precioTotal; 
    String nombreTour; 
    Date fecha; 
    Time hora;
    
    public void setId(Integer identificacion) 
    {
        this.id = identificacion; 
    } 
    public Integer getId() 
    {
        return this.id;
    } 
    public void setCantidad(Integer cantidadTotal) 
    {
        this.cantidadTotal = cantidadTotal; 
    } 
    public Integer getCantidad() 
    {
        return this.cantidadTotal;
    }
    public void setNinos(Integer ninos) 
    {
        this.cantidadNinos = ninos; 
    } 
    public Integer getNinos() 
    {
        return this.cantidadNinos;
    }
}

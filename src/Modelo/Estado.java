/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Coyote
 */
public enum Estado {
PENDIENTE("PENDIENTE"),PARCIAL("PARCIALMENTE RESPONDIDO"),RESPONDIDA("RESPONDIDO");

private Estado(String descripcion){
this.descripcion = descripcion;    
}

private String descripcion;
}

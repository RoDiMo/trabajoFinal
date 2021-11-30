/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 * 
 */

public class Cuadrado implements FiguraGeometrica
{
    /*Atributo tipo numérico que almacena os lados del triángulo*/
    private double lado;
    /*Atributo tipo numérico que almacena os lados del triángulo*/
    private double areaCuadrado;

    
    /**
     * Método constructor de lado
     * @param lado Lado del cuadrado
     * 
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    /**
     * Método de consulta
     * @return Radio del cuadrado
     */
    public double getLado() 
    {
        return lado;
    }
    
     /**
     * Método modificador de lado
     * @param lado Lado del cuadrado
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }

     /**
     * Método de consulta
     * @return Área del cuadrado
     */
    
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}
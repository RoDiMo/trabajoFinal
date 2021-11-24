/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Triangulo implements FiguraGeometrica
{
    
   /*Atributo tipo numérico que almacena la base del triángulo*/
    private double base;
    /*Atributo tipo numérico que almacena la altura del triángulo*/
    private double altura;
     /*Atributo tipo numérico que almacena el área del triángulo*/
    private double areaTriangulo;
    
    
 /**
     * Constructores de la clase
     * @param  base Este parámetro almacena la base del triángulo
     * @param altura Este parámetro almacena la altura del triángulo
     */
    public Triangulo(double base, double altura) 
    {
       
        this.base = base;

        this.altura = altura;
    }

    public double getBase() 
    {
        
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

import java.io.Serializable;

/**
 *
 * @author ESFOT
 */
public class Triangulo implements Serializable, tiposTriangulo{
    private double lado1;
    private double lado2;
    private double lado3;
    private String tipo;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double calcularArea() {
         switch(this.tipo){
            case "Restangulo":
                return (this.lado1*this.lado2)/2;
            case "Isosceles":
                double area =(this.lado2*(Math.sqrt(Math.pow(this.lado1, 2)-(Math.pow(this.lado2, 2)/4))));
                return area/2;    
            case "Escaleno":
                double superficie = (this.lado1+this.lado2+this.lado3)/2;
                return Math.sqrt(superficie*(superficie-this.lado1)*(superficie-this.lado2)*(superficie-this.lado3));
            case "Equilatero":
                return ((Math.sqrt(3)*this.lado1)/2)*Math.pow(this.lado1, 2);
            default:
                return 0;
         }
    }

    @Override
    public double calcularPerimetro() {
        switch(this.tipo){
            case "Restangulo":
                 return this.lado1+this.lado2+this.lado3;
            case "Isosceles":
                 return (2*this.lado1)+this.lado2;    
            case "Escaleno":
                 return this.lado1+this.lado2+this.lado3;
            case "Equilatero":
                 return 3*this.lado1;
            default:
                return 0;
         }
    }

    @Override
    public double calcularAltura() {
        switch(this.tipo){
            case "Restangulo":
                 return (this.lado1*this.lado2)/this.lado3;
            case "Isosceles":
                 return Math.sqrt(Math.pow(this.lado1, 2)-(Math.pow(this.lado2, 2)/4));    
            case "Escaleno":
                double superficie = (this.lado1+this.lado2+this.lado3)/2;
                double area =Math.sqrt(superficie*(superficie-this.lado1)*(superficie-this.lado2)*(superficie-this.lado3));
                 return (2/this.lado1)*area;
            case "Equilatero":
                 return (Math.sqrt(3)*this.lado1)/2;
            default:
                return 0;
         }
    }

}

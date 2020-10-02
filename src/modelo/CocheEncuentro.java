/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 * 
 * @author Josue Emmanuel Medina Garcia
 */
public class CocheEncuentro extends Coche{

    public CocheEncuentro(double x, double x1, double v, double v1, double a, double a1) {
        super(x, x1, v, v1, a, a1);
    }
    
    public double posicion() {
        return super.getX() + super.getV()*tiempo() + (super.getA()*Math.pow(tiempo(), 2))/2;
    }
    
    public double posicion1() {
        return super.getX1() - super.getV1()*tiempo() - (super.getA1()*Math.pow(tiempo(), 2))/2;
    }
    
    public double velocidad() {
        return super.getV() + super.getA()*tiempo();
    }
    
    public double velocidad1() {
        return (super.getV1() + super.getA1()*tiempo())*-1;
    }

    @Override
    public double tiempo() {
        return (-1*(super.getV()+super.getV1())+Math.sqrt((Math.pow((super.getV()+super.getV1()), 2)-(2*((super.getA()+super.getA1())*(super.getX()-super.getX1()))))))/(super.getA()+super.getA1());
    }
}

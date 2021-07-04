/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasInheritance;

/**
 *
 * @author LAB313-PC27
 */
public class Lingkaran extends BangunDatar {
    double phi,r1,r2;
    
    public Lingkaran(double phi, double r1,double r2){
        this.phi=phi;
        this.r1=r1;
        this.r2=r2;
    }
    public Lingkaran(){
        this.phi=this.r1=this.r2=0;
    }
    @Override
    public double luas(){
        super.luas();
        return phi*r1*r2;
    }
    
    @Override
    public double keliling(){
        super.keliling();
        return 2*phi*r1;
    }
}
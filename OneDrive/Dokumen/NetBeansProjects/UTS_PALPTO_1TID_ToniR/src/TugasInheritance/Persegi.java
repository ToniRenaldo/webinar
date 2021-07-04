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
public class Persegi extends BangunDatar {
    double sisi1,sisi2;
    
    public Persegi(double sisi1, double sisi2){
        this.sisi1=sisi1;
        this.sisi2=sisi2;
    }
    public Persegi(){
        this.sisi1=this.sisi2=0;
    }
    @Override
    public double luas(){
        super.luas();
        return sisi1*sisi2;
    }
    
    @Override
    public double keliling(){
        super.keliling();
        return 4*sisi1;
    }
}

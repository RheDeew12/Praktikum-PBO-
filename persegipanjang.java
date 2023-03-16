/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;

/**
 *
 * @author MSI MODERN
 */
public class persegipanjang implements menghitungbidang{
    
    private double panjang;
    private double lebar;
    
    public persegipanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    //getter enkapsulasi untuk panjang dan lebarnya
    public double getPanjang() {
        return panjang;
    }
    
    public double getLebar() {
        return lebar;
    }

    //setter enkapsulasi untuk panjang dan lebarnya
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double MenghitungLuas() {
        return (panjang * lebar);
    }

    @Override
    public double MenghitungKeliling() {
        return  (2 * (panjang + lebar)) ;
    }
}

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
public class lingkaran implements menghitungbidang{
    private double jari2;
    
    public lingkaran(double jarijari) {
        this.jari2 = jarijari;
    }
    
    //getter enkapsulasi untuk jari2
    public double getjarijari() {
        return jari2;
    }

    //setter enkapsulasi untuk jari2
    public void settinggiTabung(double jarijari) {
        this.jari2 = jarijari;
    }
    
    @Override
    public double MenghitungLuas() {
        return (Math.PI * jari2 * jari2);
    }

    @Override
    public double MenghitungKeliling() {
        return (2 * Math.PI * jari2);
    }
}

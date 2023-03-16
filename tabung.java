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
public class tabung extends lingkaran implements menghitungruang{
    
    private double TinggiTbg;
    
    public tabung(double jarijari, double tinggiTabung){
        super(jarijari);
        this.TinggiTbg = tinggiTabung;
    }
    
    //getter enkapsulasi untuk TinggiTbg
    public double gettinggiTabung() {
        return TinggiTbg;
    }

    //setter enkapsulasi untuk TinggiTbg
    public void settinggiTabung(double tinggiTabung) {
        this.TinggiTbg = tinggiTabung;
    }
    
    @Override
    public double menghitungvolume() {
        return (Math.PI * (super.getjarijari() * super.getjarijari()) * TinggiTbg);
        //menggunakan super untuk mengambil atribut private dari parent/induknya
    }

    @Override
    public double menghitungluaspermukaan() {
        return (2 * super.MenghitungLuas() + MenghitungKeliling()) * TinggiTbg;
        //menggunakan super untuk mengambil atribut private dari parent/induknya
    }
    
} 
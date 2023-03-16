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
public class balok extends persegipanjang implements menghitungruang{
  
    private double tinggi;
    
    public balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    //getter enkapsulasi untuk tinggi
    public double gettinggi() {
        return tinggi;
    }

    //setter enkapsulasi untuk tinggi
    public void settinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double menghitungvolume() {
        return (super.getPanjang() * super.getLebar()) * tinggi;
        //menggunakan super untuk mengambil atribut private dari parent/induknya
    }

    @Override
    public double menghitungluaspermukaan() {
        return (2 * (super.getPanjang() * super.getLebar() + super.getPanjang()) * tinggi + super.getLebar() * tinggi);
        //menggunakan super untuk mengambil atribut private dari parent/induknya
    }
}

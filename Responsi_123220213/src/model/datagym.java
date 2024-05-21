/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class datagym {
    private String NamaPemilik;
    private String NamaAlat;
    private String NomorTelepon;
    private Double WaktuSewa;
    private Double BiayaSewa;
    
    public String getNamaPemilik(){
        return NamaPemilik;
    }
    public void setNamaPemilik(String NamaPemilik){
        this.NamaPemilik = NamaPemilik;
    }
    public String getNamaAlat(){
        return NamaAlat;
    }
    public void setNamaAlat(String NamaAlat){
        this.NamaAlat = NamaAlat;
    }
    public String getNomorTelepon(){
        return NomorTelepon;
    }
    public void setNomorTelepon(String NomorTelepon){
        this.NomorTelepon = NomorTelepon;
    }
    public Double getWaktuSewa(){
        return WaktuSewa;  
    }
    public void setWaktuSewa(Double WaktuSewa){
        this.WaktuSewa = WaktuSewa;
    }
    public Double calculateBiayaSewa(){
        return ( this.WaktuSewa) * 25.000 ;
    }
    public void setBiayaSewa(Double BiayaSewa){
        this.BiayaSewa = BiayaSewa;
    }
}

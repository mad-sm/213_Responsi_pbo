/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.util.List;
import java.util.ArrayList;
import DAOdatagym.datagymDAO;
import DAOimplement.datagymimplement;
import model.*;
impor view.MainView;

/**
 *
 * @author Lab Informatika
 */
public class datagymcontroller {
    MainView frame;
    datagymimplement impladatagym;
    List<datagym> dagym;
    
    public datagymcontroller(MainView frame){
        this.frame = frame;
        impldatagym = new datagymDAO();
        dagym = impladatagym.getALL();
    
    }
    
    public void isitabel(){
        dagym = impladatagym.getALL();
        modeltabeldatagym mp = new modeltabeldatagym(dagym);
        frame.getTabelDataGym().setModel(mp;
        
    }
    
    public void insert(){
        datagym dagym = new datagym();
        dagym.setNamaPemilik(frame.getNamaPemilik().getText());
        dagym.setNamaAlat(String.parseString(frame.getNamaAlat().getText()));
        dagym.setNomorTelepon(String.parseString(frame.getNomorTelepon().getText()));
        dagym.setWaktuSewa(Double.parseDouble(frame.getWaktuSewa().getText()));
        dagym.setBiayaSewa(dagym.calculateBiayaSewa());
        impladatagym.insert(dagym);
        
    }
    
    public void update(){
        datagym dagym = new datagym();
        dagym.setNamaPemilik(frame.getNamaPemilik().getText());
        dagym.setNamaAlat(String.parseString(frame.getNamaAlat().getText()));
        dagym.setNomorTelepon(String.parseString(frame.getNomorTelepon().getText()));
        dagym.setWaktuSewa(Double.parseDouble(frame.getWaktuSewa().getText()));
        dagym.setBiayaSewa(dagym.calculateBiayaSewa());
        impladatagym.update(dagym);
    }
    
    public void delete(){
       String NamaPemilik = frame.getNamaPemilik().getText();
       impladatagym.delete(NamaPemilik);   
    }
}

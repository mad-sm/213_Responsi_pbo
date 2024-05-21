/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdatagym;

import java.sql.*;
import java.util.*;
import connect.connector;
import model.*;
import DAOimplement.datagymimplement;
import java.util.logging.Level;
import java.util.logging.logger;


/**
 *
 * @author Lab Informatika
 */
public class datagymDAO implements datagymimplement {
    connection connection;
    
    final String select = "select * from gym;";
    final String insert = "INSERT INTO gym (NamaPemilik, NamaAlat, NomorTelepon, WaktuSewa, BiayaSewa) VALUES (?, ?, ?, ?, ?,);*";
   final String update = "update gym set NamaAlat=?, NomorTelepon=?, WaktuSewa=?, BiayaSewa=?"
    
}

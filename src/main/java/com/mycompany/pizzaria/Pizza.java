package com.mycompany.pizzaria;

import Classes.Sabor;
import Classes.Tamanho;

public class Pizza {
    Sabor sabor;
    Tamanho tamanho;
    
    private static final String DB_URL = "jdbc:mysql://localhost:8080/pizzaria";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public Pizza(Sabor sabor, Tamanho tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
    }
    
    public Sabor getSabor(){
        return this.sabor;
    }
    public Tamanho getTamanho(){
        return this.tamanho;
    }
    
    public double getTotal(){
        return (Double.parseDouble(tamanho.ReadFrom(tamanho._id)[2]) * Double.parseDouble(sabor.ReadFrom(sabor._id)[2]));
    }
}

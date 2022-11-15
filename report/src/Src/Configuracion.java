package Src;


import java.io.FileReader;
import java.io.FileWriter;

import java.util.Properties;


public class Configuracion {
    private static String config = "src/config/config.properties";
    public static boolean estado;
    public static boolean Leer(){
        try{
            var mrProp = new Properties();
            mrProp.load(new FileReader(config));
            estado = Boolean.parseBoolean( mrProp.getProperty("Online","true"));
            return estado;
        }catch(Exception e){
            return true;
        }
    }
    
    public static void Escribir(String cambio){
        
        try{
            Configuracion.estado = Boolean.parseBoolean(cambio);
            var mrProp = new Properties();
            mrProp.load(new FileReader(config));
            mrProp.setProperty("Online",cambio);
            mrProp.store(new FileWriter(config), "no hay cambios");
        }catch(Exception e){
            
        }
    }
}

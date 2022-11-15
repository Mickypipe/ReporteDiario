package mySql;

import Src.Configuracion;
import Src.Configuracion;
import java.sql.Connection;
import java.sql.DriverManager;


public class myConnection {

    public static Connection cn;
    
    
    private static boolean Connect(){
        String aux ;
        Connection conexion = null;
        try{ 
        Class.forName("com.mysql.cj.jdbc.Driver");
        if(Configuracion.estado){
          aux = "jdbc:sqlserver://vtx.database.windows.net:1433;database=vtxOper;user=usuario@vtx;password=Vertex2022;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
          conexion = DriverManager.getConnection(aux);
        }else{
            aux = "jdbc:mysql://localhost:3306/vtxtestoffline";
            String user = "root";
            String pass = "root";
            conexion = DriverManager.getConnection(aux,user,pass);
        }
       
            }catch(Exception e){
                System.out.println(e.getMessage());
               
                return false;
            }
            cn = conexion;
           
            return true;
        
    }
    
    public static boolean Test(){
        try{
            if(cn == null){
                return Connect();
            }else if(!cn.isValid(30)){
                return Connect();
            }{
                return true;
            }
        }catch(Exception e){
            System.out.println("error en myConnection, metodo Test()");
            return false;
        }
    }
}

package mySql;

import java.sql.Connection;
import java.sql.DriverManager;

public class myConnection {

    public static Connection cn;
    
    private static String user;
    private static String pass;
    private static String msg ="";
    
    public static void setUser(String user) {
        myConnection.user = user;
    }

    public static void setPass(String pass) {
        myConnection.pass = pass;
    }
    
    public static String getMsg() {
        return msg;
    }
    
    private static boolean Connect(){
        if(user != null && user.length() >= 1 && pass != null && pass.length() >= 1){
            Connection conexion = null;
            try{ 
                Class.forName("com.mysql.cj.jdbc.Driver");
                String aux = "jdbc:sqlserver://vtx.database.windows.net:1433;database=vtxOper;user="+user+"@vtx;password="+pass+";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
                conexion = DriverManager.getConnection(aux);
            }catch(Exception e){
                System.out.println(e.getMessage());
                msg = e.getMessage();
                return false;
            }
            cn = conexion;
            msg = "Correcto";
            return true;
        }else{
            return false;   
        }
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

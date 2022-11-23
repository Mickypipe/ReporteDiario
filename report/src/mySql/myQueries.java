package mySql;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class myQueries {
    public static boolean Usuario(String user,String pass){
        if(myConnection.Test()){
            String sql = "SELECT " +
                        " correo " +
                        "  FROM rrhh " +
                        "  where correo = '"+user+"' and password = '"+pass+"'";
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    return true;
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return false;
        }
        return false;
    }
    
    //codigos de proyectos y sus nombres
    public static ArrayList<String[]> Proyecto(){
        if(myConnection.Test()){
            String sql = "SELECT cod_proyecto , nombre_proyecto from proyecto where estado = 'Activo'";
            ArrayList<String[]> retorno = new ArrayList();
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    String[] aux = new String[2];
                    aux[0] = rso.getString(1);
                    aux[1] = rso.getString(2);
                    retorno.add(aux);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return null;
    }
    //cod de chimenea de tabla chimenea
    public static String Chimenea(String id){
        if(myConnection.Test()){
            String sql;
           
                sql = "SELECT cod_chimenea FROM registro_turno where id_registro = '" +id+ "'";
            
            String retorno = "";
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getString(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return null;
    }
    //consulta de serie de tabla Equipos
    public static ArrayList<String> Equipo(String proyecto){
        if(myConnection.Test()){
            String sql = "SELECT serie from equipo where cod_proyecto = '"+proyecto+"'";
            ArrayList<String> retorno = new ArrayList();
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno.add(rso.getString(1));
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return null;
    }
    
    public static String Mandante(String where){
        if(myConnection.Test()){
            String sql = "SELECT cod_chimenea_mandante from chimenea where cod_chimenea = '"+where+"'";
            String retorno = "";
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getString(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return "";
    }
    public static String Metodologia(String where){
        if(myConnection.Test()){
            String sql = "SELECT metodologia from chimenea where cod_chimenea = '"+where+"'";
            String retorno = "";
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getString(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return "";
    }
    public static String Mina(String where){
        if(myConnection.Test()){
            String sql = "SELECT nombre_mina from chimenea where cod_chimenea = '"+where+"'";
            String retorno = "";
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getString(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return "";
    }
    public static int Comprobacion(String turnoA,String turnoB,String chimenea){
        if(myConnection.Test()){
            String sql = "SELECT count(*) from registro_turno where id_registro in ('"+turnoA+"','"+turnoB+"') and cod_chimenea = '"+chimenea+"'";
            int retorno = 0;
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getInt(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return 0;
    }
     public static ArrayList<String[]> Perforacion(String turno,String letra){
        if(myConnection.Test()){
            String sql = " SELECT '"+letra+"',a.descripcion,p.estado,p.hora_i,p.hora_f "
                       + " from registro_perforacion p left join actividad a on (p.cod_actividad = a.cod_actividad) "
                       + " where id_registro = '"+turno+"' ";
            ArrayList<String[]> retorno = new ArrayList();
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    String[] aux = new String[5];
                    aux[0] = rso.getString(1);
                    aux[1] = rso.getString(2);
                    aux[2] = rso.getString(3);
                    aux[3] = rso.getString(4);
                    aux[4] = rso.getString(5);
                    retorno.add(aux);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return null;
    }
     public static String Comentario(String turno,String letra){
        if(myConnection.Test()){
            String sql =    " SELECT comentario FROM registro_turno " +
                            " where id_registro = '"+turno+"' ";
            String retorno = letra;
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                
                while (rso.next()){
                    retorno+= rso.getString(1);
                } 
                if(rso.getRow() == 0 ){
                     retorno+="Sin comentarios";
                }
                if(!retorno.endsWith(".")){
                    retorno+=".";
                }
                retorno+=".";
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return null;
    }
    public static ArrayList<String[]> Tarea(String turno,String letra){
        if(myConnection.Test()){
            String sql = "SELECT '"+letra+"',a.descripcion,t.nombre,r.hora_i,r.hora_f "
                       + " from registro_tarea r left join actividad a on (r.cod_actividad = a.cod_actividad) "
                       + " left join tarea t on (r.cod_tarea = t.cod_tarea) "
                       + " where id_registro = '"+turno+"' ";
            ArrayList<String[]> retorno = new ArrayList();
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    String[] aux = new String[5];
                    aux[0] = rso.getString(1);
                    aux[1] = rso.getString(2);
                    aux[2] = rso.getString(3);
                    aux[3] = rso.getString(4);
                    aux[4] = rso.getString(5);
                    retorno.add(aux);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());}
            return retorno;
        }
        return null;
    }
    public static Map<String, double[]> Turnos(String turnoA,String turnoB){
        if(myConnection.Test()){
            String sql = "SELECT 	t.detale_informe " +
            " ,sum(case r.id_registro when '"+turnoA+"' then " +
            " case when datediff(minute,r.hora_i,r.hora_f) < 0 then " +
            " datediff(minute,r.hora_i,r.hora_f)+1440 else datediff(minute,r.hora_i,r.hora_f) end " +
            " else 0 end)/60.0 " +
            " ,sum(case r.id_registro when '"+turnoB+"' then " +
            " case when datediff(minute,r.hora_i,r.hora_f) < 0 then " +
            " datediff(minute,r.hora_i,r.hora_f)+1440 else datediff(minute,r.hora_i,r.hora_f) end " +
            " else 0 end)/60.0 " +
            " FROM tarea t left join registro_tarea  r on(t.cod_tarea=r.cod_tarea) " +
            " group by t.detale_informe ";
            Map<String, double[]> dictionary = new HashMap<>();

            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    double[] turnos = new double[2];
                    
                    turnos[0] = rso.getDouble(2);
                    turnos[1] = rso.getDouble(3);
                    
                    dictionary.put(rso.getString(1), turnos);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return dictionary;
        }
        return null;
    }
    public static Map<String, double[]> TurnosWhere(String turno,String where,String fecha){
        if(myConnection.Test()){
            String sql =    " SELECT t.detale_informe " +
                            " ,sum(case when r.id_registro like '"+turno+"' and turno.cod_chimenea = '"+where+"' then" +
                            " case when datediff(minute,r.hora_i,r.hora_f) < 0 then " +
                            " datediff(minute,r.hora_i,r.hora_f)+1440 else datediff(minute,r.hora_i,r.hora_f) end " +
                            " else 0 end)/60.0 " +
                            " FROM tarea t left join registro_tarea  r on(t.cod_tarea=r.cod_tarea) " +
                            " left join registro_turno turno on (turno.id_registro=r.id_registro) " +
                            " where turno.fecha<='"+fecha+"' " +
                            " group by t.detale_informe ";
            Map<String, double[]> dictionary = new HashMap<>();

            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    double[] turnos = new double[1];
                    turnos[0] = rso.getDouble(2);
                    dictionary.put(rso.getString(1), turnos);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return dictionary;
        }
        return null;
    }
    public static double[] Metros(String turno,String fecha,String where){
        if(myConnection.Test()){
            String sql =    " SELECT  sum(r.piloto),sum(r.escariador) FROM registro_perforacion r" +
                            " left join registro_turno t on (r.id_registro=t.id_registro) " +
                            " where estado = 'terminado' and r.id_registro like '"+turno+"' and t.fecha <= '"+fecha+"' and t.cod_chimenea = '"+where+"'";
            double[] retorno = new double[2];
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno[0] = rso.getDouble(1);
                    retorno[1] = rso.getDouble(2);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return null;
    }
    
     public static int Cuenta(String turno,String where,String fecha){
        if(myConnection.Test()){
            String sql =    " SELECT  count(*) FROM  " +
                            " registro_turno  " +
                            " where id_registro like '"+turno+"' and fecha <= '"+fecha+"' and cod_chimenea = '"+where+"' ";
            int retorno = 0;
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getInt(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return 0;
    }
    public static double[] Horometro(String turno,String equipo){
        if(myConnection.Test()){
            String sql =    "select " +
                            "    horometro_inicial,horometro_final " +
                            "from registro_equipo " +
                            "WHERE id_registro = '"+turno+"' and serie = '"+equipo+"' ";
            double[] retorno = new double[2];
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno[0] = rso.getDouble(1);
                    retorno[1] = rso.getDouble(2);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return null;
    }
     public static double HorometroRedTrackIni(String turno){
        if(myConnection.Test()){
            String sql =    "select  " +
                            "horometro_inicial " +
                            "from registro_equipo " +
                            "WHERE id_registro = '"+turno+"' and serie LIKE '%RT%' ";
            double retorno = 0.0;
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getDouble(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return 0.0;
    }
     public static double HorometroRedTrackFin(String turno){
        if(myConnection.Test()){
            String sql =    "select  " +
                            "horometro_final " +
                            "from registro_equipo " +
                            "WHERE id_registro = '"+turno+"' and serie LIKE '%RT%' ";
            double retorno = 0.0;
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getDouble(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return 0.0;
    }
     public static double HorometroAuxiliarIni(String turno){
        if(myConnection.Test()){
            String sql =    "select " +
                            "    a.horometro_inicial " +
                            "from registro_equipo a " +
                            "JOIN equipo b on a.serie=b.serie " +
                            "WHERE a.id_registro = '"+turno+"' and b.categoria = 'EQUIPO AUXILIAR'";
            double retorno = 0.0;
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getDouble(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return 0.0;
    }
    public static double HorometroAuxiliarFin(String turno){
        if(myConnection.Test()){
            String sql =    "select " +
                            "    a.horometro_final " +
                            "from registro_equipo a " +
                            "JOIN equipo b on a.serie=b.serie " +
                            "WHERE a.id_registro = '"+turno+"' and b.categoria = 'EQUIPO AUXILIAR'";
            double retorno = 0.0;
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getDouble(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return 0.0;
    }
    public static String Personal(String turno,String where){
        if(myConnection.Test()){
            String sql =    "select " +
                            "CONCAT(b.nombre,' ',b.a_paterno) as nombre " +
                            "from registro_rrhh a " +
                            "JOIN rrhh b ON a.rut=b.rut " +
                            "WHERE a.id_registro = '"+turno+"' and b.cargo = '"+where+"'";
            String retorno = "";
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno = rso.getString(1);
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return "";
    }
    public static ArrayList<String> PersonalAsistente(String turno,String where){
        if(myConnection.Test()){
            String sql =    "select " +
                            "CONCAT(b.nombre,' ',b.a_paterno) as nombre " +
                            "from registro_rrhh a " +
                            "JOIN rrhh b ON a.rut=b.rut " +
                            "WHERE a.id_registro = '"+turno+"' and b.cargo = '"+where+"'";
            ArrayList<String> retorno = new ArrayList<>();
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                while (rso.next()){
                    retorno.add(rso.getString(1));
                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return null;
    }
    public static Map<String, double[]> Mes(String proyecto,String fecha){
        if(myConnection.Test()){
            String sql =    "select\n" +
                            "    c.class_informe,\n" +
                            "    case\n" +
                            "        when c.class_informe = 'interferencia' then\n" +
                            "        sum(iif(a.hora_f>a.hora_i,(cast(DATEDIFF(mi,a.hora_i,a.hora_f) as float)/60),(cast(DATEDIFF(mi,a.hora_i,a.hora_f) as float)/60)+24))\n" +
                            "        when c.class_informe = 'perforacion' then\n" +
                            "        sum(iif(a.hora_f>a.hora_i,(cast(DATEDIFF(mi,a.hora_i,a.hora_f) as float)/60),(cast(DATEDIFF(mi,a.hora_i,a.hora_f) as float)/60)+24))\n" +
                            "        when c.class_informe = 'produccion' then\n" +
                            "        (\n" +
                            "            select\n" +
                            "            sum(iif(a.hora_f>a.hora_i,(cast(DATEDIFF(mi,a.hora_i,a.hora_f) as float)/60),(cast(DATEDIFF(mi,a.hora_i,a.hora_f) as float)/60)+24))\n" +
                            "            from registro_tarea a\n" +
                            "            join registro_turno b on a.id_registro = b.id_registro\n" +
                            "            join tarea c on a.cod_tarea = c.cod_tarea\n" +
                            "            WHERE a.id_registro LIKE '%"+proyecto+"%' and b.fecha BETWEEN DATEFROMPARTS(YEAR('"+fecha+"'),MONTH('"+fecha+"'),1) and '"+fecha+"' and c.class_informe in ('interferencia','perforacion')\n" +
                            "        )\n" +
                            "    end as total\n" +
                            "from registro_tarea a\n" +
                            "join registro_turno b on a.id_registro = b.id_registro\n" +
                            "join tarea c on a.cod_tarea = c.cod_tarea\n" +
                            "WHERE a.id_registro LIKE '%"+proyecto+"%' and b.fecha BETWEEN DATEFROMPARTS(YEAR('"+fecha+"'),MONTH('"+fecha+"'),1) and '"+fecha+"'\n" +
                            "group by c.class_informe";
            Map<String, double[]> retorno = new HashMap<>();
            try{
                Statement sto;
                sto = myConnection.cn.createStatement();
                ResultSet rso = sto.executeQuery(sql);
                
                while (rso.next()){
                    double[] aux = new double[1];
                    aux[0] = rso.getFloat(2);
                    retorno.put(rso.getString(1), aux) ;

                } 
            }catch(SQLException e){System.out.println(e.getMessage());
            }
            return retorno;
        }
        return null;
    }
}

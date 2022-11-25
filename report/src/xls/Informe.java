
package xls;

import java.util.ArrayList;
import java.util.Map;

public class Informe {
    
    public boolean perforacion;
    public String proyecto;
    public String descripcion;
    public String equipo;
    public String faena;
    public String chimenea;
    public String fechaInforme;
    
    public double[][] horometro;
    public double[] horometroRedTrax;
    public double[] horometroAuxiliar;
    
    public Map<String, double[]> tareasDia;
    public double[] tareasMes;
    public double[] tareasTotal;
    
    public double[] metrosPiloto;
    public double[] metrosEscariado;
    
    public String[] personalA;
    public String[] personalB;
    
    public int[] countHorasPersonal;
    
    public int countPersonalA;
    public int countPersonalB;
    
    public Informe(boolean perforacion){
        this.perforacion = perforacion;
        tareasMes = new double[3];
        tareasTotal = new double[3];
        
        metrosPiloto = new double[5];
        metrosEscariado = new double[5];
        
        horometro = new double[2][2];
        horometroRedTrax = new double[3];
        horometroAuxiliar = new double[3];
        
        personalA = new String[5];
        personalB = new String[5];
        
        countHorasPersonal = new int[6];
        for (int i = 0; i < countHorasPersonal.length; i++) {
            countHorasPersonal[i]=0;
        }
        countPersonalA=0;
        countPersonalB=0;
    }
    public void Personal(String personal,boolean turnoA,int posicion){
        int suma = 1;
        if(personal.equals("")){
            suma = 0;
        }
        if(turnoA){
            personalA[posicion] = personal;
            countPersonalA+=suma;
        }else{
            personalB[posicion] = personal;
            countPersonalB+=suma;
        }
            countHorasPersonal[posicion]+=suma*12;
            countHorasPersonal[5]+=suma*12;
    }
}

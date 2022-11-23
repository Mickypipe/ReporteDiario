
package xls;

import java.util.ArrayList;
import java.util.Map;

public class Informe {
    
    private ArrayList<String> codProyecto;
    private String sug="";
    
    private String comentarioA;
    private String comentarioB;
    
    private String[] head;
    private Map<String, double[]> turnos;
    private Map<String, double[]> turnosMes;
    private Map<String, double[]> turnosTotal;
    
    private double[] metrosPiloto;
    private double[] metrosEscariado;

    private int countTotal;
    private int countMes;
    
    double[][] horometro;
    double[] horometroRedTrax;
    
    double[] horometroAuxiliar;
    
    String[][] personalA;
    String[][] personalB;
}

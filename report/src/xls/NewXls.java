
package xls;

import java.awt.Desktop;
import java.io.File;
import java.awt.Desktop;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class NewXls {
   
    public static void Creation(boolean perforacion){
         try{
            FileInputStream in;
            if(perforacion){
                in = new FileInputStream("Src/xls/template.xlsx");
            }else{
                in = new FileInputStream("Src/xls/Blindaje.xlsx");
            }  
            XSSFWorkbook book = new XSSFWorkbook(in);
            FileOutputStream out = new FileOutputStream("Src/xls/Informe.xlsx");
            book.write(out);
            in.close();
            out.close();
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void Fill(File file,Informe datos){
        try{
            FileInputStream in = new FileInputStream("Src/xls/Informe.xlsx");

            XSSFWorkbook book = new XSSFWorkbook(in);
            XSSFSheet page = book.getSheetAt(0);
           
            page.getRow(7).getCell(4).setCellValue(datos.proyecto);
            page.getRow(8).getCell(4).setCellValue(datos.descripcion);
            page.getRow(9).getCell(4).setCellValue(datos.equipo);
            page.getRow(7).getCell(9).setCellValue(datos.faena);
            page.getRow(8).getCell(9).setCellValue(datos.chimenea);
            page.getRow(9).getCell(9).setCellValue(datos.fechaInforme);
          
            double[] produccion;
            double[] efectivas;
            if(datos.perforacion){
            produccion=multyFill(page,datos.tareasDia,20,14,34,58,datos.tareasTotal[0],datos.tareasMes[0],true);
            multyFill(page,datos.tareasDia,37,18,55,59,datos.tareasTotal[1],datos.tareasMes[1],false);
            efectivas=multyFill(page,datos.tareasDia,67,7,74,60,datos.tareasTotal[2],datos.tareasMes[2],false);
            }else{  
            produccion=multyFill(page,datos.tareasDia,20,14,34,59,datos.tareasTotal[0],datos.tareasMes[0],true);
            multyFill(page,datos.tareasDia,37,19,56,60,datos.tareasTotal[1],datos.tareasMes[1],false);
            efectivas=multyFill(page,datos.tareasDia,68,4,72,61,datos.tareasTotal[2],datos.tareasMes[2],false);
            }
             
            int suma = 1;
            if(datos.perforacion){
                suma =0;
            }
            page.getRow(61+suma).getCell(5).setCellValue(datos.metrosPiloto[0]);
            page.getRow(61+suma).getCell(6).setCellValue(datos.metrosPiloto[1]);
            page.getRow(61+suma).getCell(7).setCellValue(datos.metrosPiloto[2]);
            page.getRow(61+suma).getCell(8).setCellValue(datos.metrosPiloto[3]);
            page.getRow(61+suma).getCell(10).setCellValue(datos.metrosPiloto[4]);
            
            page.getRow(62+suma).getCell(5).setCellValue(datos.metrosEscariado[0]);
            page.getRow(62+suma).getCell(6).setCellValue(datos.metrosEscariado[1]);
            page.getRow(62+suma).getCell(7).setCellValue(datos.metrosEscariado[2]);
            page.getRow(62+suma).getCell(8).setCellValue(datos.metrosEscariado[3]);
            page.getRow(62+suma).getCell(10).setCellValue(datos.metrosEscariado[4]);
            
            page.getRow(19).getCell(10).setCellValue(datos.horometro[0][0]);
            page.getRow(19).getCell(11).setCellValue(datos.horometro[0][1]);
            
            page.getRow(20).getCell(10).setCellValue(datos.horometro[1][0]);
            page.getRow(20).getCell(11).setCellValue(datos.horometro[1][1]);
                 
            if(datos.perforacion){
                page.getRow(23).getCell(10).setCellValue(datos.horometroRedTrax[0]);
                page.getRow(24).getCell(10).setCellValue(datos.horometroRedTrax[1]);
                page.getRow(25).getCell(10).setCellValue(datos.horometroRedTrax[2]);

                page.getRow(30).getCell(10).setCellValue(datos.horometroAuxiliar[0]);
                page.getRow(31).getCell(10).setCellValue(datos.horometroAuxiliar[1]);
                page.getRow(32).getCell(10).setCellValue(datos.horometroAuxiliar[2]);
            }else{
                page.getRow(23).getCell(10).setCellValue(datos.horometroAuxiliar[0]);
                page.getRow(24).getCell(10).setCellValue(datos.horometroAuxiliar[1]);
                page.getRow(25).getCell(10).setCellValue(datos.horometroAuxiliar[2]);
            }
            
            
            suma = -2;
            if(datos.perforacion){
                suma =0;
            }
            page.getRow(77+suma).getCell(5).setCellValue(datos.personalA[0]);
            page.getRow(78+suma).getCell(5).setCellValue(datos.personalA[1]);
            page.getRow(79+suma).getCell(5).setCellValue(datos.personalA[2]);
            page.getRow(80+suma).getCell(5).setCellValue(datos.personalA[3]);
            page.getRow(81+suma).getCell(5).setCellValue(datos.personalA[4]);
            
            page.getRow(77+suma).getCell(6).setCellValue(datos.personalB[0]);
            page.getRow(78+suma).getCell(6).setCellValue(datos.personalB[1]);
            page.getRow(79+suma).getCell(6).setCellValue(datos.personalB[2]);
            page.getRow(80+suma).getCell(6).setCellValue(datos.personalB[3]);
            page.getRow(81+suma).getCell(6).setCellValue(datos.personalB[4]);
            
            page.getRow(82+suma).getCell(5).setCellValue(datos.countPersonalA);
            page.getRow(82+suma).getCell(6).setCellValue(datos.countPersonalB);

            for (int i = 0; i < 6; i++) {
                page.getRow(77+i+suma).getCell(7).setCellValue(datos.countHorasPersonal[i]);
            }
            
            suma = 1;
            if(datos.perforacion){
                suma =0;
            }
            for(int i= 5,a = 0;i<10 ;i++ , a++){
                if(i==9){
                    i++;
                }
                double vAux1;
                if(efectivas[a]!=0){
                    vAux1 = (datos.metrosPiloto[a]+datos.metrosEscariado[a])/efectivas[a];
                }else{
                    vAux1 =0;
                }
                page.getRow(63+suma).getCell(i).setCellValue(vAux1);
                double vAux2;
                if(produccion[a]!=0){
                    vAux2 = efectivas[a]/produccion[a];
                }else{
                    vAux2 = 0;
                }
                page.getRow(64+suma).getCell(i).setCellValue(vAux2);
            }
           
           
           
           
            book.write(new FileOutputStream("Src/xls/Informe.xlsx"));
            
            
            if(!file.toString().equals("")){
            FileOutputStream out = new FileOutputStream(file.toString());
            book.write(out);
            out.close();
            Desktop.getDesktop().open(file);
            }
            
            book.close();
            in.close();
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private static double[] multyFill(XSSFSheet page,Map<String, double[]> turnos,int inicio, int total,int ultimo,int representa,double tot,double mes,boolean resta){
        double a = 0;
        double b = 0;
        double dia = 0;
        
        for (int i = 0; i < total; i++) {
            if(turnos.get(page.getRow(inicio+i).getCell(2).getStringCellValue())!=null){
                double valorA = turnos.get(page.getRow(inicio+i).getCell(2).getStringCellValue())[0];
                if(valorA!=0){
                    page.getRow(inicio+i).getCell(5).setCellValue(valorA);}
                a+=valorA;
                double valorB = turnos.get(page.getRow(inicio+i).getCell(2).getStringCellValue())[1];
                if(valorB!=0){
                    page.getRow(inicio+i).getCell(6).setCellValue(valorB);}
                b+=valorB;
                double valorC = valorA+valorB;
                if(valorC!=0){
                    page.getRow(inicio+i).getCell(7).setCellValue(valorC);}
                dia+=valorC;

            }
        }
        double[] r = new double[5];
        if(resta){
            page.getRow(ultimo).getCell(5).setCellValue(12.0-a);
            page.getRow(ultimo).getCell(6).setCellValue(12.0-b);
            page.getRow(ultimo).getCell(7).setCellValue(24.0-dia);
            page.getRow(representa).getCell(5).setCellValue(12.0-a);
            page.getRow(representa).getCell(6).setCellValue(12.0-b);
            page.getRow(representa).getCell(7).setCellValue(24.0-dia);
            r[0] = 12-a;
            r[1] = 12-b;
            r[2] = 24-dia;
        }else{
            page.getRow(ultimo).getCell(5).setCellValue(a);
            page.getRow(ultimo).getCell(6).setCellValue(b);
            page.getRow(ultimo).getCell(7).setCellValue(dia);
            page.getRow(representa).getCell(5).setCellValue(a);
            page.getRow(representa).getCell(6).setCellValue(b);
            page.getRow(representa).getCell(7).setCellValue(dia);
            r[0] = a;
            r[1] = b;
            r[2] = dia;
        }
            page.getRow(representa).getCell(8).setCellValue(tot);
            page.getRow(representa).getCell(10).setCellValue(mes);
            r[3] = tot;
            r[4] = mes;   
        return r;
    }

}

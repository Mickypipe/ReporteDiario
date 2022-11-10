
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
   
    public static void Creation(){
         try{
            FileInputStream in = new FileInputStream("Src/xls/template.xlsx");
            XSSFWorkbook book = new XSSFWorkbook(in);
            FileOutputStream out = new FileOutputStream("Src/xls/Informe.xlsx");
            book.write(out);
            in.close();
            out.close();
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public static void Fill(File file,String[] head , Map<String, double[]> turnos,float[] turnosMes,Map<String, double[]> turnosTotal,double[] piloto,double[] escariado,int countMes,int countTotal,String comA,String comB,double[][] horometro,double[] horometroRedTrax,double[] horometroAuxiliar,String[][] personal){
        try{
            FileInputStream in = new FileInputStream("Src/xls/Informe.xlsx");
            XSSFWorkbook book = new XSSFWorkbook(in);
            XSSFSheet page = book.getSheetAt(0);
            
            page.getRow(7).getCell(4).setCellValue(head[0]);
            page.getRow(8).getCell(4).setCellValue(head[1]);
            page.getRow(9).getCell(4).setCellValue(head[2]);
            page.getRow(7).getCell(9).setCellValue(head[3]);
            page.getRow(8).getCell(9).setCellValue(head[4]);
            page.getRow(9).getCell(9).setCellValue(head[5]);

            multyFill(page,turnos,turnosMes[2],turnosTotal,20,14,34,58,true,countMes,countTotal);
            multyFill(page,turnos,turnosMes[0],turnosTotal,37,18,55,59,false,0,0);
            multyFill(page,turnos,turnosMes[1],turnosTotal,67,7,74,60,false,0,0);
            
            page.getRow(85).getCell(2).setCellValue(comA);
            page.getRow(92).getCell(2).setCellValue(comB);
            
            page.getRow(61).getCell(5).setCellValue(piloto[0]);
            page.getRow(61).getCell(6).setCellValue(piloto[1]);
            page.getRow(61).getCell(7).setCellValue(piloto[2]);
            page.getRow(61).getCell(8).setCellValue(piloto[3]);
            page.getRow(61).getCell(10).setCellValue(piloto[4]);
            
            page.getRow(62).getCell(5).setCellValue(escariado[0]);
            page.getRow(62).getCell(6).setCellValue(escariado[1]);
            page.getRow(62).getCell(7).setCellValue(escariado[2]);
            page.getRow(62).getCell(8).setCellValue(escariado[3]);
            page.getRow(62).getCell(10).setCellValue(escariado[4]);
            
            page.getRow(19).getCell(10).setCellValue(horometro[0][0]);
            page.getRow(19).getCell(11).setCellValue(horometro[0][1]);
            
            page.getRow(20).getCell(10).setCellValue(horometro[1][0]);
            page.getRow(20).getCell(11).setCellValue(horometro[1][1]);
                    
            page.getRow(23).getCell(10).setCellValue(horometroRedTrax[0]);
            page.getRow(24).getCell(10).setCellValue(horometroRedTrax[1]);
            page.getRow(25).getCell(10).setCellValue(horometroRedTrax[2]);
            
            page.getRow(30).getCell(10).setCellValue(horometroAuxiliar[0]);
            page.getRow(31).getCell(10).setCellValue(horometroAuxiliar[1]);
            page.getRow(32).getCell(10).setCellValue(horometroAuxiliar[2]);
            
            
            page.getRow(77).getCell(5).setCellValue(personal[0][0]);
            page.getRow(78).getCell(5).setCellValue(personal[0][1]);
            page.getRow(79).getCell(5).setCellValue(personal[0][2]);
            page.getRow(80).getCell(5).setCellValue(personal[0][3]);
            page.getRow(81).getCell(5).setCellValue(personal[0][4]);
            
            page.getRow(77).getCell(6).setCellValue(personal[1][0]);
            page.getRow(78).getCell(6).setCellValue(personal[1][1]);
            page.getRow(79).getCell(6).setCellValue(personal[1][2]);
            page.getRow(80).getCell(6).setCellValue(personal[1][3]);
            page.getRow(81).getCell(6).setCellValue(personal[1][4]);
            int cuenta=0;
            for (int i = 0; i < 5; i++) {
                if(personal[0][i].equals("")){
                    cuenta++;
                }
            }
            page.getRow(82).getCell(5).setCellValue(5-cuenta);
            cuenta=0;
            for (int i = 0; i < 5; i++) {
                if(personal[1][i].equals("")){
                    cuenta++;
                }
            }
            page.getRow(82).getCell(6).setCellValue(5-cuenta);
            
            int total=0;
            
            for (int i = 0; i < 5; i++) {
                cuenta = 0;
                if(personal[0][i].equals("")){
                    cuenta++;
                }
                if(personal[1][i].equals("")){
                    cuenta++;
                }
                total+=cuenta;
                page.getRow(77+i).getCell(7).setCellValue((2-cuenta)*12);
            }
            page.getRow(82).getCell(7).setCellValue((10-total)*12);
            
            double aux;
            
            for(int i= 5,a = 0;i<10 ;i++ , a++){
                if(i==9){
                    i++;
                }
                if(page.getRow(60).getCell(i).getNumericCellValue()!=0){
                    aux = (piloto[a]+escariado[a])/page.getRow(60).getCell(i).getNumericCellValue();
                }else{
                    aux = 0;
                }
                page.getRow(63).getCell(i).setCellValue(aux);
            }
            for(int i= 5;i<10 ;i++){
                if(i==9){
                    i++;
                }
                if(page.getRow(58).getCell(i).getNumericCellValue()!=0){
                    aux = page.getRow(60).getCell(i).getNumericCellValue()/page.getRow(58).getCell(i).getNumericCellValue();
                }else{
                    aux = 0;
                }
                page.getRow(64).getCell(i).setCellValue(aux);
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
    private static void multyFill(XSSFSheet page,Map<String, double[]> turnos,float turnosMes,Map<String, double[]> turnosTotal,int inicio, int total,int ultimo,int representa,boolean resta,int countMes,int countTotal){
        double a = 0;
        double b = 0;
        double dia = 0;
        double turMes = 0;
        double turTotal =0;
        
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

                if(turnosTotal.get(page.getRow(inicio+i).getCell(2).getStringCellValue())!=null){
                     turTotal+= turnosTotal.get(page.getRow(inicio+i).getCell(2).getStringCellValue())[0];
                }
            }
        }
        if(resta){
            page.getRow(ultimo).getCell(5).setCellValue(12.0-a);
            page.getRow(ultimo).getCell(6).setCellValue(12.0-b);
            page.getRow(ultimo).getCell(7).setCellValue(24.0-dia);
            page.getRow(representa).getCell(5).setCellValue(12.0-a);
            page.getRow(representa).getCell(6).setCellValue(12.0-b);
            page.getRow(representa).getCell(7).setCellValue(24.0-dia);
            page.getRow(representa).getCell(8).setCellValue(12.0*countTotal-turTotal);
            page.getRow(representa).getCell(10).setCellValue(turnosMes);
        }else{
            page.getRow(ultimo).getCell(5).setCellValue(a);
            page.getRow(ultimo).getCell(6).setCellValue(b);
            page.getRow(ultimo).getCell(7).setCellValue(dia);
            page.getRow(representa).getCell(5).setCellValue(a);
            page.getRow(representa).getCell(6).setCellValue(b);
            page.getRow(representa).getCell(7).setCellValue(dia);
            page.getRow(representa).getCell(8).setCellValue(turTotal);
            page.getRow(representa).getCell(10).setCellValue(turnosMes);
        }
       

        
    }

}

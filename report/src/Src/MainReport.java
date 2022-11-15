package Src;

import java.util.Locale;


public class MainReport {
    
    private static User user;
    private static Report report;
    private static Window window;
    private static Config config;
    
    public static void main(String[] args) {
      Configuracion.Leer();
      Locale.setDefault(new Locale("es", "ES"));
      user = new User();
      window = new Window();
      window.Panel(user);
      window.setVisible(true);
      
    }
    public static void PanelTwo(int panel){
        switch(panel){
            case 0:
                user = new User();
                window.Panel(user);
                break;
            case 1:
                report = new Report();
                window.Panel(report);
                break;
            case 2:
                config = new Config();
                window.Panel(config);
                break;
                
        }
        
    }
    
}

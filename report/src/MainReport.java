
import java.util.Locale;
import mySql.myConnection;


public class MainReport {
    
    private static User user;
    private static Report report;
    private static Window window;
    
    public static void main(String[] args) {
      Locale.setDefault(new Locale("es", "ES"));
      user = new User();
      window = new Window();
      window.Panel(user);
      window.setVisible(true);

    }
    public static void PanelTwo(){
        report = new Report();
        window.Panel(report);
    }
    
}

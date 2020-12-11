
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.net.URL;
import javax.swing.ImageIcon;


public class TrayClass {
    
    static TrayIcon trayIcon;
    public TrayClass(){
        show();
    }
    public static void show(){
        if(!SystemTray.isSupported()){
            System.exit(0);
        }
        trayIcon = new TrayIcon(createIcon("/src/iconfinder_graduation-square-academic-cap-school_2824450.png", "Icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        try{
            tray.add(trayIcon);
        }catch(Exception ex){
           System.out.println(ex);
        }
    }
    
    protected static Image createIcon(String path,String desc){
        URL imageURL =TrayClass.class.getResource(path);
        return (new ImageIcon(imageURL, desc)).getImage();
        
    }
}

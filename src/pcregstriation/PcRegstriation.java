
package pcregstriation;
import javax.swing.*;
public class PcRegstriation {

    
    public static void main(String[] args) {
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
           System.out.println("errore");
        } catch (InstantiationException ex) {
             System.out.println("errore");
        } catch (IllegalAccessException ex) {
              System.out.println("errore");
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             System.out.println("errore");
        }
        SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        login log = new login();
                        log.setVisible(true);
                    	
                    }
               
				
                });
        
        
    }
    
}

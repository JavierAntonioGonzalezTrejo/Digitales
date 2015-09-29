package digitales.principal;
/**
 *
 * @author Punto Crítiko
 */
public class Principal extends javax.swing.JFrame {

    /**
     * param args the command line arguments
     */
public Principal()
{
     	setResizable(false);
        
        this.setLocationRelativeTo(null);   
}
    public static void main(String[] args) {
        // TODO code application logic here      
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });

    }

}
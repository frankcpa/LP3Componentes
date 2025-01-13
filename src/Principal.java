import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{
    private JPanel jpanelPrincipal;
    private JTextField textFieldNome;
    private JPanel Principal;
    private JLabel jLabelTitulo;
    private JLabel jLabelNome;
    private JButton buttonEnviar;

    public Principal(){
        this.setTitle("teste");
        this.setContentPane(jpanelPrincipal);
        this.setSize(640,480);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textFieldNome.getText();
                JOptionPane.showInputDialog(null,texto);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

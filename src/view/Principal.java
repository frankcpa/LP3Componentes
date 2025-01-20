package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame{
    private JMenuBar menuBar;
    private JPanel panel1;

    public Principal(){
        criacaoDoMenu();
        this.setTitle("Sistema - Escola nova CB");
        this.setContentPane(panel1);
        this.setSize(640,480);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void criacaoDoMenu(){
        this.setJMenuBar(menuBar);
        JMenu arquivo = new JMenu("Arquivo");
        JMenuItem opcao1 = new JMenuItem("Opção 1");
        JMenuItem opcao2 = new JMenuItem("Opção 2");
        arquivo.add(opcao1);
        arquivo.add(opcao2);
        JMenu manterAluno = new JMenu("Manter Alunos");
        JMenuItem cadastro = new JMenuItem("Cadastrar");
        JMenuItem editar = new JMenuItem("Edição");
        manterAluno.add(cadastro);
        manterAluno.add(editar);
        menuBar.add(arquivo);
        menuBar.add(manterAluno);
        cadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroDeAluno();
            }
        });
    }
}

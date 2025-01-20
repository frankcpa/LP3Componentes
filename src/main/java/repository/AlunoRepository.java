package repository;

import model.AlunoModel;
import net.bytebuddy.asm.Advice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

public class AlunoRepository {
    private static AlunoRepository instance;
    protected EntityManager entityManager;

    public AlunoRepository() {
        entityManager = getEntityManager();
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("crudHibernatePU");
        if (entityManager == null) {
            entityManager = factory.createEntityManager();
        }
        return entityManager;
    }

    public static AlunoRepository getInstance() {
        if (instance == null) {
            instance = new AlunoRepository();
        }
        return instance;
    }

    public String salvar(AlunoModel aluno) throws SQLException {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(aluno);
            entityManager.getTransaction().commit();
            return "Salvo com Sucesso.";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    public void buscarTodos() {
        try {
            List<AlunoModel> alunos = entityManager.createQuery("from AlunoModel").getResultList();

            JOptionPane.showMessageDialog(null, alunos.toString());
        }catch (Exception e){

        }
    }

    public void remover(int id){
        AlunoModel aluno;
        try {
            aluno = entityManager.find(AlunoModel.class, id);
            entityManager.getTransaction().begin();
            entityManager.remove(aluno);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

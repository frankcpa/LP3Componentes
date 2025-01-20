package controller;

import model.AlunoModel;
import repository.AlunoRepository;
import java.sql.SQLException;

public class AlunoController {
    private AlunoRepository alunoRepository = new AlunoRepository();

    public String salvar (AlunoModel aluno) throws SQLException {
        return alunoRepository.salvar(aluno);
    }
}

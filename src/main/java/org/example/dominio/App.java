package org.example.dominio;
import org.example.dominio.Aluno;
import org.example.dominio.Curso;
import org.example.dominio.InscricaoCurso;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Curso curso = new Curso();

        curso.setNome("Técnicas de Programação");
        curso.setDuracao(6L);

        InscricaoCurso inscricaoCurso = new InscricaoCurso();
        inscricaoCurso.setCurso(curso);
        inscricaoCurso.setDataInicioCurso(LocalDate.now());

        aluno.setInscricaoCursoList(new ArrayList<>());
        aluno.getInscricaoCursoList().add(inscricaoCurso);
        aluno.setMatricula("A3369J8");
        aluno.setNome("Jessica Maia");
        LocalDate localDataNascimento = LocalDate.of(1994, 9, 15);
        aluno.setDataNascimento(
                Date.from(
                        localDataNascimento.atStartOfDay()
                                .atZone(ZoneId.systemDefault())
                                .toInstant()));
        System.out.println(aluno.apresentar());


        LocalDateTime.now(ZoneId.of("Europe/Paris"));

    }
}


// System.out.println(ZonaId.getAvailableZoneIds());
// System.out.println(LocalDate.new());
// System.out.println(LocalDateTime.new());

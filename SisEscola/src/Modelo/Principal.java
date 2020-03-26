package Modelo;
public class Principal {

    public static void main (String[] args)
    {
    Aluno aluno = new Aluno();
    aluno.nome = "Breno";
    aluno.email = "breno.morais@senaimt.edu.br";
    aluno.telefone = "(69) 999999-999";
    aluno.validaNome(aluno.nome);
    }
     
}
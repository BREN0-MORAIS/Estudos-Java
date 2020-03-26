package Modelo;
public class Aluno {

String nome ;
String email;
String telefone;
protected int idade;


boolean validaNome(String nome)
{

    return nome.isEmpty();
}
}

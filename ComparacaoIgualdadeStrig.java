/**
 * Escreva a descrição da classe es aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class ComparacaoIgualdadeStrig {
    public static void main(String[] args) {
    String string1 = "Fundamentos";
    String string2 = "Fundamentos1";
    System.out.println("São iguais ? (case sensitive)");
    System.out.println(string1.equals(string2) ? "sim" : "não");
    System.out.println("São iguais? (sem case sensitive)");
    System.out.println(string1.equalsIgnoreCase(string2) ? "sim" : "nao");
}
}
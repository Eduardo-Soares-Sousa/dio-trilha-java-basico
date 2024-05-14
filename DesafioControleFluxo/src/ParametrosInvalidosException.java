/**
 * Exceção lançada quando o primeiro parâmetro for maior que o segundo parâmetro.
 */
public class ParametrosInvalidosException extends RuntimeException{
    /**
    * Cria uma nova exceção com uma mensagem padrão.
    * A mensagem padrão é: "O segundo parâmetro deve ser maior que o primeiro".
    */
    public ParametrosInvalidosException(){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

    /**
    * Cria uma nova exceção com a mensagem especificada.
    * @param mensagem A mensagem de erro específica para esta exceção.
    */
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}

import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPF implements IDocumento{

    //FIXME Excesso de comentários. A intenção seria esclarecer as regras para validação do documento.
    //FIXME Utilizar método estático. Utilização da interface apenas para exemplo.
    //Forma de validação feita apenas para treinamento. A utilização de uma API (ex. Stella) seria mais factível.

    @Override
    public Boolean validaDocumento(String cpf) {

        Boolean cpfValido;

        // identifica se o cpf não possui uma sequência de números repetidos
        // ou menos de 11 caracteres, tornando inválido
        String regex = "(?!(\\d)\\1{10})\\d{11}";
        Pattern pat = Pattern.compile (regex);
        Matcher mat = pat.matcher (cpf);

        if (!mat.matches()){
            cpfValido = false;
            return cpfValido;
        }

        char digito10, digito11;
        int somaParcelas, contador, restoDivisao, numero, peso;

        try {
            // cálculo do primeiro dígito verificador
            somaParcelas = 0;
            peso = 10;
            for (contador=0; contador<9; contador++) {
                // converte o i-esimo caractere do cpf em um número
                // 48 é a posição de 0 na tabela ASCII
                numero = (int)(cpf.charAt(contador) - 48);
                somaParcelas = somaParcelas + (numero * peso);
                peso = peso - 1;
            }

            restoDivisao = 11 - (somaParcelas % 11);
            if ((restoDivisao == 10) || (restoDivisao == 11))
                digito10 = '0';
            // converte no respectivo caractere numérico
            else digito10 = (char)(restoDivisao + 48);

            // cálculo do segundo dígito verificador
            somaParcelas = 0;
            peso = 11;
            for(contador=0; contador<10; contador++) {
                numero = (int)(cpf.charAt(contador) - 48);
                somaParcelas = somaParcelas + (numero * peso);
                peso = peso - 1;
            }

            restoDivisao = 11 - (somaParcelas % 11);
            if ((restoDivisao == 10) || (restoDivisao == 11))
                digito11 = '0';
            else digito11 = (char)(restoDivisao + 48);

            // verifica se os dígitos calculados conferem com os dígitos informados
            if ((digito10 == cpf.charAt(9)) && (digito11 == cpf.charAt(10)))
                cpfValido = true;
            else cpfValido = false;
        } catch (InputMismatchException erro) {
            cpfValido = false;
        }
        return cpfValido;
    }
}

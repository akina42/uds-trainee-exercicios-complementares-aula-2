import java.util.InputMismatchException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CNPJ implements IDocumento {


    //FIXME Excesso de comentários. A intenção seria esclarecer as regras para validação do documento.
    //FIXME Utilizar método estático. Utilização da interface apenas para exemplo.
    //Forma de validação feita apenas para treinamento. A utilização de uma API (ex. Stella) seria mais factível.

    @Override
    public Boolean validaDocumento(String cnpj) {
        Boolean cnpjValido;


        // identifica se o cnpj não possui uma sequência de números repetidos
        // ou menos de 14 caracteres, tornando inválido
        String regex = "(?!(\\d)\\1{13})\\d{14}";
        Pattern pat = Pattern.compile (regex);
        Matcher mat = pat.matcher (cnpj);

        if (!mat.matches()){
            cnpjValido = false;
            return cnpjValido;
        }

        char digito13, digito14;
        int somaParcelas, contador, restoDivisao, numero, peso;

        try {
            // cálculo do primeiro dígito verificador
            somaParcelas = 0;
            peso = 2;
            for (contador=11; contador>=0; contador--) {
                // converte o i-esimo caractere do cnpj em um número
                // 48 é a posição de 0 na tabela ASCII
                numero = (int)(cnpj.charAt(contador) - 48);
                somaParcelas = somaParcelas + (numero * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            restoDivisao = somaParcelas % 11;
            if ((restoDivisao == 0) || (restoDivisao == 1))
                digito13 = '0';
            else digito13 = (char)((11-restoDivisao) + 48);

            // cálculo do segundo dígito verificador
            somaParcelas = 0;
            peso = 2;
            for (contador=12; contador>=0; contador--) {
                numero = (int)(cnpj.charAt(contador)- 48);
                somaParcelas = somaParcelas + (numero * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            restoDivisao = somaParcelas % 11;
            if ((restoDivisao == 0) || (restoDivisao == 1))
                digito14 = '0';
            else digito14 = (char)((11-restoDivisao) + 48);

            // verifica se os dígitos calculados conferem com os dígitos informados
            if ((digito13 == cnpj.charAt(12)) && (digito14 == cnpj.charAt(13)))
                cnpjValido = true;
            else cnpjValido = false;
        } catch (InputMismatchException erro) {
            cnpjValido = false;
        }
        return cnpjValido;
    }

}

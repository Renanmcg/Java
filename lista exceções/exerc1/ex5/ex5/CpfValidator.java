package ex5;

public class CpfValidator {
    public static boolean validarCPF(String cpf) throws CpfInvalidoException {
        cpf = cpf.replaceAll("[^0-9]", ""); // Remove caracteres não numéricos

        if (cpf.length() != 11) {
            throw new CpfInvalidoException("O CPF deve conter 11 dígitos.");
        }

        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = Character.getNumericValue(cpf.charAt(i));
        }

        if (!validarDigitosVerificadores(digitos)) {
            throw new CpfInvalidoException("CPF inválido.");
        }

        return true;
    }

    private static boolean validarDigitosVerificadores(int[] digitos) {
        int soma1 = 0;
        int soma2 = 0;

        for (int i = 0; i < 9; i++) {
            soma1 += digitos[i] * (10 - i);
            soma2 += digitos[i] * (11 - i);
        }

        int primeiroDigitoVerificador = (soma1 * 10) % 11;
        int segundoDigitoVerificador = (soma2 * 10) % 11;

        // Aplicando as regras para os dígitos verificadores
        if (primeiroDigitoVerificador == 10) {
            primeiroDigitoVerificador = 0;
        }
        if (segundoDigitoVerificador == 10) {
            segundoDigitoVerificador = 0;
        }

        // Calculando os dígitos verificadores corretos
        int digitoVerificador1Calculado = 11 - (soma1 % 11);
        int digitoVerificador2Calculado = 11 - (soma2 % 11);

        // Verificando se os dígitos calculados são iguais aos informados no CPF
        return primeiroDigitoVerificador == digitoVerificador1Calculado && segundoDigitoVerificador == digitoVerificador2Calculado;
    }
}


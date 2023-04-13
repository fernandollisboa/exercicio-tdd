
package project;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    public void testCalculaSalarioLiquidoDesenvolvedorAbaixoDe3000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 2999.00, Cargo.DESENVOLVEDOR);
        double salarioEsperado = funcionario.getSalarioBase() * 0.9;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoDesenvolvedorAcimaDe3000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 3001.00, Cargo.DESENVOLVEDOR);
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        double salarioEsperado = funcionario.getSalarioBase() * 0.8;
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoDesenvolvedorIgualA3000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 3000.00, Cargo.DESENVOLVEDOR);
        double salarioEsperado = funcionario.getSalarioBase() * 0.8;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoDBAAbaixoDe2000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 1999.00, Cargo.DBA);
        double salarioEsperado = funcionario.getSalarioBase() * 0.85;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoDBAAcimaDe2000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 2001.00, Cargo.DBA);
        double salarioEsperado = funcionario.getSalarioBase() * 0.75;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoDBAIgualA2000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 2000.00, Cargo.DBA);
        double salarioEsperado = funcionario.getSalarioBase() * 0.75;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoTestadorAbaixoDe2000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 1999.00, Cargo.TESTADOR);
        double salarioEsperado = funcionario.getSalarioBase() * 0.85;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoTestadorAcimaDe2000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 2001.00, Cargo.TESTADOR);
        double salarioEsperado = funcionario.getSalarioBase() * 0.75;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoTestadorIgualA2000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 2000.00, Cargo.TESTADOR);
        double salarioEsperado = funcionario.getSalarioBase() * 0.75;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoGerenteAbaixoDe5000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 4999.00, Cargo.GERENTE);
        double salarioEsperado = funcionario.getSalarioBase() * 0.8;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoGerenteAcimaDe5000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 5001.00, Cargo.GERENTE);
        double salarioEsperado = funcionario.getSalarioBase() * 0.7;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

    @Test
    public void testCalculaSalarioLiquidoGerenteIgualA5000() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@email.com", 5001.00, Cargo.GERENTE);
        double salarioEsperado = funcionario.getSalarioBase() * 0.7;
        double salarioLiquido = calculadora.calculaSalarioLiquido(funcionario);
        assertEquals(salarioEsperado, salarioLiquido, 0.1);
    }

}
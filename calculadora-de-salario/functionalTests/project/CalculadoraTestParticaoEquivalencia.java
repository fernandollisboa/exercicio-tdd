package project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraTestParticaoEquivalencia {

    Calculadora calculadora = new Calculadora();
    
    @Test
    public void PE1() {
        float salario = 2500.00f;
        float descontoPercentagem = 0.10f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void PE2() {
        float salario = 3500.00f;
        float descontoPercentagem = 0.20f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void PE3() {
        float salario = -1.0f;
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        }); 
    }
    
    @Test
    public void PE4() {
        float salario = 1500.00f;
        float descontoPercentagem = 0.15f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void PE5() {
        float salario = 2500.00f;
        float descontoPercentagem = 0.25f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void PE6() {
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", -1.00f, Cargo.DBA);
        assertThrows(IllegalArgumentException.class, () -> calculadora.calculaSalarioLiquido(funcionario));
    }

    @Test
    public void PE7() {
        float salario = 1500.00f;
        float descontoPercentagem = 0.15f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void PE8() {
        float salario = 2500.00f;
        float descontoPercentagem = 0.25f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void PE9() {
        float salario = -1.0f;
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        }); 
    }
    
    @Test
    public void PE10() {
        float salario = 4000.00f;
        float descontoPercentagem = 0.2f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void PE11() {
        float salario = 6000.00f;
        float descontoPercentagem = 0.3f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void PE12() {
        float salario = -1.0f;
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
        }); 
    }
       
}

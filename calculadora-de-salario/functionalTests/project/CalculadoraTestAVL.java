package project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraTestAVL {

    Calculadora calculadora = new Calculadora();

    @Test
    public void AVL1() {
        float salario = -1.0f;
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        });
    }

    @Test
    public void AVL2() {
        float salario = 0;
        float descontoPercentagem = 0.1f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }

    @Test
    public void AVL3() {
        float salario = 0;
        float descontoPercentagem = 0.1f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }

    @Test
    public void AVL4() {
        float salario = 2999.99f;
        float descontoPercentagem = 0.1f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }

    @Test
    public void AVL5() {
        float salario = 3000;
        float descontoPercentagem = 0.2f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }

    @Test
    public void AVL6() {
        float salario = 3000;
        float descontoPercentagem = 0.2f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }

    @Test
    public void AVL7() {
        float salario = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
        });
    }
    
    @Test
    public void AVL8() {
        float salario = 0;
        float descontoPercentagem = 0.15f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL9() {
        float salario = 0.01f;
        float descontoPercentagem = 0.15f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL10() {
        float salario = 1999.99f;
        float descontoPercentagem = 0.15f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL11() {
        float salario = 2000;
        float descontoPercentagem = 0.25f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL12() {
        float salario = 2000.01f;
        float descontoPercentagem = 0.25f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario =
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }

    @Test
    public void AVL13() {
        float salario = -1.0f;
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        });
    }
    
    @Test
    public void AVL14() {
        float salario = 0.0f;
        float salarioEsperado = 0.0f;
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL15() {
        float salario = 0.01f;
        float descontoPercentagem = 0.15f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL16() {
        float salario = 1999.99f;
        float descontoPercentagem = 0.15f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL17() {
        float salario = 2000.0f;
        float descontoPercentagem = 0.25f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL18() {
        float salario = 2000.01f;
        float descontoPercentagem = 0.25f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
        
    @Test
    public void AVL19() {
        float salario = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
        });
    }
    
    @Test
    public void AVL20() {
        float salario = 0.0f;
        float salarioEsperado = salario;
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL21() {
        float salario = 0.01f;
        float descontoPercentagem = 0.2f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL22() {
        float salario = 4999.99f;
        float descontoPercentagem = 0.2f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL23() {
        float salario = 5000.0f;
        float descontoPercentagem = 0.3f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
    
    @Test
    public void AVL24() {
        float salario = 7000.0f;
        float descontoPercentagem = 0.3f;
        float salarioEsperado = salario - (salario * descontoPercentagem);
        Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
        assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
    }
}

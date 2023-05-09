package project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculadoraTestTabelaDecisao {

  Calculadora calculadora = new Calculadora();

  @Test
  public void TD1() {
    float salario = -1.0f;
    assertThrows(IllegalArgumentException.class, () -> {
        new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DESENVOLVEDOR);
    });
  }

  @Test
  public void TD2() {
      float salarioBase = 1500f;
      float salarioEsperado = salarioBase * 0.9f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.DESENVOLVEDOR);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
  }

  @Test
  public void TD3() {
      float salarioBase = 2500f;
      float salarioEsperado = salarioBase * 0.9f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.DESENVOLVEDOR);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
  }

  @Test
  public void TD4() {
      float salarioBase = 4000f;
      float salarioEsperado = salarioBase * 0.8f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.DESENVOLVEDOR);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
  }

  @Test
  public void TD5() {
      float salarioBase = 6000f;
      float salarioEsperado = salarioBase * 0.8f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.DESENVOLVEDOR);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001);
  }

  @Test
  public void TD6() {
    float salario = -1.0f;
    assertThrows(IllegalArgumentException.class, () -> {
        new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.TESTADOR);
    });
  }

  @Test
  public void TD7() {
      float salarioBase = 1500;
      float salarioEsperado = salarioBase * 0.85f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.TESTADOR);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  } 

  @Test
  public void TD8() {
      float salarioBase = 2500;
      float salarioEsperado = salarioBase * 0.75f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.TESTADOR);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  } 

  @Test
  public void TD9() {
      float salarioBase = 4500;
      float salarioEsperado = salarioBase * 0.75f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.TESTADOR);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  }
  
  @Test
  public void TD10() {
      float salarioBase = 6000;
      float salarioEsperado = salarioBase * 0.75f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.TESTADOR);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  }

  @Test
  public void TD11() {
    float salario = -1.0f;
    assertThrows(IllegalArgumentException.class, () -> {
        new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.DBA);
    });
  }

  @Test
  public void TD12() {
      float salarioBase = 1500;
      float salarioEsperado = salarioBase * 0.85f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.DBA);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  } 

  @Test
  public void TD13() {
      float salarioBase = 2500;
      float salarioEsperado = salarioBase * 0.75f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.DBA);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  } 

  @Test
  public void TD14() {
      float salarioBase = 4500;
      float salarioEsperado = salarioBase * 0.75f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.DBA);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  }
  
  @Test
  public void TD15() {
      float salarioBase = 6000;
      float salarioEsperado = salarioBase * 0.75f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.DBA);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  }

  @Test
  public void TD16() {
    float salario = -1.0f;
    assertThrows(IllegalArgumentException.class, () -> {
        new Funcionario("Fernando", "fernando@teste.com", salario, Cargo.GERENTE);
    });
  }

  @Test
  public void TD17() {
      float salarioBase = 1500;
      float salarioEsperado = salarioBase * 0.8f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.GERENTE);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  } 

  @Test
  public void TD18() {
      float salarioBase = 2500;
      float salarioEsperado = salarioBase * 0.8f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.GERENTE);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  } 

  @Test
  public void TD19() {
      float salarioBase = 4500;
      float salarioEsperado = salarioBase * 0.8f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.GERENTE);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  }
  
  @Test
  public void TD20() {
      float salarioBase = 6000;
      float salarioEsperado = salarioBase * 0.7f;
      Funcionario funcionario = new Funcionario("Fernando", "fernando@teste.com", salarioBase, Cargo.GERENTE);
      assertEquals(salarioEsperado, calculadora.calculaSalarioLiquido(funcionario), 0.001f);
  }

}

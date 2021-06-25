package com.newton.tests;

import com.newton.resources.Deque;

public class DequeTest {
  Deque dequeVector;

  public DequeTest() {
    this.dequeVector = new Deque();
  }

  public void execute() {
    dequeVector.inserirInicio(1);
    dequeVector.inserirFim(2);
    dequeVector.inserirInicio(3);
    dequeVector.inserirInicio(5);
    dequeVector.inserirFim(4);

    dequeVector.mostrar();

    dequeVector.removerInicio();

    dequeVector.mostrar();

    dequeVector.removerFim();

    dequeVector.mostrar();

    if (dequeVector.isEmpty()) {
      System.out.println("O deque está vazio");
    } else {
      System.out.println("O deque não está vazio");
    }

    System.out.println("Primeiro elemento: " + dequeVector.first());
    System.out.println("Ultimo elemento: " + dequeVector.last());

    dequeVector.removerFim();
    dequeVector.removerFim();
    dequeVector.removerFim();

    dequeVector.mostrar();

    if (dequeVector.isEmpty()) {
      System.out.println("O deque está vazio");
    } else {
      System.out.println("O deque não está vazio");
    }

    System.out.println("Primeiro elemento: " + dequeVector.first());
  }
}

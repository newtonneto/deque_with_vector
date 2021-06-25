package com.newton.resources;

import com.newton.exceptions.DequeVazioException;
import com.newton.interfaces.IDeque;
import java.util.Vector;

public class Deque implements IDeque {
  private Vector dequeStack;

  public Deque() {
    this.dequeStack = new Vector();
  }

  @Override
  public void inserirInicio(Object o) {
    this.dequeStack.add(0, o);
  }

  @Override
  public void inserirFim(Object o) {
    this.dequeStack.add(o);
  }

  @Override
  public Object removerInicio() throws DequeVazioException {
    if (this.isEmpty()) {
      throw new DequeVazioException("Exception: Deque vazio :(");
    } else {
      Object element = this.dequeStack.remove(0);

      return element;
    }
  }

  @Override
  public Object removerFim() throws DequeVazioException {
    if (this.isEmpty()) {
      throw new DequeVazioException("Exception: Deque vazio :(");
    } else {
      Object element = this.dequeStack.remove(this.size() - 1);

      return element;
    }
  }

  @Override
  public Object first() throws DequeVazioException {
    if (this.isEmpty()) {
      throw new DequeVazioException("Exception: Deque vazio :(");
    } else {
      return this.dequeStack.firstElement();
    }
  }

  @Override
  public Object last() throws DequeVazioException {
    if (this.isEmpty()) {
      throw new DequeVazioException("Exception: Deque vazio :(");
    } else {
      return this.dequeStack.lastElement();
    }
  }

  @Override
  public int size() {
    return this.dequeStack.size();
  }

  @Override
  public boolean isEmpty() {
    return this.dequeStack.isEmpty();
  }

  @Override
  public void mostrar() {
    int vectorLength = this.size();

    System.out.print("[ ");
    for (int index = 0; index < vectorLength; index++) {
      System.out.print(this.dequeStack.get(index) + " ");
    }
    System.out.print(" ]");
    System.out.println("\n");
  }
}

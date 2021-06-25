package com.newton.interfaces;

import com.newton.exceptions.DequeVazioException;

public interface IDeque {
  void inserirInicio(Object o);

  void inserirFim(Object o);

  Object removerInicio() throws DequeVazioException;

  Object removerFim() throws DequeVazioException;

  Object first() throws DequeVazioException;

  Object last() throws DequeVazioException;

  int size();

  boolean isEmpty();

  void mostrar();
}

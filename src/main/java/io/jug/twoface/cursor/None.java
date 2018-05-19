package io.jug.twoface.cursor;

final class None<T> implements Cursor<T> {
  @Override
  public final boolean hasNext() {
    return false;
  }

  @Override
  public final T next() {
    throw new UnsupportedOperationException();
  }
}

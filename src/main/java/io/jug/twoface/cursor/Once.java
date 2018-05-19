package io.jug.twoface.cursor;

final class Once<T> implements Cursor<T> {
  private final T value;
  private final ThreadLocal<Boolean> read;

  Once(final T value) {
    this(value, true);
  }
  private Once(final T value, final boolean read) {
    this.value = value;
    this.read = ThreadLocal.withInitial(() -> read);
  }

  @Override
  public final boolean hasNext() {
    return read.get();
  }

  @Override
  public final T next() {
    read.set(false);
    return value;
  }
}

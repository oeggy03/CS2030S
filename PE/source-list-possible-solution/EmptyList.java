public class EmptyList<T> implements SourceList<T> {

  public T getFirst() {
    return null;
  }

  public SourceList<T> getSecond() {
    return null;
  }

  @Override
  public String toString() {
    return "EmptyList";
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public SourceList<T> filter(BooleanCondition<? super T> cond) {
    return new EmptyList<>();
  }

  @Override
  public <U> SourceList<U> map(Transformer<? super T, ? extends U> mapper) {
    return new EmptyList<>();
  }

  public boolean equals(Object obj) {
    if (obj instanceof SourceList<?>) {
      SourceList<?> list = (SourceList<?>) obj;
      if (list.getFirst() == null && list.getSecond() == null) {
        return true;
      }
    }
    return false;
  }
}

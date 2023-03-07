public class Pair<T> implements SourceList<T> {
  private T first;
  private SourceList<T> second;

  public Pair(T first, SourceList<T> second) {
    this.first = first;
    this.second = second;
  }

  @Override
  public T getFirst() {
    return this.first;
  }

  @Override
  public SourceList<T> getSecond() {
    return this.second;
  }

  @Override
  public String toString() {
    return this.first + ", " + this.second;
  }

  @Override
  public int length() {
    return 1 + this.getSecond().length();
  }

  @Override
  public SourceList<T> filter(BooleanCondition<? super T> cond) {
    if (cond.test(this.getFirst())) {
      return new Pair<>(this.getFirst(), this.getSecond().filter(cond));
    } 
    return this.getSecond().filter(cond);
  }

  @Override
  public <U> SourceList<U> map(Transformer<? super T, ? extends U> mapper) {
    return new Pair<>(mapper.transform(this.getFirst()), this.getSecond().map(mapper));
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof SourceList<?>) {
      SourceList<?> list = (SourceList<?>) obj;
      if (this.getFirst().equals(list.getFirst())) {
        return this.getSecond().equals(list.getSecond());
      }
    }
    return false;
  }
}

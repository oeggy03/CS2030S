interface SourceList<T> {
  T getFirst();
  
  SourceList<T> getSecond();
  
  int length();
  
  SourceList<T> filter(BooleanCondition<? super T> cond);
  
  <U> SourceList<U> map(Transformer<? super T, ? extends U> mapper);
}

class StringToLength implements Transformer<String, Integer> {
  public Integer transform(String s) { 
    return s.length(); 
  }
}

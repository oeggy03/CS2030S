public class IntegerToString implements Transformer<Integer, String> {

  @Override
  public String transform(Integer t) {
    return "\"" + t.toString() + "\"";
  }
}

public class GreaterThanTwo implements BooleanCondition<Integer> {
  @Override
  public boolean test(Integer t) {
    return t > 2;
  }
}

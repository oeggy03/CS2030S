class Main {
    static class P {
        public void f(int i, int j) {
            System.out.print(i + j);
        }
    }
    static class A extends P {
        public void f(Integer i, Integer j) { // Note the type
            System.out.print(i * j);
        }
    }
    static class B extends P {
        public void f(int j, int i) { // Note the order of i and j
            System.out.print(i - j);
        }
    }
    public static void main(String[] args) {
        P objects[] = { new P(), new A(), new B() };
        for (P p : objects) {
            p.f(1, 2);
        }
    }
}
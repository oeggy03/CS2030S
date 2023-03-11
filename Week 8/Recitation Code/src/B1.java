class B1 {
    static int x = 0;
    void f() {
        A a = new A();
    // Line A
    }
    static class A {
        int y = 0;
        A() {
            y = x + 1;
        }
    }
}

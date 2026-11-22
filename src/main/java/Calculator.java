public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        if (b == 0) {
            throw new IllegalArgumentException("Делить на 0 нельзя");
        }
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int square(int a) {
        return times(a, a);
    }
    public int solver() {
        return div(dif(square(7), 29), 4);
    }
}
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
    public int solver(){
        int result = times(4, 5);
        result = dif(result, 2);
        result = add(result, 10);
        result = div(result, 2);
        return result;
    }
}
package creationalPatterns.singletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        CompressionService instance = CompressionService.getInstance();
        instance = CompressionService.getInstance();
        instance = CompressionService.getInstance();
        instance = CompressionService.getInstance();
        instance = CompressionService.getInstance();

        instance.compress("Some file");
    }
}

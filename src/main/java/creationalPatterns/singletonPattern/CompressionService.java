package creationalPatterns.singletonPattern;

public class CompressionService {
    /*Prevent using the default constructor*/
    private CompressionService() {
    }

    private static CompressionService compressionService;

    public static CompressionService getInstance() {
        if (compressionService == null) {
            compressionService = new CompressionService();
            System.out.println("A new instance created");
            return compressionService;
        }
        System.out.println("The previous instance returned");
        return compressionService;
    }

    public void compress(String file) {
        System.out.println("Running compression for file: " + file);
    }
}

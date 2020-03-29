package behaviourPatterns.compression;

public class WinRar implements CompressionStrategy {
    @Override
    public void performCompression(String file) {
        System.out.println("File compressed via winRar, total size 1mb");
    }
}

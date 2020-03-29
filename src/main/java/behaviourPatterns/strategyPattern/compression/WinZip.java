package behaviourPatterns.strategyPattern.compression;

public class WinZip implements CompressionStrategy {
    @Override
    public void performCompression(String file) {
        System.out.println("File compressed via winZip, total size 3mb");
    }
}

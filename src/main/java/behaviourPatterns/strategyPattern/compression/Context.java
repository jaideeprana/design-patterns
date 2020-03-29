package behaviourPatterns.strategyPattern.compression;

public class Context {
    private CompressionStrategy compressionStrategy;

    public Context(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void executeStrategy(String file){
        compressionStrategy.performCompression(file);
    }
}

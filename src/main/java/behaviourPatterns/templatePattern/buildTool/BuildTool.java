package behaviourPatterns.templatePattern.buildTool;

public abstract class BuildTool {
    protected abstract void assembleCode();

    protected abstract void runTests();

    protected abstract void packageCode();

    public void buildCode() {
        assembleCode();
        runTests();
        packageCode();
    }
}

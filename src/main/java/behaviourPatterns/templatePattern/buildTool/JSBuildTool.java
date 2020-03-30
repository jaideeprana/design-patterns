package behaviourPatterns.templatePattern.buildTool;

public class JSBuildTool extends BuildTool {
    @Override
    protected void assembleCode() {
        System.out.println("Assembling the code via npm");
    }

    @Override
    protected void runTests() {
        System.out.println("Running npm tests");
    }

    @Override
    protected void packageCode() {
        System.out.println("Preparing production build");
    }
}

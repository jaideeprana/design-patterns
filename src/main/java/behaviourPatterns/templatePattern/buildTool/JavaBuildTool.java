package behaviourPatterns.templatePattern.buildTool;

public class JavaBuildTool extends BuildTool {
    @Override
    protected void assembleCode() {
        System.out.println("Running gradle assemble");
    }

    @Override
    protected void runTests() {
        System.out.println("Running gradle tests");
    }

    @Override
    protected void packageCode() {
        System.out.println("Creating jar, because we love peace and not war ;)");
    }
}

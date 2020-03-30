package behaviourPatterns.templatePattern.buildTool;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        JavaBuildTool javaBuildTool = new JavaBuildTool();
        JSBuildTool jsBuildTool = new JSBuildTool();

        javaBuildTool.buildCode();
        jsBuildTool.buildCode();
    }
}

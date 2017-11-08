package io.swagger.codegen.languages;

import io.swagger.codegen.SupportingFile;

public class JavaJAXRSSpecPomServerCodegen extends JavaJAXRSSpecServerCodegen {

    public JavaJAXRSSpecPomServerCodegen() {
        super();
        modelTemplateFiles.clear();
        apiTemplateFiles.clear();
        restAppGenerate = false;
    }

    @Override
    public void processOpts() {
        super.processOpts();
    }

    @Override
    public String getName() {
        return "jaxrs-spec-pom";
    }

}

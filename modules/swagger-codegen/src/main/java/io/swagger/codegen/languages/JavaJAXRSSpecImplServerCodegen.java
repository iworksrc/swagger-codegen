package io.swagger.codegen.languages;

import io.swagger.codegen.SupportingFile;

public class JavaJAXRSSpecImplServerCodegen extends JavaJAXRSSpecServerCodegen {

    public JavaJAXRSSpecImplServerCodegen() {
        super();
        modelTemplateFiles.clear();
        apiTemplateFiles.clear();
        apiTemplateFiles.put("apiImpL.mustache", ".java");
        restAppGenerate = false;
    }

    @Override
    public String getName() {
        return "jaxrs-spec-impl";
    }

}

package io.swagger.codegen.languages;

import io.swagger.codegen.SupportingFile;

public class JavaJAXRSSpecWarServerCodegen extends JavaJAXRSSpecServerCodegen {

    public JavaJAXRSSpecWarServerCodegen() {
        super();
        modelTemplateFiles.clear();
        apiTemplateFiles.clear();
    }

    @Override
    public void processOpts() {
        super.processOpts();
        writeOptional(outputFolder, new SupportingFile("web.mustache", ("src/main/webapp/WEB-INF"), "web.xml"));
        writeOptional(outputFolder, new SupportingFile("jboss-web.mustache", ("src/main/webapp/WEB-INF"), "jboss-web.xml"));
        writeOptional(outputFolder, new SupportingFile("jboss-deployment-structure.mustache", ("src/main/webapp/WEB-INF"), "jboss-deployment-structure.xml"));
    }

    @Override
    public String getName() {
        return "jaxrs-spec-war";
    }

}

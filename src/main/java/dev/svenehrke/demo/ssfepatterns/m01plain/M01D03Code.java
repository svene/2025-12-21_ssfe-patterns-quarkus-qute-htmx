package dev.svenehrke.demo.ssfepatterns.m01plain;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D03Code {
	String HTML = """
	  {! from model, passed by controller: !}
	  {@String greetee = "You"}
	  <h1>Page with Params-Component</h1>
	  {! first parameter passed literally from this template.
	     Second parameter coming in from controller through Model and passed to included template:
	  !}
	  {#include dev/svenehrke/demo/ssfepatterns/components/helloworldparams.html greeting="Hey" greetee = greetee}{/include}
	  """;
	String JAVA = """
      @Path("/")
      public class Page03Resource {
        public static final String URL = "/p01plain/page03withparamscomponent";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return PlainTemplates.Templates.page03withparamscomponent();
        }
      }
      """;
	String HELLOWORLD_HTML = """
	  {@String greeting = "Hello"}
	  {@String greetee = "World"}
	  
	  <h3>{greeting} {greetee}!</h3>
	  """;
	String TEMPLATES_JAVA = """
      public class PlainTemplates {
        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page03withparamscomponent();
        }
      }
      """;

}

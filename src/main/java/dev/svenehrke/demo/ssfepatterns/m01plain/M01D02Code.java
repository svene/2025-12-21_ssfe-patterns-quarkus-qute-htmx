package dev.svenehrke.demo.ssfepatterns.m01plain;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D02Code {
	String HTML = """
	  <h1>Page with Component</h1>
	  {! Include Component: !}
	  {#include dev/svenehrke/demo/ssfepatterns/components/helloworld.html}{/include}
	  """;
	String JAVA = """
      @Path("/")
      public class Page02Resource {
        public static final String URL = "/p01plain/page02withcomponent";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return PlainTemplates.Templates.page02withcomponent();
        }
      }
      """;
	String HELLOWORLD_HTML = """
	  <h3>Hello world!</h3>
	  """;
	String TEMPLATES_JAVA = """
      public class PlainTemplates {
        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page02withcomponent();
        }
      }
      """;

}

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
      public class M01D02 {
        public static final String URL = "/m01/d02";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return return Templates.m01d02();
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
        private static class Templates {
          public static native TemplateInstance m01d02();
        }
      }
      """;
	String HELLOWORLD_HTML = """
	  <h3>Hello world!</h3>
	  """;

}

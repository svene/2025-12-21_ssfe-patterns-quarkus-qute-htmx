package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D01Code {
	String HTML = """
	  <h1>Application Page</h1>
	  """;
	String JAVA = """
      @Path("/")
      public class Page01Resource {
        public static final String URL = "/p01plain/page01";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return PlainTemplates.Templates.page01();
        }
      }
      """;
	String TEMPLATES_JAVA = """
      public class PlainTemplates {
        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page01();
        }
      }
      """;
}

package dev.svenehrke.demo.ssfepatterns.m01plain;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D01Code {
	String HTML = """
	  <h1>Application Page</h1>
	  """;
	String JAVA = """
      @Path("/")
      public class M01D01 {
        public static final String URL = "/m01/d01";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return Templates.m01d01();
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
        private static class Templates {
          public static native TemplateInstance m01d01();
        }
      }
      """;
}

package dev.svenehrke.demo.ssfepatterns.m03pages;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M03D03Code {
	String HTML = """
	  {@String greeting}
	  <!DOCTYPE html>
	  <html lang="en">
	  {#include dev/svenehrke/demo/ssfepatterns/components/page_head.html}{/include}
	  <body>
	  ...
	      <h1>Custom Page with Param says: {greeting}</h1>
	  ...
	  </body>
	  </html>
	  """;
	String JAVA = """
      @Path("/")
      public class M03D03Routing {
        public static final String URL = "/m03/d03";

        @GET
        @Path(URL)
        public TemplateInstance page(
          @QueryParam("greeting") @DefaultValue("-") String greeting
        ) {
          return Templates.m03d03(greeting);
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
        private static class Templates {
          public static native TemplateInstance m03d03(String greeting);
        }
      }
      """;
}

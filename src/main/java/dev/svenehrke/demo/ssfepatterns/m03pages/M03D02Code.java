package dev.svenehrke.demo.ssfepatterns.m03pages;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M03D02Code {
	String HTML = """
	  {@String greeting}
	  {#include dev/svenehrke/demo/ssfepatterns/components/bulmapage.html}
	    <h1 class="title">Content Page with Param says: {greeting}</h1>
	  {/include}
	  """;
	String JAVA = """
      @Path("/")
      public class M03D02Routing {
        public static final String URL = "/m03/d02";

        @GET
        @Path(URL)
        public TemplateInstance page(
          @QueryParam("greeting") @DefaultValue("-") String greeting
        ) {
          return Templates.m03d02(greeting);
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
        private static class Templates {
          public static native TemplateInstance m03d02(String greeting);
        }
      }
      """;
}

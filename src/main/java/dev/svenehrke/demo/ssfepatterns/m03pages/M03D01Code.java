package dev.svenehrke.demo.ssfepatterns.m03pages;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M03D01Code {
	String HTML = """
	  {#include dev/svenehrke/demo/ssfepatterns/components/bulmapage.html}
	    <h1 class="title">Content Page</h1>
	  {/include}
	  """;
	String LAYOUT = """
      <!DOCTYPE html>
      <html lang="en">
      {#include dev/svenehrke/demo/ssfepatterns/components/page_head.html}{/include}
      <body>
      <div>
        {#insert}{/insert}
      </div>
      </body>
      </html>
      """;
	String JAVA = """
      @Path("/")
      public class M03D01 {
        public static final String URL = "/m03/d01";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return Templates.m03d01();
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
        private static class Templates {
          public static native TemplateInstance m03d01();
        }
      }
      """;
}

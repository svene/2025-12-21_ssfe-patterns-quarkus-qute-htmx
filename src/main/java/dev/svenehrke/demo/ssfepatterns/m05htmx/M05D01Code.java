package dev.svenehrke.demo.ssfepatterns.m05htmx;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M05D01Code {
	String HTML = """
	  {#include dev/svenehrke/demo/ssfepatterns/components/bulmapage.html}
	    <h1>UrlComponentPage</h1>
	    <button class="button" hx-get="{M05D01MessageRouting:URL}?message=hello" hx-target="#my-message">Include Component</button>
	    <div id="my-message"></div>
	  {/include}
	  """;

	String JAVA = """
      @Path("/")
      @TemplateData(namespace = TemplateData.SIMPLENAME)
      public class M05D01Routing {
        public static final String URL = "/m05/d01";
        @GET
        @Path(URL)
        public TemplateInstance page() {
          return Templates.m05d01();
        }

      @Path("/")
      @TemplateData(namespace = TemplateData.SIMPLENAME)
      public class M05D01MessageRouting {
        public static final String URL = "/m05/d01/message";
        @GET
        @Path(URL)
        public TemplateInstance ui(
          @QueryParam("message") @DefaultValue("-") String message
        ) {
          return Templates.m05d01message(message);
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m05htmx")
        private static class Templates {
          public static native TemplateInstance m05d01();
          public static native TemplateInstance m05d01message(String message);
        }
      }
      """;

	String MESSAGE_HTML = """
	  {@String greeting}
	  <h3>{message()}!</h3>
	  """;
}

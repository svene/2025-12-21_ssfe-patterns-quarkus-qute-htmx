package dev.svenehrke.demo.ssfepatterns.p01plain;

public record Page02Code(String html, String java, String helloWorldHtml, String templatesJava) {
	private static final String HTML = """
	  <h1>Page with Component</h1>
	  {! Include Component: !}
	  {#include dev/svenehrke/demo/ssfepatterns/components/helloworld.html}{/include}
	  """;
	private static final String JAVA = """
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
	private static final String HELLOWORLD_HTML = """
	  <h3>Hello world!</h3>
	  """;
	private static final String TEMPLATES_JAVA = """
      public class PlainTemplates {
        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page02withcomponent();
        }
      }
      """;

	public Page02Code() {
		this(HTML, JAVA, HELLOWORLD_HTML, TEMPLATES_JAVA);
	}
}

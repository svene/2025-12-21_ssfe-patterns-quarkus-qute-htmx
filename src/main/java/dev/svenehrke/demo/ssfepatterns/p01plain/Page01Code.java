package dev.svenehrke.demo.ssfepatterns.p01plain;

public record Page01Code(String html, String java, String templatesJava) {
	private static final String HTML = """
	  <h1>Application Page</h1>
	  """;
	private static final String JAVA = """
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
	private static final String TEMPLATES_JAVA = """
      public class PlainTemplates {
        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page01();
        }
      }
      """;
	public Page01Code() {
		this(HTML, JAVA, TEMPLATES_JAVA);
	}
}

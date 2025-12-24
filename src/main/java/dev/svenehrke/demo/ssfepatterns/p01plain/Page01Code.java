package dev.svenehrke.demo.ssfepatterns.p01plain;

public record Page01Code(String html, String java) {
	private static final String HTML = """
	  <h1>Application Page</h1>
	  """;
	private static final String JAVA = """
      @Path("/")
      public class P01PlainQuteResource {
        public static final String PAGE_02_URL = "/p01plain/page02withcomponent";

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page02withcomponent();
        }

        @GET
        @Path(PAGE_02_URL)
        public TemplateInstance page02withcomponent() {
          return Templates.page02withcomponent();
        }
      }
      """;
	public Page01Code() {
		this(HTML, JAVA);
	}
}

package dev.svenehrke.demo.ssfepatterns.p01plain;

public record Page01Code(String html, String java) {
	private static final String HTML = """
	  <h1>Application Page</h1>
	  """;
	private static final String JAVA = """
      @Path("/")
      public class P01PlainQuteResource {
        public static final String PAGE_01_URL = "/p01plain/page01";

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page01();
        }

        @GET
        @Path(PAGE_01_URL)
        public TemplateInstance page01() {
          return Templates.page01();
        }
      }
      """;
	public Page01Code() {
		this(HTML, JAVA);
	}
}

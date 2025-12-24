package dev.svenehrke.demo.ssfepatterns.p01plain;

public record Page02Code(String html, String java, String helloWorldHtml) {
	private static final String HTML = """
	  <h1>Page with Component</h1>
	  {! Include Component: !}
	  {#include dev/svenehrke/demo/ssfepatterns/components/helloworld.html}{/include}
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
	private static final String HELLOWORLD_HTML = """
	  <h3>Hello world!</h3>
	  """;

	public Page02Code() {
		this(HTML, JAVA, HELLOWORLD_HTML);
	}
}

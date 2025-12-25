package dev.svenehrke.demo.ssfepatterns.p01plain;

public record Page05Code(String html, String java, String helloWorldHtml, String templatesJava) {
	private static final String HTML = """
	  <h1>Page with Nested Components</h1>
	  {! Outer template: !}
	  {#include dev/svenehrke/demo/ssfepatterns/components/helloworldcontent.html}
	    <p>before nested content</p>
	    {! Nested template: !}
	    {#include dev/svenehrke/demo/ssfepatterns/components/helloworldcontent.html}
	      <p>NESTED CONTENT</p>
	    {/include}
	    <p>after nested content</p>
	  {/include}
	  """;
	private static final String JAVA = """
      @Path("/")
      public class Page04Resource {
        public static final String URL = "/p01plain/page05withnestedcomponents";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return PlainTemplates.Templates.page05withnestedcomponents();
        }
      }
      """;
	private static final String HELLOWORLD_HTML = """
	  <p>Hi there!</p>
	  {#insert}{/insert}
	  """;
	private static final String TEMPLATES_JAVA = """
      public class PlainTemplates {
        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page05withnestedcomponents();
        }
      }
      """;

	public Page05Code() {
		this(HTML, JAVA, HELLOWORLD_HTML, TEMPLATES_JAVA);
	}
}

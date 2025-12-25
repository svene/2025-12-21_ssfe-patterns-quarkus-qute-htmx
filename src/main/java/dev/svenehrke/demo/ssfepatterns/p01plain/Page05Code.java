package dev.svenehrke.demo.ssfepatterns.p01plain;

public record Page05Code(String html, String java, String helloWorldHtml, String templatesJava) {
	private static final String HTML = """
	  <h1>Page with ContentParams-Component</h1>
	  {#include dev/svenehrke/demo/ssfepatterns/components/helloworldcontent.html}
	    {!include HTML content: !}
	    How are you?<br>
	    Hopefully <strong>very well</strong>.<br>
	    <p>See you soon!</p>
	  {/include}
	  """;
	private static final String JAVA = """
      @Path("/")
      public class Page04Resource {
        public static final String URL = "/p01plain/page04withcontentparamscomponent";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return PlainTemplates.Templates.page04withcontentparamscomponent();
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
          public static native TemplateInstance page04withcontentparamscomponent();
        }
      }
      """;

	public Page05Code() {
		this(HTML, JAVA, HELLOWORLD_HTML, TEMPLATES_JAVA);
	}
}

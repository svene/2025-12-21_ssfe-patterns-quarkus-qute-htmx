package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D05Code {
	String HTML = """
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
	String JAVA = """
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
	String HELLOWORLD_HTML = """
	  <p>Hi there!</p>
	  {#insert}{/insert}
	  """;
	String TEMPLATES_JAVA = """
      public class PlainTemplates {
        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
        static class Templates {
          public static native TemplateInstance page05withnestedcomponents();
        }
      }
      """;

}

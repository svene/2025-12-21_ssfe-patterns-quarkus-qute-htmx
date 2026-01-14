package dev.svenehrke.demo.ssfepatterns.m01plain;

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
      public class M01D05 {
        public static final String URL = "/m01/d05";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return PlainTemplates.Templates.m01d05();
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
        private static class Templates {
          public static native TemplateInstance m01d05();
        }
      }
      """;
	String HELLOWORLD_HTML = """
	  <p>Hi there!</p>
	  {#insert}{/insert}
	  """;

}

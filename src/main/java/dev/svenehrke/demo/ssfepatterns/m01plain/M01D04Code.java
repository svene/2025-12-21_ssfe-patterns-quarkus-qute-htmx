package dev.svenehrke.demo.ssfepatterns.m01plain;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D04Code {
	String HTML = """
	  <h1>Page with ContentParams-Component</h1>
	  {#include dev/svenehrke/demo/ssfepatterns/components/helloworldcontent.html}
	    {!include HTML content: !}
	    How are you?<br>
	    Hopefully <strong>very well</strong>.<br>
	    <p>See you soon!</p>
	  {/include}
	  """;
	String JAVA = """
      @Path("/")
      public class M01D04 {
        public static final String URL = "/m01/d04";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return PlainTemplates.Templates.m01d04();
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
        private static class Templates {
          public static native TemplateInstance m01d04();
        }
      }
      """;
	String HELLOWORLD_HTML = """
	  <p>Hi there!</p>
	  {#insert}{/insert}
	  """;
}

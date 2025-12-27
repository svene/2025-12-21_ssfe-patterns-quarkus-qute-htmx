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
      public class Page04Resource {
        public static final String URL = "/p01plain/page04withcontentparamscomponent";

        @GET
        @Path(URL)
        public TemplateInstance page() {
          return PlainTemplates.Templates.page04withcontentparamscomponent();
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
          public static native TemplateInstance page04withcontentparamscomponent();
        }
      }
      """;

}

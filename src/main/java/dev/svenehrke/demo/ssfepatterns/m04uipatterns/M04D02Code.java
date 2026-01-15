package dev.svenehrke.demo.ssfepatterns.m04uipatterns;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M04D02Code {
	String HTML = """
	  {#include dev/svenehrke/demo/ssfepatterns/components/bulmapage.html}
	    <h3>Forwarder-Page</h3>
	    <div>
	      {#include dev/svenehrke/demo/ssfepatterns/m04uipatterns/m04d02first greeting="hello"/}
	      {#include dev/svenehrke/demo/ssfepatterns/m04uipatterns/m04d02first greeting="hello with forward"/}
	    </div>
	  {/include}
	  """;

	String JAVA = """
      @Path("/")
      public class M04D02Routing {
        public static final String URL = "/m04/d02";
        @GET
        @Path(URL)
        public TemplateInstance page() {
          return Templates.m04d02();
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m04uipatterns")
        private static class Templates {
          public static native TemplateInstance m04d02();
        }
      }
      """;

	String FIRST_HTML = """
	  {@String greeting}
	  {#if greeting != null && greeting.contains("forward")}
	    {#include dev/svenehrke/demo/ssfepatterns/m04uipatterns/m04d02second greeting = greeting}{/include}
	  {#else}
	    <div>First: {greeting}</div>
	  {/if}
	  """;

	String SECOND_HTML = """
	  {@String greeting}
	  <div>Second: {greeting}</div>
	  """;

}

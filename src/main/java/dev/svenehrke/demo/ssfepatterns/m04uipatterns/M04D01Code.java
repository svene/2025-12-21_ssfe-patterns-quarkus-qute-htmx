package dev.svenehrke.demo.ssfepatterns.m04uipatterns;

import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M04D01Code {
	String HTML = """
	  {#include dev/svenehrke/demo/ssfepatterns/components/bulmapage.html}
	    <h3>ParentChild-Page</h3>
	    <div>
	      {#include dev/svenehrke/demo/ssfepatterns/m04uipatterns/m04d01parent.html greeting="hello"/}
	    </div>
	  {/include}
	  """;

	String JAVA = """
      @Path("/")
      public class M04D01Routing {
        public static final String URL = "/m04/d01";
        @GET
        @Path(URL)
        public TemplateInstance page() {
          return Templates.m04d01();
        }

        @CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m04uipatterns")
        private static class Templates {
          public static native TemplateInstance m04d01();
        }
      }
      """;

	String PARENT_HTML = """
	  {@String greeting}
	  <h3>Parent</h3>
	  <div>
	    {#include dev/svenehrke/demo/ssfepatterns/m04uipatterns/m04d01child.html}
	      {#slot1}slot-content from parent. Greeting: {greeting}{/slot1}
	    {/include}
	  </div>
	  """;

	String CHILD_HTML = """
	  <div>
	    Child: <span>{#insert slot1}{/insert}</span>
	  </div>
	  """;

}

package dev.svenehrke.demo.ssfepatterns.s01plain;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

// docs:start page
@Path("/")
public class S01D01 {
	public static final String URL = "/s01/d01";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.s01d01();
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/s01plain")
	private static class Templates {
		public static native TemplateInstance s01d01();
	}

}
// docs:end page

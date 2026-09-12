package dev.svenehrke.demo.hypermediapatterns.s01plain;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

// docs:start page
@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class S01D02 {
	public static final String URL = "/s01/d02";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.s01d02();
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/hypermediapatterns/s01plain")
	private static class Templates {
		public static native TemplateInstance s01d02();
	}

}
// docs:end page

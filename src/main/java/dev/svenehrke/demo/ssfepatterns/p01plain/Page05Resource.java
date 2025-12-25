package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page05Resource {

	public static final String URL = "/m01plain/page05withnestedcomponents";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return M01PlainTemplates.Templates.page05withnestedcomponents(new Page05Code());
	}
}

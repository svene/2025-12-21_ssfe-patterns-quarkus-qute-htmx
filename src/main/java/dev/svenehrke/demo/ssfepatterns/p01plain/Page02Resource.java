package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page02Resource {

	public static final String URL = "/p01plain/page02withcomponent";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return M01PlainTemplates.Templates.page02withcomponent(new Page02Code());
	}
}

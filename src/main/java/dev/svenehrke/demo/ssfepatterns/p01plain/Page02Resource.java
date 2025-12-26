package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page02Resource {

	@GET
	@Path(M01D02.URL)
	public TemplateInstance page() {
		return M01PlainTemplates.Templates.page02withcomponent(new Page02Code());
	}
}

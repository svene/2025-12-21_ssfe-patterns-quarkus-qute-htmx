package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page05Resource {

	@GET
	@Path(M01D05.URL)
	public TemplateInstance page() {
		return M01PlainTemplates.Templates.page05withnestedcomponents(new Page05Code());
	}
}

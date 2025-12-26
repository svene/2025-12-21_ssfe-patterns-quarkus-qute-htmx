package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page01Resource {

	@GET
	@Path(M01D01.URL)
	public TemplateInstance page() {
		return M01PlainTemplates.Templates.page01(new Page01Code());
	}
}

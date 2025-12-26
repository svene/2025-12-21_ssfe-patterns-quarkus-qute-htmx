package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page03Resource {

	@GET
	@Path(M01D03.URL)
	public TemplateInstance page() {
		return M01PlainTemplates.Templates.page03withparamscomponent(new Page03Code());
	}
}

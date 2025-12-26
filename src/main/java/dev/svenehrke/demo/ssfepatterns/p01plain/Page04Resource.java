package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page04Resource {

	@GET
	@Path(M01D04.URL)
	public TemplateInstance page() {
		return M01PlainTemplates.Templates.page04withcontentparamscomponent(new Page04Code());
	}
}

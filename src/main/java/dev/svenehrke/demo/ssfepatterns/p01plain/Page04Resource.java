package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page04Resource {

	public static final String URL = "/p01plain/page04withcontentparamscomponent";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return PlainTemplates.Templates.page04withcontentparamscomponent(new Page04Code());
	}
}

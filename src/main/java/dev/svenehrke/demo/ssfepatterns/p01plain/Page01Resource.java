package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class Page01Resource {

	public static final String URL = "/p01plain/page01";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return PlainTemplates.Templates.page01(new Page01Code());
	}
}

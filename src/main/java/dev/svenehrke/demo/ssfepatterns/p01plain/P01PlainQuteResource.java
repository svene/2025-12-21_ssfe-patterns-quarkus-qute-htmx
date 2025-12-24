package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class P01PlainQuteResource {

	public static final String PAGE_02_URL = "/p01plain/page02withcomponent";
	public static final String PAGE_03_URL = "/p01plain/page03withparamscomponent";
	public static final String PAGE_04_URL = "/p01plain/page04withcontentparamscomponent";

	@GET
	@Path(PAGE_02_URL)
	public TemplateInstance page02withcomponent() {
		return PlainTemplates.Templates.page02withcomponent(new Page02Code());
	}
	@GET
	@Path(PAGE_03_URL)
	public TemplateInstance page03withparamscomponent() {
		return PlainTemplates.Templates.page03withparamscomponent();
	}
	@GET
	@Path(PAGE_04_URL)
	public TemplateInstance page04withcontentparamscomponent() {
		return PlainTemplates.Templates.page04withcontentparamscomponent();
	}
}

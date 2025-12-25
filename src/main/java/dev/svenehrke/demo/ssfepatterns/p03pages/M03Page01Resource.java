package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.p01plain.Page01Code;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class M03Page01Resource {

	public static final String URL = "/p03pages/page01";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return M03PagesTemplates.Templates.page01contentpage(new Page01Code());
	}
}

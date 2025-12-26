package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.p01plain.Page01Code;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class M03Page01Resource {

	@GET
	@Path(M03D01.URL)
	public TemplateInstance page() {
		return M03PagesTemplates.Templates.page01contentpage(new Page01Code());
	}
}

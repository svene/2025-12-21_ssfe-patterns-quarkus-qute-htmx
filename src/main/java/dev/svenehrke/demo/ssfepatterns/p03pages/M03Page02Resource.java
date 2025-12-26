package dev.svenehrke.demo.ssfepatterns.p03pages;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/")
public class M03Page02Resource {

	@GET
	@Path(M03D02.URL)
	public TemplateInstance page(
		@QueryParam("greeting")
		@DefaultValue("-") String greeting
	) {
		return M03PagesTemplates.Templates.page02contentpagewithparam(greeting);
	}
}

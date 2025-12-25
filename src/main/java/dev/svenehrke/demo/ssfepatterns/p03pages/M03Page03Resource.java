package dev.svenehrke.demo.ssfepatterns.p03pages;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/")
public class M03Page03Resource {

	public static final String URL = "/m03pages/page03";

	@GET
	@Path(URL)
	public TemplateInstance page(
		@QueryParam("greeting")
		@DefaultValue("-") String greeting
	) {
		return M03PagesTemplates.Templates.page03custompagewithparam(greeting);
	}
}

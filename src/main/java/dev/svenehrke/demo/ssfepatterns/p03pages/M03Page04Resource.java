package dev.svenehrke.demo.ssfepatterns.p03pages;

import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/")
public class M03Page04Resource {

	@GET
	@Path(M03D04.PAGE1_URL)
	public TemplateInstance page1() {
		return M03PagesTemplates.Templates.page04mpapage1();
	}

	@GET
	@Path(M03D04.PAGE2_URL)
	public TemplateInstance page2() {
		return M03PagesTemplates.Templates.page04mpapage2();
	}

}

package dev.svenehrke.demo.ssfepatterns.m03pages;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Path("/")
@TemplateData(namespace = TemplateData.SIMPLENAME)
public class M03Routing {
	public static final String M03D03_URL = "/m03/d03";

	@GET
	@Path(M03D03_URL)
	public TemplateInstance page(
		@QueryParam("greeting") @DefaultValue("-") String greeting
	) {
		return Templates.m03d03(greeting);
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
	private static class Templates {
		public static native TemplateInstance m03d03(String greeting);
	}

}

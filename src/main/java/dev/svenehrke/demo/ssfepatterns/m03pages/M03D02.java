package dev.svenehrke.demo.ssfepatterns.m03pages;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M03D02 {
	public static final String URL = "/m03/d02";

	@GET
	@Path(M03D02.URL)
	public TemplateInstance page(
		@QueryParam("greeting")
		@DefaultValue("-") String greeting
	) {
		return Templates.m03d02(greeting);
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
	private static class Templates {
		public static native TemplateInstance m03d02(String greeting);
	}

}

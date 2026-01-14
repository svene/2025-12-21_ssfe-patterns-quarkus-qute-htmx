package dev.svenehrke.demo.ssfepatterns.m01plain;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M01D03 {
	public static final String URL = "/m01/d03";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.m01d03();
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
	private static class Templates {
		public static native TemplateInstance m01d03();
	}

}

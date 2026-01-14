package dev.svenehrke.demo.ssfepatterns.m01plain;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class M01D01 {
	public static final String URL = "/m01/d01";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.m01d01();
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
	private static class Templates {
		public static native TemplateInstance m01d01();
	}

}

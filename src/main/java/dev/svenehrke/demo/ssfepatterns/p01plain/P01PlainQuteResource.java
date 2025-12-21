package dev.svenehrke.demo.ssfepatterns.p01plain;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/p01plain")
public class P01PlainQuteResource {

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/p01plain")
	static class Templates {
		public static native TemplateInstance page01();
		public static native TemplateInstance page02withcomponent();
	}
	@GET
	@Path("page01")
	public TemplateInstance page01() {
		return Templates.page01();
	}
	@GET
	@Path("page02withcomponent")
	public TemplateInstance page02withcomponent() {
		return Templates.page02withcomponent();
	}
}

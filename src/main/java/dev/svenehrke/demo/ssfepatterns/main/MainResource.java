package dev.svenehrke.demo.ssfepatterns.main;

import dev.svenehrke.demo.ssfepatterns.p01plain.P01PlainQuteResource;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class MainResource {

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/main")
	static class Templates {
		public static native TemplateInstance index(
			MainCardInfo cardInfo
		);
	}
	@GET
	public TemplateInstance index() {
		return Templates.index(new MainCardInfo(
			P01PlainQuteResource.PAGE_01_URL,
			"Basic JTE Page",
			"made using a JTE template",
			"",
			"Demo..."
		));
	}
}

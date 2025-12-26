package dev.svenehrke.demo.ssfepatterns.main;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class MainResource {

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m00main")
	static class Templates {
		public static native TemplateInstance index();
	}

	@GET
	public TemplateInstance index() {
		return Templates.index();
	}

}

package dev.svenehrke.demo.ssfepatterns.m05htmx;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public class M05Routing {
	@Path("/")
	public static class M05D01Routing {
		public static final String URL = "/m05/d01";
		@GET
		@Path(URL)
		public TemplateInstance page() {
			return Templates.m05d01();
		}
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m05htmx")
	private static class Templates {
		public static native TemplateInstance m05d01();
	}


}

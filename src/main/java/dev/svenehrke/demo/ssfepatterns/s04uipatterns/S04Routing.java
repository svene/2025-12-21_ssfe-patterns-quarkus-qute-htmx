package dev.svenehrke.demo.ssfepatterns.s04uipatterns;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public class S04Routing {
	// docs:start d01
	@Path("/")
	public static class S04D01Routing {
		public static final String URL = "/s04/d01";
		@GET
		@Path(URL)
		public TemplateInstance page() {
			return Templates.s04d01();
		}
	}
	// docs:end d01

	// docs:start d02
	@Path("/")
	public static class S04D02Routing {
		public static final String URL = "/s04/d02";
		@GET
		@Path(URL)
		public TemplateInstance page() {
			return Templates.s04d02();
		}
	}
	// docs:end d02

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/s04uipatterns")
	static class Templates {
		public static native TemplateInstance s04d01();
		public static native TemplateInstance s04d02();
	}
}

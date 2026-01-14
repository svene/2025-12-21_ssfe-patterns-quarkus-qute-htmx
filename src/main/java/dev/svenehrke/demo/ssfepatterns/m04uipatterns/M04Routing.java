package dev.svenehrke.demo.ssfepatterns.m04uipatterns;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public class M04Routing {
	@Path("/")
	public static class M04D01Routing {
		public static final String URL = "/m04/d01";
		@GET
		@Path(URL)
		public TemplateInstance page() {
			return Templates.m04d01();
		}
	}

	@Path("/")
	public static class M04D02Routing {
		public static final String URL = "/m04/d02";
		@GET
		@Path(URL)
		public TemplateInstance page() {
			return Templates.m04d02();
		}
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m04uipatterns")
	static class Templates {
		public static native TemplateInstance m04d01();
		public static native TemplateInstance m04d02();
	}
}

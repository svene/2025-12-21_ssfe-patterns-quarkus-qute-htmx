package dev.svenehrke.demo.ssfepatterns.m05htmx;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

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

	@Path("/")
	@TemplateData(namespace = TemplateData.SIMPLENAME)
	public static class M05D01MessageRouting {
		public static final String URL = "/m05/d01/message";
		@GET
		@Path(URL)
		public TemplateInstance ui(
			@QueryParam("message") @DefaultValue("-") String message
		) {
			return Templates.m05d01message(message);
		}
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m05htmx")
	private static class Templates {
		public static native TemplateInstance m05d01();
		public static native TemplateInstance m05d01message(String message);
	}


}

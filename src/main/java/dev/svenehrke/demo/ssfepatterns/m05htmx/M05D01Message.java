package dev.svenehrke.demo.ssfepatterns.m05htmx;

import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M05D01Message {
	public static final String URL = "/m05/d01/message";

	@GET
	@Path(URL)
	public TemplateInstance page(
		@QueryParam("message")
		@DefaultValue("-") String message
	) {
		return Templates.m05d01message(message);
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m05htmx")
	private static class Templates {
		public static native TemplateInstance m05d01message(String message);
	}

}

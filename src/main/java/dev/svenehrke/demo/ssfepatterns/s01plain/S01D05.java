package dev.svenehrke.demo.ssfepatterns.s01plain;

import dev.svenehrke.demo.ssfepatterns.s00main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

// docs:start page
@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class S01D05 {
	public static final String URL = "/s01/d05";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.s01d05();
	}

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/s01plain")
	private static class Templates {
		public static native TemplateInstance s01d05();
	}

}
// docs:end page

package dev.svenehrke.demo.ssfepatterns.m01plain;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M01D05 {
	private static final String URL = "/m01/d05";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.m01d05();
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Nested components"),
		new RawString("or: template in template"),
		new RawString("If you need components in content-parameters"),
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
	private static class Templates {
		public static native TemplateInstance m01d05();
	}

}

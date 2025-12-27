package dev.svenehrke.demo.ssfepatterns.m03pages;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M03D01 {
	private static final String URL = "/m03/d01";

	@GET
	@Path(M03D01.URL)
	public TemplateInstance page() {
		return Templates.m03d01();
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Content Page"),
		null,
		new RawString("Recommended for most use cases"),
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
	private static class Templates {
		public static native TemplateInstance m03d01();
	}

}

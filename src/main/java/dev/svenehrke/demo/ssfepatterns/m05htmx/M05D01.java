package dev.svenehrke.demo.ssfepatterns.m05htmx;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M05D01 {
	private static final String URL = "/m05/d01";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.m05d01();
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("URL Components"),
		new RawString("include components dynamically by their URL"),
		null,
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m05htmx")
	private static class Templates {
		public static native TemplateInstance m05d01();
	}

}

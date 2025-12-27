package dev.svenehrke.demo.ssfepatterns.m04uipatterns;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M04D02 {
	private static final String URL = "/m04/d02";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.m04d02();
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Forwarder"),
		null,
		null,
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m04uipatterns")
	private static class Templates {
		public static native TemplateInstance m04d02();
	}

}

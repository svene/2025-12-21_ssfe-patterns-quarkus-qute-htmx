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
public class M01D04 {
	private static final String URL = "/m01/d04";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.m01d04();
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Content parameter"),
		new RawString("passed from page to component"),
		new RawString("When html needs to be passed into component"),
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
	private static class Templates {
		public static native TemplateInstance m01d04();
	}

}

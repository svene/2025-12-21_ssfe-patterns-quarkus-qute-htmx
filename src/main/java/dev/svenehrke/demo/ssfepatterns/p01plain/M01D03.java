package dev.svenehrke.demo.ssfepatterns.p01plain;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M01D03 {
	private static final String URL = "/p01plain/page03withparamscomponent";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.page03withparamscomponent(new Page03Code());
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Page and Component"),
		new RawString("with parameters"),
		new RawString("When page and/or component need parameters"),
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m01plain")
	private static class Templates {
		public static native TemplateInstance page03withparamscomponent(Page03Code code);
	}

}

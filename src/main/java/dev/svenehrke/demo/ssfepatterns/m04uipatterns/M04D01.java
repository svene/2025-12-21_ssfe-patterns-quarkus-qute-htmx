package dev.svenehrke.demo.ssfepatterns.m04uipatterns;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M04D01 {
	private static final String URL = "/m04uipatterns/page01";

	@GET
	@Path(URL)
	public TemplateInstance page() {
		return Templates.d01parentchildpage();
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL,
		new RawString("Parent Child"),
		null,
		null,
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m04uipatterns/d01parentchild")
	private static class Templates {
		public static native TemplateInstance d01parentchildpage();
	}

}

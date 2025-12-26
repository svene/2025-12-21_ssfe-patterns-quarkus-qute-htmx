package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M03D04 {
	public static final String PAGE1_URL = "/m03pages/page04page01";
	public static final String PAGE2_URL = "/m03pages/page04page02";

	@GET
	@Path(PAGE1_URL)
	public TemplateInstance page1() {
		return Templates.page04mpapage1();
	}

	@GET
	@Path(PAGE2_URL)
	public TemplateInstance page2() {
		return Templates.page04mpapage2();
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		PAGE1_URL,
		new RawString("MPA Example"),
		new RawString("with menu"),
		null,
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
	private static class Templates {
		public static native TemplateInstance page04mpapage1();
		public static native TemplateInstance page04mpapage2();
	}

}

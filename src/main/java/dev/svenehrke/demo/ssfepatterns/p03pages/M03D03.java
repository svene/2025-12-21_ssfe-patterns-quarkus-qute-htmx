package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@TemplateData(namespace = TemplateData.SIMPLENAME)
@Path("/")
public class M03D03 {
	private static final String URL = "/m03pages/page03";

	@GET
	@Path(M03D03.URL)
	public TemplateInstance page(
		@QueryParam("greeting")
		@DefaultValue("-") String greeting
	) {
		return Templates.page03custompagewithparam(greeting);
	}

	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		URL + "?greeting=Hello",
		new RawString("Custom Page"),
		new RawString("taking a parameter"),
		new RawString("When the opinionated content page does not fit"),
		new RawString("Demo...")
	);

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m03pages")
	private static class Templates {
		public static native TemplateInstance page03custompagewithparam(String greeting);
	}
}

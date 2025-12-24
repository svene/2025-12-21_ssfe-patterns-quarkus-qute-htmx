package dev.svenehrke.demo.ssfepatterns.main;

import dev.svenehrke.demo.ssfepatterns.p01plain.P01PlainQuteResource;
import dev.svenehrke.demo.ssfepatterns.p01plain.Page01Resource;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/")
public class MainResource {

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/main")
	static class Templates {
		public static native TemplateInstance index(
			List<MainCardInfo> plainCardInfos
		);
	}
	@GET
	public TemplateInstance index() {
		return Templates.index(List.of(
			new MainCardInfo(
				Page01Resource.URL,
				new RawString("Basic<br>QUTE Page"),
				new RawString("made using a QUTE template"),
				null,
				new RawString("Demo...")
			),
			new MainCardInfo(
				P01PlainQuteResource.PAGE_02_URL,
				new RawString("Basic<br>QUTE Page"),
				new RawString("using a QUTE component"),
				null,
			    new RawString("Demo...")
			),
			new MainCardInfo(
				P01PlainQuteResource.PAGE_03_URL,
				new RawString("Page and Component"),
				new RawString("with parameters"),
				new RawString("When page and/or component need parameters"),
				new RawString("Demo...")
			),
			new MainCardInfo(
				P01PlainQuteResource.PAGE_04_URL,
				new RawString("Content parameter"),
				new RawString("passed from page to component"),
				new RawString("When html needs to be passed into component"),
				new RawString("Demo...")
			)
			)
		);
	}
}

package dev.svenehrke.demo.ssfepatterns.main;

import dev.svenehrke.demo.ssfepatterns.p01plain.*;
import dev.svenehrke.demo.ssfepatterns.p03pages.Main03;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.TemplateInstance;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/")
public class MainResource {

	@CheckedTemplate(basePath = "dev/svenehrke/demo/ssfepatterns/m00main")
	static class Templates {
		public static native TemplateInstance index(
			List<MainCardInfo> plainCardInfos,
			List<MainCardInfo> pagesCardInfos
		);
	}

	@GET
	public TemplateInstance index() {
		return Templates.index(
			Main01.PLAIN_CARD_INFOS,
			Main03.P03_PAGES_CARD_INFOS
		);
	}

}

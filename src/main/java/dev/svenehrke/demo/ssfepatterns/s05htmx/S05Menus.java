package dev.svenehrke.demo.ssfepatterns.s05htmx;

import dev.svenehrke.demo.ssfepatterns.s00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface S05Menus {
	MainCardInfo S05D01_CARD_INFO = new MainCardInfo(
		S05Routing.S05D01Routing.URL,
		new RawString("URL Components"),
		new RawString("include components dynamically by their URL"),
		null,
		new RawString("Demo...")
	);
}

package dev.svenehrke.demo.ssfepatterns.m05htmx;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M05Menus {
	MainCardInfo M05D01_CARD_INFO = new MainCardInfo(
		M05Routing.M05D01Routing.URL,
		new RawString("URL Components"),
		new RawString("include components dynamically by their URL"),
		null,
		new RawString("Demo...")
	);
}

package dev.svenehrke.demo.ssfepatterns.s04uipatterns;

import dev.svenehrke.demo.ssfepatterns.s00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface S04Menus {
	MainCardInfo S04D01_CARD_INFO = new MainCardInfo(
		S04Routing.S04D01Routing.URL,
		new RawString("Parent Child"),
		null,
		null,
		new RawString("Demo...")
	);
	MainCardInfo S04D02_CARD_INFO = new MainCardInfo(
		S04Routing.S04D02Routing.URL,
		new RawString("Forwarder"),
		null,
		null,
		new RawString("Demo...")
	);
}

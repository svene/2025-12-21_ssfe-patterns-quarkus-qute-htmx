package dev.svenehrke.demo.ssfepatterns.m04uipatterns;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M04Menus {
	MainCardInfo M04D01_CARD_INFO = new MainCardInfo(
		M04Routing.M04D01Routing.URL,
		new RawString("Parent Child"),
		null,
		null,
		new RawString("Demo...")
	);
	MainCardInfo M04D02_CARD_INFO = new MainCardInfo(
		M04Routing.M04D02Routing.URL,
		new RawString("Forwarder"),
		null,
		null,
		new RawString("Demo...")
	);
}

package dev.svenehrke.demo.ssfepatterns.m01plain;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D03Menu {
	MainCardInfo CARD_INFO  = new MainCardInfo(
		M01D03.URL,
		new RawString("Page and Component"),
		new RawString("with parameters"),
		new RawString("When page and/or component need parameters"),
		new RawString("Demo...")
	);
}

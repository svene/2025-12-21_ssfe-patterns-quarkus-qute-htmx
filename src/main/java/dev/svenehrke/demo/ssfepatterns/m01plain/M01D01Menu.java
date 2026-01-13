package dev.svenehrke.demo.ssfepatterns.m01plain;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D01Menu {
	MainCardInfo CARD_INFO  = new MainCardInfo(
		M01D01.URL,
		new RawString("Basic<br>QUTE Page"),
		new RawString("made using a QUTE template"),
		null,
		new RawString("Demo...")
	);
}

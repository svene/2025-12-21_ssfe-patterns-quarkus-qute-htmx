package dev.svenehrke.demo.ssfepatterns.m01plain;

import dev.svenehrke.demo.ssfepatterns.m00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface M01D02Menu {
	MainCardInfo CARD_INFO  = new MainCardInfo(
		M01D02.URL,
		new RawString("Basic<br>QUTE Page"),
		new RawString("using a QUTE component"),
		null,
		new RawString("Demo...")
	);

}

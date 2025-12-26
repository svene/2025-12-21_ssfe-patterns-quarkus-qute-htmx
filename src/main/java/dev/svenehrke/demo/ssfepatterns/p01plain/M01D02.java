package dev.svenehrke.demo.ssfepatterns.p01plain;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = "m01d02")
public class M01D02 {
	public static final String URL = "/p01plain/page02withcomponent";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		M01D02.URL,
		new RawString("Basic<br>QUTE Page"),
		new RawString("using a QUTE component"),
		null,
		new RawString("Demo...")
	);

}

package dev.svenehrke.demo.ssfepatterns.p01plain;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = "m01d01")
public class M01D01 {
	public static final String URL = "/p01plain/page01";
	public static final MainCardInfo CARD_INFO  = new MainCardInfo(
		M01D01.URL,
		new RawString("Basic<br>QUTE Page"),
		new RawString("made using a QUTE template"),
		null,
		new RawString("Demo...")
	);

}

package dev.svenehrke.demo.hypermediapatterns.s01plain;

import dev.svenehrke.demo.hypermediapatterns.s00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface S01Menus {
	MainCardInfo S01D01_CARD_INFO  = new MainCardInfo(
		S01D01.URL,
		new RawString("Basic<br>QUTE Page"),
		new RawString("made using a QUTE template"),
		null,
		new RawString("Demo...")
	);
	MainCardInfo S01D02_CARD_INFO  = new MainCardInfo(
		S01D02.URL,
		new RawString("Basic<br>QUTE Page"),
		new RawString("using a QUTE component"),
		null,
		new RawString("Demo...")
	);
	MainCardInfo S01D03_CARD_INFO  = new MainCardInfo(
		S01D03.URL,
		new RawString("Page and Component"),
		new RawString("with parameters"),
		new RawString("When page and/or component need parameters"),
		new RawString("Demo...")
	);

	MainCardInfo S01D04_CARD_INFO = new MainCardInfo(
		S01D04.URL,
		new RawString("Content parameter"),
		new RawString("passed from page to component"),
		new RawString("When html needs to be passed into component"),
		new RawString("Demo...")
	);
	MainCardInfo S01D05_CARD_INFO = new MainCardInfo(
		S01D05.URL,
		new RawString("Nested components"),
		new RawString("or: template in template"),
		new RawString("If you need components in content-parameters"),
		new RawString("Demo...")
	);
}

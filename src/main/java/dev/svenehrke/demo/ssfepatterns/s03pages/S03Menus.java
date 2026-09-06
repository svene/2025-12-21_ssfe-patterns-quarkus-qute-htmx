package dev.svenehrke.demo.ssfepatterns.s03pages;

import dev.svenehrke.demo.ssfepatterns.s00main.MainCardInfo;
import io.quarkus.qute.RawString;
import io.quarkus.qute.TemplateData;

@TemplateData(namespace = TemplateData.SIMPLENAME)
public interface S03Menus {
	MainCardInfo S03D01_CARD_INFO = new MainCardInfo(
		S03Routing.S03D01Routing.URL,
		new RawString("Content Page"),
		null,
		new RawString("Recommended for most use cases"),
		new RawString("Demo...")
	);
	MainCardInfo S03D02_CARD_INFO = new MainCardInfo(
		S03Routing.S03D02Routing.URL + "?greeting=Hello",
		new RawString("Content Page"),
		new RawString("taking a parameter"),
		new RawString("When the page itself needs a parameter"),
		new RawString("Demo...")
	);
	MainCardInfo S03D03_CARD_INFO = new MainCardInfo(
		S03Routing.S03D03Routing.URL,
		new RawString("Custom Page"),
		new RawString("taking a parameter"),
		new RawString("When the opinionated content page does not fit"),
		new RawString("Demo...")
	);
	MainCardInfo S03D04_CARD_INFO = new MainCardInfo(
		S03Routing.S03D04Routing.PAGE1_URL,
		new RawString("MPA Example"),
		new RawString("with menu"),
		null,
		new RawString("Demo...")
	);
}

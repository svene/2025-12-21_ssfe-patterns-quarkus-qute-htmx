package dev.svenehrke.demo.ssfepatterns.p01plain;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;

import java.util.List;

public class Main01 {
	public static final List<MainCardInfo> PLAIN_CARD_INFOS =
		List.of(
			new MainCardInfo(
				Page01Resource.URL,
				new RawString("Basic<br>QUTE Page"),
				new RawString("made using a QUTE template"),
				null,
				new RawString("Demo...")
			),
			new MainCardInfo(
				Page02Resource.URL,
				new RawString("Basic<br>QUTE Page"),
				new RawString("using a QUTE component"),
				null,
				new RawString("Demo...")
			),
			new MainCardInfo(
				Page03Resource.URL,
				new RawString("Page and Component"),
				new RawString("with parameters"),
				new RawString("When page and/or component need parameters"),
				new RawString("Demo...")
			),
			new MainCardInfo(
				Page04Resource.URL,
				new RawString("Content parameter"),
				new RawString("passed from page to component"),
				new RawString("When html needs to be passed into component"),
				new RawString("Demo...")
			),
			new MainCardInfo(
				Page05Resource.URL,
				new RawString("Nested components"),
				new RawString("or: template in template"),
				new RawString("If you need components in content-parameters"),
				new RawString("Demo...")
			)
		);
}

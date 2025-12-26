package dev.svenehrke.demo.ssfepatterns.p03pages;

import dev.svenehrke.demo.ssfepatterns.main.MainCardInfo;
import io.quarkus.qute.RawString;

import java.util.List;

public class Main03 {
	public static final List<MainCardInfo> P03_PAGES_CARD_INFOS =
		List.of(
			M03D01.CARD_INFO,
			M03D02.CARD_INFO,
			M03D03.CARD_INFO,
			M03D04.CARD_INFO
		);
}

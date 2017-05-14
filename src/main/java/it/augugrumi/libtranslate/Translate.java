package it.augugrumi.libtranslate;

import it.augugrumi.libtranslate.conctract.ITranslationQuery;
import it.augugrumi.libtranslate.yandex.YandexQuery;

/**
 * Created by davide on 11/05/17.
 */
public class Translate {

    private Translate() {}

    public static ITranslationQuery.Builder getYandexQueryBuilder () {

        return new YandexQuery.Builder();
    }

}

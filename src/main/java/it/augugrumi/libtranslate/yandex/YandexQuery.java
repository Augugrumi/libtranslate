package it.augugrumi.libtranslate.yandex;

import com.github.vbauer.yta.model.Direction;
import com.github.vbauer.yta.model.Translation;
import com.github.vbauer.yta.service.YTranslateApi;
import com.github.vbauer.yta.service.YTranslateApiImpl;
import it.augugrumi.libtranslate.conctract.ITranslationQuery;
import it.augugrumi.libtranslate.conctract.ITranslationResult;
import it.augugrumi.libtranslate.conctract.Language;
import it.augugrumi.libtranslate.util.TranslateKeyStore;

/**
 * Created by davide on 14/05/17.
 */
public class YandexQuery implements ITranslationQuery {

    private Language from = null;
    private Language to = null;
    private String textToTranslate = null;

    private YandexQuery (
            Language from,
            Language to,
            String textToTranslate
    ) {
        this.from = from;
        this.to = to;
        this.textToTranslate = textToTranslate;
    }

    /* TODO think about that problem
    * What if we don't know which is the language from which we would like to translate?
    * Yandex has the possibility to translate to a certain language even if the starting language is
    * not known `api.translationApi().translate("Hola, mundo!", Language.FR).text()`
    * Below a possible solution
    *
        String key = TranslateKeyStore.getInstance().retrieveYandexKey();
        YTranslateApi yandexApi = new YTranslateApiImpl(key);
        com.github.vbauer.yta.model.Language adaptedTo = YandexLangConverter.getConverter().get(to).convert();
        com.github.vbauer.yta.model.Language adaptedFrom = null

        Translation translation = null
        if (from != null) {
            adaptedFrom = YandexLangConverter.getConverter().get(from).convert();
            translation = yandexApi.translationApi()
                .translate(textToTranslate,Direction.of(adaptedFrom, adaptedTo));
        } else {
            translation = yandexApi.translationApi()
                .translate(Direction.of(textToTranslate, adaptedTo));
        }


        YandexResult res = new YandexResult
                .Builder()
                .withTranslation(translation.text())
                .build();

        // TODO call the original library and do the query!
        return res;
    *
    */
    @Override
    public ITranslationResult runQuery() {

        String key = TranslateKeyStore.getInstance().retrieveYandexKey();
        YTranslateApi yandexApi = new YTranslateApiImpl(key);
        com.github.vbauer.yta.model.Language adaptedFrom = YandexLangConverter.getConverter().get(from).convert();
        com.github.vbauer.yta.model.Language adaptedTo = YandexLangConverter.getConverter().get(to).convert();

        Translation translation = yandexApi.translationApi()
                .translate(
                        textToTranslate,
                        Direction.of(adaptedFrom, adaptedTo)
                );

        YandexResult res = new YandexResult
                .Builder()
                .withTranslation(translation.text())
                .build();

        // TODO call the original library and do the query!
        return res;
    }

    public static class Builder implements ITranslationQuery.Builder {

        private Language from = null;
        private Language to = null;
        private String textToTranslate = null;

        @Override
        public Builder from(Language from) {

            this.from = from;
            return this;
        }

        @Override
        public Builder to(Language to) {

            this.to = to;
            return this;
        }

        @Override
        public Builder withText(String textToTranslate) {

            this.textToTranslate = textToTranslate;
            return this;
        }

        @Override
        public YandexQuery build() {

            return new YandexQuery(
                    from,
                    to,
                    textToTranslate
            );
        }


    }
}

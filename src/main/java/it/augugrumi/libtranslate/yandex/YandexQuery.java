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

    @Override
    public ITranslationResult runQuery() {

        String key = TranslateKeyStore.getIstance().retrieveYandexKey();
        Translation translation;
        YTranslateApi yandexApi = new YTranslateApiImpl(key);
        com.github.vbauer.yta.model.Language adaptedTo =
                YandexLangConverter.getConverter().get(to).convert();
        if (from != null) {
            com.github.vbauer.yta.model.Language adaptedFrom =
                    YandexLangConverter.getConverter().get(from).convert();
            translation = yandexApi.translationApi()
                    .translate(
                            textToTranslate,
                            Direction.of(adaptedFrom, adaptedTo)
                    );
        } else {
            translation = yandexApi.translationApi()
                    .translate(
                            textToTranslate,
                            adaptedTo
                    );
        }

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

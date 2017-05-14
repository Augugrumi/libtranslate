package it.augugrumi.libtranslate.yandex;

import it.augugrumi.libtranslate.conctract.ITranslationQuery;
import it.augugrumi.libtranslate.conctract.ITranslationResult;
import it.augugrumi.libtranslate.util.TranslateKeyStore;

/**
 * Created by davide on 14/05/17.
 */
public class YandexQuery implements ITranslationQuery {

    private String from = null;
    private String to = null;
    private String textToTranslate = null;

    private YandexQuery (
            String from,
            String to,
            String textToTranslate
    ) {
        this.from = from;
        this.to = to;
        this.textToTranslate = textToTranslate;
    }

    @Override
    public ITranslationResult runQuery() {

        String key = TranslateKeyStore.getIstance().retrieveYandexKey();

        // TODO call the original library and do the query!
        return null;
    }

    public static class Builder implements ITranslationQuery.Builder {

        private String from = null;
        private String to = null;
        private String textToTranslate = null;

        @Override
        public Builder from(String from) {

            this.from = from;
            return this;
        }

        @Override
        public Builder to(String to) {

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

package it.augugrumi.libtranslate.yandex;

import it.augugrumi.libtranslate.conctract.ITranslationResult;

/**
 * Created by davide on 14/05/17.
 */
public class YandexResult implements ITranslationResult {

    private String translation = null;

    private YandexResult (String translation) {

        this.translation = translation;
    }

    @Override
    public String getTranslation() {
        return translation;
    }

    public static class Builder {

        private String translation = null;

        public Builder withTranslation (String translation) {
            this.translation = translation;
            return this;
        }

        public YandexResult build() {
            return new YandexResult(
                    translation
            );
        }
    }
}

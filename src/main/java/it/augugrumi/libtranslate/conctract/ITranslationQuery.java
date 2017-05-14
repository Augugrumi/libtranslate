package it.augugrumi.libtranslate.conctract;

/**
 * Created by davide on 14/05/17.
 */
public interface ITranslationQuery {

    ITranslationResult runQuery ();

    interface Builder {

        Builder from(Language from);
        Builder to(Language to);
        Builder withText(String textToTranslate);

        ITranslationQuery build();
    }
}

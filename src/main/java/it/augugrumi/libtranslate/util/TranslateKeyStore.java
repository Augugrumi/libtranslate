package it.augugrumi.libtranslate.util;

/**
 * Created by davide on 14/05/17.
 */

// TODO think if it makes sense using "synchronized" in this singleton
public class TranslateKeyStore {

    private static TranslateKeyStore singleton = null;

    private String yandexKey = null;

    private TranslateKeyStore() {}

    // Setters
    public synchronized void saveYandexKey (String key) {

        this.yandexKey = key;
    }

    // Getters
    public synchronized String retrieveYandexKey () {

        return this.yandexKey;
    }


    public static synchronized TranslateKeyStore getInstance() {

        if (singleton == null) {
            singleton = new TranslateKeyStore();
        }

        return singleton;
    }
}
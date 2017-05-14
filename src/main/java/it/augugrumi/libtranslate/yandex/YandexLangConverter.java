package it.augugrumi.libtranslate.yandex;

import it.augugrumi.libtranslate.conctract.ILangAdapter;
import it.augugrumi.libtranslate.conctract.ILangConverter;
import it.augugrumi.libtranslate.conctract.Language;
import it.augugrumi.libtranslate.conctract.NoSuchLanguageException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by davide on 14/05/17.
 */
public class YandexLangConverter implements ILangAdapter<Language, ILangConverter<com.github.vbauer.yta.model.Language>> {

    private static final Map<Language, ILangConverter<com.github.vbauer.yta.model.Language>> converter = new HashMap<>();

    static {
        converter.put(Language.af, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.AF;
            }
        });

        converter.put(Language.am, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.ar, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.AR;
            }
        });

        converter.put(Language.az, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.AZ;
            }
        });

        converter.put(Language.ba, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.BA;
            }
        });

        converter.put(Language.be, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.BE;
            }
        });

        converter.put(Language.bg, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.BG;
            }
        });

        converter.put(Language.bn, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.bs, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.BS;
            }
        });

        converter.put(Language.ca, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.CA;
            }
        });

        converter.put(Language.ceb, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.cs, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.CS;
            }
        });

        converter.put(Language.cy, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.CY;
            }
        });

        converter.put(Language.da, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.DA;
            }
        });

        converter.put(Language.de, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.DE;
            }
        });

        converter.put(Language.el, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.EL;
            }
        });

        converter.put(Language.enUK, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.EN;
            }
        });

        converter.put(Language.enUS, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.eo, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.es, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.ES;
            }
        });

        converter.put(Language.et, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.ET;
            }
        });

        converter.put(Language.eu, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.EU;
            }
        });

        converter.put(Language.fa, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.FA;
            }
        });

        converter.put(Language.fi, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.FI;
            }
        });

        converter.put(Language.fr, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.FR;
            }
        });

        converter.put(Language.ga, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.GA;
            }
        });

        converter.put(Language.gd, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.gl, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.GL;
            }
        });

        converter.put(Language.gu, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.he, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.HE;
            }
        });

        converter.put(Language.hi, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.hr, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.HR;
            }
        });

        converter.put(Language.ht, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.HT;
            }
        });

        converter.put(Language.hu, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.HU;
            }
        });

        converter.put(Language.hy, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.HY;
            }
        });

        converter.put(Language.id, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.ID;
            }
        });

        converter.put(Language.is, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.IS;
            }
        });

        converter.put(Language.it, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.IT;
            }
        });

        converter.put(Language.ja, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.JA;
            }
        });

        converter.put(Language.jv, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.ka, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.KA;
            }
        });

        converter.put(Language.kk, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.KK;
            }
        });

        converter.put(Language.km, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.kn, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.ko, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.KO;
            }
        });

        converter.put(Language.ky, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.KY;
            }
        });

        converter.put(Language.la, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.LA;
            }
        });

        converter.put(Language.lb, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.lo, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.lt, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.LT;
            }
        });

        converter.put(Language.lv, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.LV;
            }
        });

        converter.put(Language.mg, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.MG;
            }
        });

        converter.put(Language.mhr, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.mi, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.mk, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.MK;
            }
        });

        converter.put(Language.ml, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.mn, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.MN;
            }
        });

        converter.put(Language.mr, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.mrj, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.ms, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.MS;
            }
        });

        converter.put(Language.mt, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.MT;
            }
        });

        converter.put(Language.my, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.ne, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.nl, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.NL;
            }
        });

        converter.put(Language.no, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.NO;
            }
        });

        converter.put(Language.pa, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.pap, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.pl, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.PL;
            }
        });

        converter.put(Language.pt, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.PT;
            }
        });

        converter.put(Language.ro, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.RO;
            }
        });

        converter.put(Language.ru, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.RU;
            }
        });

        converter.put(Language.si, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.sk, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.SK;
            }
        });

        converter.put(Language.sl, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.SL;
            }
        });

        converter.put(Language.sq, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.SQ;
            }
        });

        converter.put(Language.sr, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.SR;
            }
        });

        converter.put(Language.su, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.sv, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.SV;
            }
        });

        converter.put(Language.sw, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.SW;
            }
        });

        converter.put(Language.ta, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.te, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.tg, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.TG;
            }
        });

        converter.put(Language.th, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.TH;
            }
        });

        converter.put(Language.tl, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.TL;
            }
        });

        converter.put(Language.tr, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.TR;
            }
        });

        converter.put(Language.tt, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.TT;
            }
        });

        converter.put(Language.udm, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.uk, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.UK;
            }
        });

        converter.put(Language.ur, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.uz, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.UZ;
            }
        });

        converter.put(Language.vi, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.VI;
            }
        });

        converter.put(Language.xh, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.yi, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                throw new NoSuchLanguageException();
            }
        });

        converter.put(Language.zh, new ILangConverter<com.github.vbauer.yta.model.Language>() {
            @Override
            public com.github.vbauer.yta.model.Language convert() throws NoSuchLanguageException {
                return com.github.vbauer.yta.model.Language.ZH;
            }
        });
    }

    private YandexLangConverter () {}


    public static Map<Language, ILangConverter<com.github.vbauer.yta.model.Language>> getConverter() {
        return converter;
    }
}

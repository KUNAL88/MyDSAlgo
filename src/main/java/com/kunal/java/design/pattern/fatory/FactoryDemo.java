package com.kunal.java.design.pattern.fatory;

import java.text.NumberFormat;
import java.util.Calendar;

/*Example of factory design pattern
 private static NumberFormat getInstance(LocaleProviderAdapter adapter,
                                            Locale locale, int choice) {
        NumberFormatProvider provider = adapter.getNumberFormatProvider();
        NumberFormat numberFormat = null;
        switch (choice) {
        case NUMBERSTYLE:
            numberFormat = provider.getNumberInstance(locale);
            break;
        case PERCENTSTYLE:
            numberFormat = provider.getPercentInstance(locale);
            break;
        case CURRENCYSTYLE:
            numberFormat = provider.getCurrencyInstance(locale);
            break;
        case INTEGERSTYLE:
            numberFormat = provider.getIntegerInstance(locale);
            break;
        }
 */
public class FactoryDemo {

    public static void main(String[] args) {

        int type=1;

        new PetFactory()
                .getPetInstance(type)
                .displayPetName();
    }
}

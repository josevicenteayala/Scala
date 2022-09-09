package basics.scala.fundamentals.immutable;

import java.util.Currency;
import java.util.Locale;


public final class Country {
    private final String name;
    private final Currency currency;

    Country(String name, Currency currency) {
        this.name = name;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public static void main(String[] args) {
        Country canada = new Country("Canada", Currency.getInstance(Locale.CANADA));
        System.out.println(canada.getName());
        System.out.println(canada.getCurrency());
    }
}

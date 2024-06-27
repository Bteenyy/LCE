package config;

import org.aeonbits.owner.Config;

public interface WebConfig extends Config {
    @DefaultValue("https://market.yandex.ru/")
    String getBaseUrl();

    @DefaultValue("20000")
    String getPrice();

    @DefaultValue("3")
    String getDiagonal();

    @DefaultValue("Сотовые телефоны")
    String getSearchItem();

    @DefaultValue("8")
    String getExpectedNumberOfElements();
}

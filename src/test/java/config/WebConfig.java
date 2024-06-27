package config;

import org.aeonbits.owner.Config;

public interface WebConfig extends Config {
    @DefaultValue("20000")
    String getPrice();

    @DefaultValue("3")
    String getDiagonal();

    @DefaultValue("Сотовые телефоны")
    String getSearchItem();

    @DefaultValue("24")
    String getExpectedNumberOfElements();
}

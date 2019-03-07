package com.spring.quickstart.quickstart;

import java.util.List;

public class Metting {
    private String theme;
    private List<Boss>bosses;

    public Metting(String theme, List<Boss> bosses) {
        this.theme = theme;
        this.bosses = bosses;
    }

    public Metting() {
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }

    @Override
    public String toString() {
        return "Metting{" +
                "theme='" + theme + '\'' +
                ", bosses=" + bosses +
                '}';
    }
}

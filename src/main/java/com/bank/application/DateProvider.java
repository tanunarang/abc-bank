package com.bank.application;

import java.util.Calendar;
import java.util.Date;

public enum DateProvider {
    INSTANCE;

    Date now() {
        return Calendar.getInstance().getTime();
    }
}

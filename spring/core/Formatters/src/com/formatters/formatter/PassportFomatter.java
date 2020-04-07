package com.formatters.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.formatters.beans.Passport;

public class PassportFomatter implements Formatter<Passport> {

	@Override
	public Passport parse(String text, Locale locale) throws ParseException {
		Passport passport = new Passport();
		passport.setUid(text.substring(0, text.indexOf("-")));
		passport.setIssuedAuthorityCode(text.substring(text.indexOf("-") + 1, text.length()));
		return passport;
	}

	@Override
	public String print(Passport passport, Locale locale) {
		return passport.getUid() + "-" + passport.getIssuedAuthorityCode();
	}

}

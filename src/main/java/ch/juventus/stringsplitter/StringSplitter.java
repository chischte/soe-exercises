package ch.juventus.stringsplitter;

import ch.juventus.logging.BankAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringSplitter {

    final Logger logger = LoggerFactory.getLogger(StringSplitter.class);

    public char getFirstChar(String word) {
        char firstChar = word.charAt(0);
        logger.info("Got first char of {} result: {}", word, firstChar);
        return firstChar;
    }

}

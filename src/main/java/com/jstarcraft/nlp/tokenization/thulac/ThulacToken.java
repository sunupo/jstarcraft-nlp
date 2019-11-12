package com.jstarcraft.nlp.tokenization.thulac;

import java.util.Iterator;

import com.jstarcraft.nlp.tokenization.NlpToken;

import io.github.yizhiru.thulac4j.term.TokenItem;

/**
 * THULAC词元
 * 
 * @author Birdy
 *
 */
public class ThulacToken implements Iterable<ThulacToken>, Iterator<ThulacToken>, NlpToken {

    private Iterator<TokenItem> iterator;

    private String text;

    private String word;

    private int begin;

    private int end;

    public ThulacToken(Iterator<TokenItem> iterator, String text) {
        this.iterator = iterator;
        this.text = text;
    }

    @Override
    public Iterator<ThulacToken> iterator() {
        return this;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public ThulacToken next() {
        TokenItem item = iterator.next();
        word = item.word;
        begin = text.indexOf(word, end);
        end = begin + word.length();
        return this;
    }

    @Override
    public String getTerm() {
        return word;
    }

    @Override
    public int getBegin() {
        return begin;
    }

    @Override
    public int getEnd() {
        return end;
    }

}

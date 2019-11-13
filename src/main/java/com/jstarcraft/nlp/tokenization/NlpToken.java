package com.jstarcraft.nlp.tokenization;

/**
 * NLP词元
 * 
 * @author Birdy
 *
 */
public interface NlpToken {

    /**
     * 获取词项
     * 
     * @return
     */
    String getTerm();

    /**
     * 获取开始位置
     * 
     * @return
     */
    int getBegin();

    /**
     * 获取结束位置
     * 
     * @return
     */
    int getEnd();

}

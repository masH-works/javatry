package org.docksidestage.bizfw.basic.objanimal;

import org.docksidestage.bizfw.basic.objanimal.runner.SlowRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author masH
 *
 */
public class Cow extends Animal implements SlowRunner {
    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(Cow.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private String word = "mo-";// as a default.

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public Cow() {
        //        Animal()
    }

    @Override
    protected String getBarkWord() {
        return word;
    }

    public void run() {
        logger.debug("...walking");
    }

}

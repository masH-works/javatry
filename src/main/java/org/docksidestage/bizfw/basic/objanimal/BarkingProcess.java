package org.docksidestage.bizfw.basic.objanimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author masH
 */
public class BarkingProcess {
    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Logger logger = LoggerFactory.getLogger(BarkingProcess.class);

    // ===================================================================================
    //                                                                           attribute
    //                                                                           =========    
    private final Animal animal;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BarkingProcess(Animal animal) {
        this.animal = animal;
    }

    public BarkedSound bark() {
        breatheIn();
        prepareAbdominalMuscle();
        String barkWord = animal.getBarkWord();
        BarkedSound barkedSound = doBark(barkWord);
        return barkedSound;
    }

    protected void prepareAbdominalMuscle() {
        logger.debug("...Using my abdominal muscle"); // dummy implementation
        animal.downHitPoint();
    }

    protected void breatheIn() {
        logger.debug("...Breathing in"); // dummy implementation
        animal.downHitPoint();
    }

    protected BarkedSound doBark(String barkWord) {
        animal.downHitPoint();
        return new BarkedSound(barkWord);
    }
}

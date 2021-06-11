package org.docksidestage.bizfw.basic.objanimal;

import static org.docksidestage.bizfw.basic.objanimal.BarkingProcess.logger;

public class ZombieBarkingProcess extends BarkingProcess {

    // ===================================================================================
    //                                                                           attribute
    //                                                                           =========    
    protected final Zombie zombie;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ZombieBarkingProcess(Zombie zombie) {
        super(zombie);
        this.zombie = zombie;
    }

    //    @Override
    //    public BarkedSound bark() {
    //        // breatheIn()だけでよい
    //        breatheIn();
    //        prepareAbdominalMuscle();
    //        String barkWord = zombie.getBarkWord();
    //        BarkedSound barkedSound = doBark(barkWord);
    //        return barkedSound;
    //    }

    @Override
    protected void breatheIn() {
        logger.debug("...Breathing in"); // dummy implementation
        animal.downHitPoint();
        this.zombie.getZombieDiary().countBreatheIn();
    }
}

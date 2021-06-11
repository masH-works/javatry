package org.docksidestage.bizfw.basic.objanimal;

/* 
 * @author masH
 */
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

    //    way of past
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
        super.breatheIn();
        this.zombie.getZombieDiary().countBreatheIn();
    }
}

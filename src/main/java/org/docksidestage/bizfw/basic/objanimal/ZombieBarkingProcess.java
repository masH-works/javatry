package org.docksidestage.bizfw.basic.objanimal;

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

    @Override
    public BarkedSound bark() {
        breatheIn();
        this.zombie.getZombieDiary().countBreatheIn();
        prepareAbdominalMuscle();
        String barkWord = zombie.getBarkWord();
        BarkedSound barkedSound = doBark(barkWord);
        return barkedSound;
    }
}

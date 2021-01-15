package org.docksidestage.bizfw.basic.objanimal;

public class CannotRunFastAnimal extends Animal {
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private String word = "mo-";// as a default.

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CannotRunFastAnimal() {
        hitPoint = getInitialHitPoint();
    }

    @Override
    protected String getBarkWord() {
        return word;
    }

}

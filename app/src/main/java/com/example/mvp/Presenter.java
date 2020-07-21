package com.example.mvp;

public class Presenter {
    public enum ButtonIndex {FIRST, SECOND, THIRD}

    private Model mModel;
    private MainView view;

    public Presenter(MainView view) {
        this.mModel = new Model();
        this.view = view;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(ButtonIndex index) {
        int newModelValue;
        switch (index) {
            case FIRST:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                view.setButtonText(ButtonIndex.FIRST, newModelValue);
                break;
            case SECOND:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                view.setButtonText(ButtonIndex.SECOND, newModelValue);
                break;
            case THIRD:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                view.setButtonText(ButtonIndex.THIRD, newModelValue);
                break;
        }
    }

}

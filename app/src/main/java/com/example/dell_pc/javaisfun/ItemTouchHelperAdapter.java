package com.example.dell_pc.javaisfun;

/**
 * Created by Alfredo on 04/08/2017.
 */

public interface ItemTouchHelperAdapter {

    void onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);
}

package com.cenxui.mybatis.domain.first;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by cenxui on 4/27/17.
 */
public class PlayerProcessor implements ItemProcessor<Player, Player> {
    @Override
    public Player process(Player player) throws Exception {
        System.out.println("process : " + player);
        return player;
    }
}

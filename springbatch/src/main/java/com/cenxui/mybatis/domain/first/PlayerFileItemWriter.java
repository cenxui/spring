package com.cenxui.mybatis.domain.first;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

/**
 * Created by cenxui on 4/27/17.
 */
@Component
public class PlayerFileItemWriter implements ItemWriter {

    @Autowired
    private FlatFileItemWriter writer;

    @Override
    public void write(List list) throws Exception {
        Logger.getLogger(PlayerFileItemWriter.class.getName()).info(list.toString());
        writer.write(list);
    }
}

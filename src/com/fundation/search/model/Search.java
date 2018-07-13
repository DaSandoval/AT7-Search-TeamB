/*
 * @(#)Asset.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package com.fundation.search.model;

import java.io.File;
import java.util.StringJoiner;

/**
 * This class Asset can be FileResult, MultimediaResult and maybe SearchFolder.
 *
 * @author Ana Maria Mamani Zenteno - AT-[07].
 * @version 1.0.
 */
public class Search {

    /**
     * Method that search.
     *
     * @param path
     * @return
     */
    public String searchPath(String path) {
        File folder = new File(path);
        File[] listFolder = folder.listFiles();
        StringJoiner result = new StringJoiner("\n");
        for (int i = 0; i < (listFolder.length - 1); i++) {
            if (listFolder[i].isFile()) {
                result.add(listFolder[i].getName());
            }
        }
        return result.toString();
    }
}

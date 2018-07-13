package com.fundation.search.utils;

/*
 * @(#)Validator.java
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

import java.io.File;
import java.util.regex.Pattern;

/**
 * This class Validatos can be FileResult, MultimediaResult and maybe SearchFolder.
 *
 * @author Daniel Sandoval - AT-[07].
 * @version 1.0.
 */

public class Validator {
    /**
     * Verify if is a path valid.
     *
     * @param isPath this is a direction of the file.
     * @return true y false.
     */
    public boolean isToPath(String isPath) {
        File file = new File(isPath);
        return file.isAbsolute() && file.isDirectory();
    }

    /**
     * Verify this is a file in the directory of a path.
     *
     * @param fileExist this is a direction of a file.
     * @return true o false.
     */
    public boolean isToFile(String fileExist) {
        File file = new File(fileExist);
        if (file.exists()) {
            System.out.println(fileExist);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verify that the file this is audio of different format.
     *
     * @param typeOfFile this is the direction of a file.
     * @param extend     this  is extend of a file of audio, movi, text and others.
     * @return true o false.
     */
    public boolean isFileOfAudio(String typeOfFile, String extend) {
        String[] formato = typeOfFile.split(Pattern.quote("."));
        for (int i = 0; i < formato.length; i++)
            if (formato[i].equalsIgnoreCase(extend)) {
                return true;
            }
        return false;
    }

    /**
     * Verify if is a number the date insert.
     *
     * @param cadena this is a numbrer or string or chracter or others values.
     * @return true o fasle.
     */
    public boolean isNumberValid(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
}

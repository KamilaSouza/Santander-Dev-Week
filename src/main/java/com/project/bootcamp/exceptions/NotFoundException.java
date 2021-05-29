package com.project.bootcamp.exceptions;

import com.project.bootcamp.utilities.MessageUtilities;

public class NotFoundException extends RuntimeException {

    public NotFoundException(){
        super(MessageUtilities.NO_RECORDS_FOUND);
    }
}

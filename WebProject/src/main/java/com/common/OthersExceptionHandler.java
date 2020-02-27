package com.common;

import egovframework.rte.fdl.cmmn.exception.handler.ExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OthersExceptionHandler implements ExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(OthersExceptionHandler.class);

    public void occur(Exception exception, String packageName) {
    	//log.debug(" EgovServiceExceptionHandler run...............");
    	LOGGER.error(packageName, exception);
    }
}

package com.shanzhu.cm.common.exception;

/**
 * 文件后缀无效异常，用于文件校验
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
public class InvalidExtensionException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidExtensionException() {
    }

    public InvalidExtensionException(String message) {
        super(message);
    }

}

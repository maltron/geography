package net.nortlam.geography.error;

/**
 *
 * @author Mauricio "Maltron" Leal <maltron@gmail.com> */
public class ServerInternalErrorException extends Exception {

    public ServerInternalErrorException() {
    }

    public ServerInternalErrorException(String message) {
        super(message);
    }

    public ServerInternalErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServerInternalErrorException(Throwable cause) {
        super(cause);
    }

    public ServerInternalErrorException(String message, Throwable cause, 
                            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

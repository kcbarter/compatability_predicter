package exceptions;

import java.io.FileNotFoundException;

/**
 * Custom exception class
 */
public class FileNotFound extends FileNotFoundException {
  /**
   * Constructor for the File not found
   * @param message error message being passed to the super exception class.
   */
  public FileNotFound(String message){
    super(message);
  }
}

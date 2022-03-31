package exceptions;

import java.io.FileNotFoundException;

public class FileNotFound extends FileNotFoundException {
  /**
   * Constructor for the File not found
   * @param message error message being passed to the super exception class.
   */
  public FileNotFound(String message){
    super(message);
  }
}

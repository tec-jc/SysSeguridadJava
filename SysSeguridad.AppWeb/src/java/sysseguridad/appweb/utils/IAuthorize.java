package sysseguridad.appweb.utils;

import java.io.IOException;
import javax.servlet.ServletException;

public interface IAuthorize {
    void authorize() throws ServletException, IOException;
}


package sysseguridad.appdesktop.utils;

// Esta clase se utilizara para almacenar en la cache los datos de usuario que  inicio sesion
public class UsuarioAutorizado {

    private static int id;
    private static String login;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        UsuarioAutorizado.id = id;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        UsuarioAutorizado.login = login;
    }
}

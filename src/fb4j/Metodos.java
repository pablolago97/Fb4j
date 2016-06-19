package fb4j;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Media;
import java.io.File;
import java.net.MalformedURLException;

/**
 *
 * @author Pablo Lago-Bergón Pazos
 */
public class Metodos {
    
    Facebook facebook = new FacebookFactory().getInstance();
    
    /**
     * Postea el 'String' recibido en el JTextField
     * @param estado recibe dicho 'String'
     * @throws FacebookException lanza excepción
     */
    public void publicarEstado (String estado) throws FacebookException{
        facebook.postStatusMessage(estado);
    }
    
    /**
     * Se introduce la 'ID' de un post  y se recoge en un 'String' para su posterior 'like'
     * @param idpost recibe dicho 'String'
     * @throws FacebookException lanza excepción
     */
    public void darLike (String idpost) throws FacebookException{
        facebook.likePost(idpost);
    }
    
    /**
     * Se introduce la 'ID' de un post  y se recoge en un 'String' para su posterior 'like'
     * @param idpost recibe dicho 'String'
     * @throws FacebookException lanza excepción
     */
    public void darUnLike (String idpost) throws FacebookException{
        facebook.unlikePost(idpost);
    }
    
    /**
     * Comenta un 'post' de 'facebook' del 'id' que le pasemos
     * @param idPost recibe una 'ID' como 'String'
     * @param comentario recibe el comentario como una 'String'
     * @throws FacebookException lanza excepción
     */
    public void comentarPost (String idPost, String comentario) throws FacebookException{
        facebook.commentPost(idPost, comentario);
    }
    
    /**
     * Postea una foto de Internet en 'Facebook' (Es necesario el link)
     * @param rutaFoto recoge un 'String' con la foto
     * @param comentario recibe un String con el comentario a postear
     * @throws FacebookException lanza excepción
     * @throws MalformedURLException lanza excepción
     */
    public void publicarImagen (String rutaFoto, String comentario) throws FacebookException, MalformedURLException{
        Media img = new Media(new File(rutaFoto));
        facebook.postPhoto(img);
        
    }
    
}

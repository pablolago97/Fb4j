package facebook4j;

import java.io.File;
import java.net.MalformedURLException;

/**
 *
 * @author galle
 */
public class Metodos {
    
    Facebook facebook = new FacebookFactory().getInstance();
    
    /**
     * Este metodo postea en facebook lo recibido en el String estado.
     * @param estado recibe un String con el estado a publicar.
     * @throws FacebookException 
     */
    public void publicarEstado (String estado) throws FacebookException{
        facebook.postStatusMessage(estado);
    }
    
    /**
     * Este metodo da like en facebook a un post si a idpost le damos como valor del post.
     * @param idpost recibe un String con el id del post que va a dar like.
     * @throws FacebookException 
     */
    public void darLike (String idpost) throws FacebookException{
        facebook.likePost(idpost);
    }
    
    /**
     * Este metodo da unlike en facebook a un post si a idpost le damos como valor del post.
     * @param idpost recibe un String con el id del post que va a dar unlike.
     * @throws FacebookException 
     */
    public void darUnLike (String idpost) throws FacebookException{
        facebook.unlikePost(idpost);
    }
    
    /**
     * Comenta un post de facebook con el valor del String "comentario" que tenga como id el String "idPost". 
     * @param idPost recibe un String con el id del post que va a comentar.
     * @param comentario recibe un String con el comentario a comentar.
     * @throws FacebookException 
     */
    public void comentarPost (String idPost, String comentario) throws FacebookException{
        facebook.commentPost(idPost, comentario);
    }
    
    /**
     * Postea una foto en facebook que se encuentre en la ruta del valor del String "rutaFoto"
     * @param rutaFoto recibe un String con la ruta donde se encuentra la foto a postear.
     * @param comentario recibe un String con el comentario a postear. No se usa actualmente porque no he sido capaz de postear la foto con el comentario.
     * @throws FacebookException
     * @throws MalformedURLException 
     */
    public void publicarImagen (String rutaFoto, String comentario) throws FacebookException, MalformedURLException{
        Media img = new Media(new File(rutaFoto));
        facebook.postPhoto(img);
        //facebook.postPhoto(comentario, img);
    }
    
}

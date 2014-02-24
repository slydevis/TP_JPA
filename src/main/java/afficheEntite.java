import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by guillaume on 24/02/14.
 */
public class afficheEntite {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestionPedaPU");
        EntityManager em = emf.createEntityManager();

        Etudiant et = em.find(Etudiant.class,1106);

        System.out.println( et.toString());
    }
}

package lucas.padroescriaconais.abstractFactory.exemplo2;

/**
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public interface DaoFactory {
    
    UserDaoMysql getUserDao();
    JobDaoMysql getJobDao();
    
}
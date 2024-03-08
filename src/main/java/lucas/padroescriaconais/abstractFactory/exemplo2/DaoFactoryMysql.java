package lucas.padroescriaconais.abstractFactory.exemplo2;

/**
 *
 * @author lucas campestrini <lucas.campestrini@gmail.com>
 */
public class DaoFactoryMysql implements DaoFactory{

    @Override
    public UserDaoMysql getUserDao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public JobDaoMysql getJobDao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

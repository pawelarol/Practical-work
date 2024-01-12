import java.sql.SQLException;

public interface WalletDao {
     Long saveWallet(Wallet wallet) throws SQLException;

}

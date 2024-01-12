import java.sql.*;
import java.time.LocalDateTime;

public class WalletImpl implements WalletDao{

 private static final String INSERT_TRANSFER = "INSERT INTO public.wallet(" +
         "transfer_id, transfer_date, all_money," +
         "come_money, out_money, net_profit) " +
         "VALUES (?, ?, ?, ?, ?, ?);";

    private Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    Config.getProperties(Config.DB_URL),
                    Config.getProperties(Config.DB_LOGIN),
                    Config.getProperties(Config.DB_PASSWORD));
            return con;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
    @Override
    public Long saveWallet(Wallet wallet) {
        long result = -1L;
        try(Connection con = getConnection();
            PreparedStatement stmt = con.prepareStatement(INSERT_TRANSFER, new String[]{"transfer_id_table"})){
            stmt.setLong(1,wallet.getTransferId());
            stmt.setTimestamp(2, Timestamp.valueOf(LocalDateTime.now()));
            stmt.setInt(3,wallet.getAllMoney());
            stmt.setInt(4,wallet.getComeMoney());
            stmt.setInt(5,wallet.getOutMoney());
            stmt.setInt(6,wallet.getNetProfit());
            stmt.executeUpdate();
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if(generatedKeys.next()){
                result = generatedKeys.getLong(1);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return result;
    }
}

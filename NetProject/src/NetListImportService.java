import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class NetListImportService {
        private NetworkListImporter importer;
        private DatabaseConnector connector;

        public NetListImportService() {
            importer = new NetworkListImporter();
            connector = new DatabaseConnector();
        }

        public void importNetList(String filePath) throws SQLException {
            // Логика импорта сетевого списка из указанного файла
            List<NetworkItem> networkList = importer.importFromFile(filePath);

            // Сохранение сетевого списка в базу данных
            connector.connect();
            // connector.saveNetworkList();
            //connector.disconnect();
        }

        public static void main(String[] args) throws SQLException {
            NetListImportService service = new NetListImportService();
            service.importNetList("netlist.txt");
        }
    }

     class NetworkListImporter {
        public List<NetworkItem> importFromFile(String filePath) {
            // Логика чтения сетевого списка из файла и преобразования в объекты NetworkItem
            List<NetworkItem> networkList = new ArrayList<>();

            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
               String line;
               while((line = reader.readLine()) != null){
                 // parcing and make new object "NetworkItem
                  NetworkItem item = parseNetworkItem(line);
                  if(item != null){
                      networkList.add(item);
                  }
               }
            } catch (IOException e){
                e.printStackTrace();
            }
            return networkList;
        }
        
        private NetworkItem parseNetworkItem(String line){
            String[] parts = line.split(",");
            if(parts.length == 2){
                String name = parts[0].trim();
                String ipAddress = parts[1].trim();
                return new NetworkItem(name, ipAddress);
            }
            return null;
        }
    }

     class DatabaseConnector {
        public void connect() throws SQLException {
            // Логика подключения к базе данных
            String url = "";
            String login = "";
            String password = "";
            String insertDataQuery = "Name, IpAdress";
            Connection connectDatabase = DriverManager.getConnection(url,login,password);
          //  PreparedStatement preparedStatement = connectDatabase.prepareStatement(insertDataQuery);
        }

        public void saveNetworkList(Connection connection, List<NetworkItem> NetworkList) throws SQLException{
            // Логика сохранения сетевого списка в базу данных
           String query = "INSERT INTO networkList (name, IpAdress) VALUE (?,?)";
           try(PreparedStatement statement = connection.prepareStatement(query)){
               for(NetworkItem item : NetworkList){
                   statement.setString(1,item.getName());
                   statement.setString(2, item.getIpAddress());
                   statement.executeUpdate();
                   connection.close();
                   System.out.println("Disconnect database is done");
               } 
           }
        }

        public void disconnect(Connection connection, List<NetworkItem> NetworkList) throws SQLException {
            // Логика отключения от базы данных
         }
    }

     class NetworkItem {
         private String name;
         private String ipAddress;

         public NetworkItem(String name, String ipAddress) {
         }

         public String getName() {
             return name;
         }

         public void setName(String name) {
             this.name = name;
         }

         public String getIpAddress() {
             return ipAddress;
         }

         public void setIpAddress(String ipAddress) {
             this.ipAddress = ipAddress;
         }

         public Object NetworkItem(String line) {
             String[] data = name.split(",");
             if (data.length != 2) {
                 return null;
             }

             String name = data[0].trim();
             String ipAddress = data[1].trim();
             return new NetworkItem(name, ipAddress);
         }
     }
        


